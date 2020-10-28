package com.lhy.demo191218.thread.service;

import com.lhy.demo191218.thread.dao.BrokerOtcConfig;
import com.lhy.demo191218.thread.dao.BrokerOtcConfigExample;
import com.lhy.demo191218.thread.mapper.BrokerOtcConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadServiceImpl implements ThreadService {

    @Autowired
    private BrokerOtcConfigMapper brokerOtcConfigMapper;

    @Override
    public List<BrokerOtcConfig> findAll() {
        BrokerOtcConfigExample brokerOtcConfigExample = new BrokerOtcConfigExample();
        List<BrokerOtcConfig> brokerOtcConfigList = brokerOtcConfigMapper.selectByExample(brokerOtcConfigExample);
        return brokerOtcConfigList;
    }
}
