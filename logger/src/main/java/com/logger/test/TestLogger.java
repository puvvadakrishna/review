package com.logger.test;

import org.springframework.stereotype.Component;

import com.logger.implementation.Logger;
import com.logger.implementation.TargetLogger;

@Component
public class TestLogger {

	TargetLogger log = Logger.getInstance(TestLogger.class);

	public TestLogger() {

		log.debug("Hello testing with Debug!!!!");
		log.info("Hello testing with info!!!!");
		log.error("Hello testing with error!!!!");
	}

}
