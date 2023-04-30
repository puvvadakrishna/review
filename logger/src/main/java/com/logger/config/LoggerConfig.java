package com.logger.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author Rama
 *
 */
@Configuration
public class LoggerConfig {

	@Bean(name = "loggerThreads")
	public Executor billingThreadPoolTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("loggerThreads-");
		executor.initialize();
		return executor;
	}

}
