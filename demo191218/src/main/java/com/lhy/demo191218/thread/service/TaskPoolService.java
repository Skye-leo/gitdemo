package com.lhy.demo191218.thread.service;

import com.lhy.demo191218.thread.dao.TaskPool;
import com.lhy.demo191218.thread.dao.TaskPoolExample;
import com.lhy.demo191218.thread.mapper.TaskPoolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TaskPoolService {

    @Resource
    private TaskPoolMapper taskPoolMapper;

    public void insertSomeTask() {
        for (int i = 0; i<1000; i++){
            TaskPool taskPool = new TaskPool();
            taskPool.setModifyName("caser");
            taskPool.setUpdateTime(new Date());
            taskPool.setStatus(0);
            taskPoolMapper.insert(taskPool);
        }
    }

    public void handleTask(){
        TaskPoolExample taskPoolExample = new TaskPoolExample();
        taskPoolExample.createCriteria().andStatusEqualTo(0);
        taskPoolExample.setOrderByClause();
    }

}
