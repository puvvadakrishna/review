package com.logger.implementation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author Rama
 *
 */
@Component
@ConditionalOnProperty(value = "custom.log.appender", havingValue = "file", matchIfMissing = false)
public class FileLogger extends BaseLogger implements TargetLogger {

	@Override
	public void error(Object msg) {
		if (isError()) {
			// implements FileWriter/ File appender logic
		}
	}

	@Override
	public void debug(Object msg) {
		if (isDebug()) {

			// implements FileWriter/ File appender logic
		}
	}

	@Override
	public void info(Object msg) {
		if (isInfo()) {
			// implements FileWriter/ File appender logic
		}
	}
}
