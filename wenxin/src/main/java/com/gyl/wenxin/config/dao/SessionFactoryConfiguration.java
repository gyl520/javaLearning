package com.gyl.wenxin.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2018/12/2
 * Time 16:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class SessionFactoryConfiguration {
    //mybatis-config.xml配置文件的路径
    @Value("${mybatis_config_file}")
    private String mybatisConfigFilePath;
    //mybatis mapper文件所在路径
    @Value("${mybatis_path}")
    private  String mapperPath;
    //实体类所在的package
    @Value("${entity_package}")
    private String entityPackage;

    private final DataSource dataSource;

    @Autowired
    public SessionFactoryConfiguration(@Qualifier("dataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
       PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
       String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+mapperPath;
       sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
       sqlSessionFactoryBean.setDataSource(dataSource);
       sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
        return sqlSessionFactoryBean;
    }
}
