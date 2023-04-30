package com.logger.implementation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Rama
 *
 */
@Component
@ConditionalOnProperty(value = "custom.log.appender", havingValue = "email", matchIfMissing = false)
public class EmailLogger extends BaseLogger implements TargetLogger {

	@Override
	public void error(Object msg) {
		if (isError()) {
			//implements java/spring email send logic	
		}
	}

	@Override
	public void debug(Object msg) {
		if (isDebug()) {
			//implements java/spring email send logic	
		}
	}

	@Override
	public void info(Object msg) {
		if (isInfo()) {
			//implements java/spring email send logic	
		}
	}
}
