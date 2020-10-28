package com.lhy.demo191218.thread.controller;

import com.lhy.demo191218.thread.dao.BrokerOtcConfig;
import com.lhy.demo191218.thread.service.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThreadDemoController {

    @Autowired
    private ThreadService threadService;

    @GetMapping("/getAllConfig")
    public List<BrokerOtcConfig> getAllConfig(){
        List<BrokerOtcConfig> all = threadService.findAll();
        return all;
    }

}
