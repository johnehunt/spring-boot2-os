package com.jjh.beans;

import com.jjh.logging.LoggingService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

	public MyConfig() {
		System.out.println("MyConfig.<init>()");
	}
	
	@Bean
	public LoggingService loggingService() {
		return new LoggingService();
	}
	
	@Bean(name = "MyDataService")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DataService dataService() {
		return new DataServiceImpl();
	}

//	@Bean("MyService")
//	@Lazy
//	public ExpensiveService expensiveService() {
//		return new ExpensiveService();
//	}

}
