package com.maxlong.study.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Properties;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/6 16:30
 *          类说明
 */
//@Configuration
public class WebJdbcCongfig {

    private static final Logger logger = LoggerFactory.getLogger(WebJdbcCongfig.class);

    @Value("${hikaricp.dataSourceClassName}")
    private String dataSourceClassName;
    @Value("${hikaricp.dataSource.url}")
    private String url;
    @Value("${hikaricp.dataSource.username}")
    private String username;
    @Value("${hikaricp.dataSource.password}")
    private String password;
    @Value("${hikaricp.poolName}")
    private String poolName;
    @Value("${hikaricp.autoCommit}")
    private Boolean autoCommit;
    @Value("${hikaricp.minimumIdle}")
    private int minimumIdle;
    @Value("${hikaricp.maximumPoolSize}")
    private int maximumPoolSize;
    @Value("${hikaricp.connectionTestQuery}")
    private String connectionTestQuery;
    @Value("${hikaricp.connectionTimeout}")
    private Long connectionTimeout;
    @Value("${hikaricp.idleTimeout}")
    private Long idleTimeout;
    @Value("${hikaricp.maxLifetime}")
    private Long maxLifetime;

    @Bean(name="hikariConfig")
    public HikariConfig hikariConfigBean(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setPoolName(poolName);
        hikariConfig.setAutoCommit(autoCommit);
        hikariConfig.setConnectionTestQuery(connectionTestQuery);
        hikariConfig.setConnectionTimeout(connectionTimeout);
        hikariConfig.setIdleTimeout(idleTimeout);
        hikariConfig.setMaxLifetime(maxLifetime);
        hikariConfig.setMaximumPoolSize(maximumPoolSize);
        hikariConfig.setMinimumIdle(minimumIdle);
        hikariConfig.setDataSourceClassName(dataSourceClassName);
        Properties dataSourceProperties = new Properties();
        dataSourceProperties.setProperty("url",url);
        dataSourceProperties.setProperty("user",username);
        dataSourceProperties.setProperty("password",password);
        hikariConfig.setDataSourceProperties(dataSourceProperties);
        return hikariConfig;
    }

    @Bean(name="dataSource")
    public HikariDataSource hikariDataSourceBean(){
        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfigBean());
        return hikariDataSource;
    }

    @Bean(name="jdbcTemplate")
    public JdbcTemplate jdbcTemplateBean(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(hikariDataSourceBean());
        return jdbcTemplate;
    }

}
