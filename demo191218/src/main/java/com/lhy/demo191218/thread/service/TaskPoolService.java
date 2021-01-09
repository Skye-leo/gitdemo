package com.lhy.demo191218.thread.service;

import com.lhy.demo191218.common.PageVO;
import com.lhy.demo191218.thread.dao.TaskPool;
import com.lhy.demo191218.thread.dao.TaskPoolExample;
import com.lhy.demo191218.thread.mapper.TaskPoolMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import javax.annotation.Resource;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class TaskPoolService implements Closeable {

    @Resource
    private TaskPoolMapper taskPoolMapper;

    public void insertSomeTask() {
        for (int i = 0; i < 1000; i++) {
            TaskPool taskPool = new TaskPool();
            taskPool.setModifyName("caser");
            taskPool.setUpdateTime(new Date());
            taskPool.setStatus(0);
            taskPoolMapper.insert(taskPool);
        }
    }

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    public void multiHandle() {
        executorService.execute(() -> {
            handleTask();
        });
        executorService.execute(() -> {
            handleTask();
        });
        executorService.execute(() -> {
            handleTask();
        });
    }


    public void handleTask() {
        System.out.println("我是一个线程");
        while (true) {
            PageVO pageVO = new PageVO();
            pageVO.setPageSize(1);
            pageVO.setPageNumber(0);
            TaskPoolExample taskPoolExample = new TaskPoolExample();
            taskPoolExample.setupPageable(pageVO);
            taskPoolExample.createCriteria().andStatusEqualTo(0);
            taskPoolExample.setOrderByClause("id");
            List<TaskPool> taskPools = taskPoolMapper.selectByExample(taskPoolExample);
            if (!CollectionUtils.isEmpty(taskPools)) {
                TaskPool taskPool = taskPools.get(0);
                taskPool.setStatus(1);
                TaskPoolExample example = new TaskPoolExample();
                example.createCriteria().andIdEqualTo(taskPool.getId()).andUpdateTimeEqualTo(taskPool.getUpdateTime());
                int i = taskPoolMapper.updateByExample(taskPool, example);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }

    @Override
    public void close() throws IOException {
        executorService.shutdown();

        System.out.println("shutdown --");
    }
}
