package project;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Operation extends Hello{
	
	public static float add(float x, float y) {
		logger.info("Result: " + (x + y));
		return x + y;
	}
	
	public static float sub(float x, float y) {
		logger.info("Result: " + (x - y));
		return x - y;
	}
	
	public static float molt(float x, float y) {
		logger.info("Result: " + (x * y));
		return x * y;
	}
	
	public static float div(float x, float y) {
		logger.info("Result: " + (x / y));
		return x / y;
	}

}
