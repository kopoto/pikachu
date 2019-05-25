package com.kopoto.yhh.pikachu.base.config;



import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;
import java.util.Map;


/**
 * 通用dao配置
 */
public abstract class DaoManagement {
    @Autowired
    @Qualifier(DataSourceConfig.BEANNAME_SQLSESSION_COMMON)
    protected SqlSession sqlSessionCommon;

    @Autowired
    @Qualifier(DataSourceConfig.BEANNAME_SQLSESSION_READONLY)
    protected SqlSession sqlSessionReadonly;


    protected String st(String sqlId) {
        return mapper() + "." + sqlId;
    }

    protected abstract String mapper();
}
