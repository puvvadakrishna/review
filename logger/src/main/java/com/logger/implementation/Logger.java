package com.logger.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rama
 *
 */
@Configuration
public class Logger {

	static TargetLogger targetLogger;



	private static String PACKAGE_CONFIGERED;
	@Value("${custom.log.package}")
	public void setPackageName(String packageName) {
		Logger.PACKAGE_CONFIGERED = packageName;
	}

	@Autowired
	public void setTargetLogger(TargetLogger targetLogger) {
		this.targetLogger = targetLogger;
	}

	public static TargetLogger getInstance(Class<?> clazz) {

		String packageName = clazz.getPackageName();
		try {

			if (packageName.contains(PACKAGE_CONFIGERED)) {
				targetLogger.setClassName(clazz.getName());
				return targetLogger;
			} else {
				System.out.println("Configuration miss match, pl correct the package name correctly to get looger!!");
			}
		} catch (Exception e) {
			// debug is error by default
		}

		return null;
	}

}