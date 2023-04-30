package com.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Rama
 *
 */
@SpringBootApplication
@PropertySource("classpath:log.properties")

public class LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
	}

}
