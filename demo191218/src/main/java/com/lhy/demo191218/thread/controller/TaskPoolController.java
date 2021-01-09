package com.lhy.demo191218.thread.controller;

import com.lhy.demo191218.thread.service.TaskPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TaskPoolController {

    @Autowired
    private TaskPoolService taskPoolService;

    @GetMapping("/initTaskData")
    public String initTaskData(){
        taskPoolService.insertSomeTask();
        return "true";
    }

    @GetMapping("/handleTask")
    public String handleTask(){
        taskPoolService.handleTask();
        return "true";
    }

    @GetMapping("/multiHandle")
    public String multiHandle(){
        taskPoolService.multiHandle();
        return "true";
    }
}
