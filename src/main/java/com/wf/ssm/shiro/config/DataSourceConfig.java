package com.wf.ssm.shiro.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import java.sql.SQLException;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    
    @Value("${spring.datasource.url}")
	private String dbUrl;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;

	@Value("${spring.datasource.myapp.initialSize}")
	private int initialSize;

	@Value("${spring.datasource.myapp.minIdle}")
	private int minIdle;

	@Value("${spring.datasource.myapp.maxActive}")
	private int maxActive;

	@Value("${spring.datasource.myapp.maxWait}")
	private int maxWait;
	
	@Value("${spring.datasource.myapp.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;
	
	@Value("${spring.datasource.myapp.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;
	
	@Value("${spring.datasource.myapp.validationQuery}")
	private String validationQuery;
	
	@Value("${spring.datasource.myapp.testWhileIdle}")
	private boolean testWhileIdle;
	
	@Value("${spring.datasource.myapp.testOnBorrow}")
	private boolean testOnBorrow;
	
	@Value("${spring.datasource.myapp.testOnReturn}")
	private boolean testOnReturn;
	
	@Value("${spring.datasource.myapp.filters}")
	private String filters;

	@Bean(name = "dataSource")
	@Primary
	public DataSource testDataSource() {
		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(this.dbUrl);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setDriverClassName(driverClassName);
		// configuration
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxActive(maxActive);
		datasource.setMaxWait(maxWait);
		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		datasource.setValidationQuery(validationQuery);
		datasource.setTestWhileIdle(testWhileIdle);
		datasource.setTestOnBorrow(testOnBorrow);
		datasource.setTestOnReturn(testOnReturn);
		try {
			datasource.setFilters(filters);
		} catch (SQLException e) {
			System.err.println("druid configuration initialization filter:" + e);
			e.printStackTrace();
		}
		return datasource;
	}
}

