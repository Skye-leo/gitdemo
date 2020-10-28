package com.lhy.demo191218.thread.mapper;

import java.util.List;

import com.lhy.demo191218.thread.dao.BrokerOtcConfig;
import com.lhy.demo191218.thread.dao.BrokerOtcConfigExample;
import org.apache.ibatis.annotations.Param;


/**
* @author liuhaoyang
*/
public interface BrokerOtcConfigMapper {
    int countByExample(BrokerOtcConfigExample example);

    int deleteByExample(BrokerOtcConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrokerOtcConfig record);

    int insertSelective(BrokerOtcConfig record);

    BrokerOtcConfig selectOnlyOneByExample(BrokerOtcConfigExample example);

    List<BrokerOtcConfig> selectByExample(BrokerOtcConfigExample example);

    BrokerOtcConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrokerOtcConfig record, @Param("example") BrokerOtcConfigExample example);

    int updateByExample(@Param("record") BrokerOtcConfig record, @Param("example") BrokerOtcConfigExample example);

    int updateByPrimaryKeySelective(BrokerOtcConfig record);

    int updateByPrimaryKey(BrokerOtcConfig record);
}