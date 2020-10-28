package com.lhy.demo191218.thread.mapper;

import com.lhy.demo191218.thread.dao.TaskPool;
import com.lhy.demo191218.thread.dao.TaskPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @author liuhaoyang
*/
public interface TaskPoolMapper{
    int countByExample(TaskPoolExample example);

    int deleteByExample(TaskPoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskPool record);

    int insertSelective(TaskPool record);

    List<TaskPool> selectByExample(TaskPoolExample example);

    TaskPool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskPool record, @Param("example") TaskPoolExample example);

    int updateByExample(@Param("record") TaskPool record, @Param("example") TaskPoolExample example);

    int updateByPrimaryKeySelective(TaskPool record);

    int updateByPrimaryKey(TaskPool record);
}