package com.lhy.demo191218.thread.service;

import com.lhy.demo191218.thread.dao.BrokerOtcConfig;

import java.util.List;

public interface ThreadService {

    List<BrokerOtcConfig> findAll();

}
