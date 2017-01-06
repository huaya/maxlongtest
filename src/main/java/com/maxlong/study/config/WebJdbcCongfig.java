package com.maxlong.study.config;

import com.sand.abacus.jdbc.dao.tx.AbacusTransactionManager;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.sql2o.Sql2o;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/6 16:30
 *          类说明
 */
@Configuration
public class WebJdbcCongfig {

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
        return hikariConfig;
    }

    @Bean(name="dataSource")
    public HikariDataSource hikariDataSourceBean(){
        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfigBean());
        return hikariDataSource;
    }

    @Bean(name="sql2o")
    public Sql2o sql2oBean(){
        Sql2o sql2o = new Sql2o(hikariDataSourceBean());
        return  sql2o;
    }

    @Bean(name="jdbcTemplate")
    public JdbcTemplate jdbcTemplateBean(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(hikariDataSourceBean());
        return jdbcTemplate;
    }

    @Bean(name="transactionManager")
    public AbacusTransactionManager abacusTransactionManagerBean(){
        AbacusTransactionManager abacusTransactionManager = new AbacusTransactionManager();
        abacusTransactionManager.setDataSource(hikariDataSourceBean());
        return abacusTransactionManager;
    }


}
