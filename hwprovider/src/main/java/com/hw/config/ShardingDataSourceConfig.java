package com.hw.config;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.zaxxer.hikari.HikariDataSource;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;
@Configuration
@EnableConfigurationProperties(ShardingMasterSlaveConfig.class)
@Log4j2
@ConditionalOnProperty({"sharding.jdbc.data-sources.ds_master.jdbc-url", "sharding.jdbc.master-slave-rule.master-data-source-name"})
public class ShardingDataSourceConfig {

    @Autowired
    private ShardingMasterSlaveConfig shardingMasterSlaveConfig;

    @Bean
    public DataSource masterSlaveDataSource() throws SQLException {
       // shardingMasterSlaveConfig.getDataSources().forEach((k, v) -> configDataSource(v));
        Map<String, DataSource> dataSourceMap = Maps.newHashMap();
        dataSourceMap.putAll(shardingMasterSlaveConfig.getDataSources());
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, shardingMasterSlaveConfig.getMasterSlaveRule(), Maps.newHashMap());
        log.info("masterSlaveDataSource config complete");
        return dataSource;
    }
	/* 设置连接池
	 * private void configDataSource(HikariDataSource hikariDataSource) {
	 * hikariDataSource.setMaximumPoolSize(60); hikariDataSource.setMinimumIdle(50);
	 * }
	 */

}