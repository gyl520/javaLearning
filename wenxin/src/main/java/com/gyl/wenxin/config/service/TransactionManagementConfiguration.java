package com.gyl.wenxin.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2019/2/24
 * Time 12:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TransactionManagementConfiguration implements TransactionManagementConfigurer{
    @Autowired
    private DataSource dataSource;
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
