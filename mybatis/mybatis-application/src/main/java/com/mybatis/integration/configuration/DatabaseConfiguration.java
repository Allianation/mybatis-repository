package com.mybatis.integration.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource({ "classpath:application.properties" })
@Primary
public class DatabaseConfiguration {
	@Bean(name = "oracleDataSource")
    @ConfigurationProperties("oracle.datasource")
    @Primary
    public HikariDataSource oracleDataSource() {
        return (HikariDataSource) DataSourceBuilder.create().build();
    }

    @Bean(name="oracleTransactionManager")
    @Autowired
    @Primary
    DataSourceTransactionManager oracleTransactionManager(@Qualifier ("oracleDataSource") DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }
}
