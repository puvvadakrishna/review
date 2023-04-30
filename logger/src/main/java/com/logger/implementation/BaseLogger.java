package com.logger.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rama
 *
 */
@Configuration
public class BaseLogger {

	protected String className;

	private boolean debug = false;
	private boolean info = false;
	private boolean error = false;

	@Value("${custom.log.mode}")
	public void setMode(String mode) {
		if ("debug".equalsIgnoreCase(mode)) {
			debug = true;
			info = true;
			error = true;
		} else if ("info".equalsIgnoreCase(mode)) {
			info = true;
			error = true;
		} else if ("error".equalsIgnoreCase(mode)) {
			error = true;
		}
	}

	public BaseLogger(String className) {
		this.className = className;
	}

	public BaseLogger() {
	}

	public boolean isInfo() {
		return info;
	}

	public boolean isDebug() {
		return debug;
	}

	public boolean isError() {
		return error;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}