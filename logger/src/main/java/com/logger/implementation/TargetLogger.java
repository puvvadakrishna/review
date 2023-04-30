package com.logger.implementation;

import org.springframework.scheduling.annotation.Async;

/**
 * @author Rama
 *
 */
public interface TargetLogger {

	@Async("loggerThreads")
	void error(Object msg);

	@Async("loggerThreads")
	void debug(Object msg);

	@Async("loggerThreads")
	void info(Object msg);

	@Async("loggerThreads")
	void setClassName(String name);
}
