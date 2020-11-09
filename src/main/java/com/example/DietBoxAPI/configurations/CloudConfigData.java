package com.example.DietBoxAPI.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.service.common.MysqlServiceInfo;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application-cloud.properties")
public class CloudConfigData {
    @Value("${db.mysql.servicename}")
    private String mysqlServiceName;

    @Bean(name = "dsMysql")
    @Primary
    DataSource mysqlDataSource() {

        CloudFactory cloudFactory = new CloudFactory();
        Cloud cloud = cloudFactory.getCloud();
        MysqlServiceInfo serviceInfo = (MysqlServiceInfo) cloud.getServiceInfo(mysqlServiceName);
        String serviceId = serviceInfo.getId();
        return cloud.getServiceConnector(serviceId, DataSource.class, null);

    }

    @Bean(name = "jdbcMysql")
    @Autowired
    public JdbcTemplate mysqlJdbcTemplate(@Qualifier("dsMysql") DataSource dsSlave) {
        return new JdbcTemplate(dsSlave);
    }
}
