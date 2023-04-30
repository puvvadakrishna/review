package com.logger.implementation;

import java.util.Date;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Rama
 *
 */
@Component
@ConditionalOnProperty(value = "custom.log.appender", havingValue = "console", matchIfMissing = false)
public class ConsoleLogger extends BaseLogger implements TargetLogger {

	@Override
	public void error(Object msg) {
		if (isError()) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + new Date().toString() + " ERROR ["
					+ this.className + "] - " + msg);
		}
	}

	@Override
	public void debug(Object msg) {
		if (isDebug()) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + new Date().toString() + " ERROR ["
					+ this.className + "] - " + msg);
		}
	}

	@Override
	public void info(Object msg) {
		if (isInfo()) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + new Date().toString() + " ERROR ["
					+ this.className + "] - " + msg);
		}
	}

}
