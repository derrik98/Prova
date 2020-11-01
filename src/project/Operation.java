package project;

public class Operation extends Hello{
	
	private final String res = "Result: ";
	
	public static float add(float x, float y) {
		logger.info(res + (x + y));
		return x + y;
	}
	
	public static float sub(float x, float y) {
		logger.info(res + (x - y));
		return x - y;
	}
	
	public static float molt(float x, float y) {
		logger.info(res + (x * y));
		return x * y;
	}
	
	public static float div(float x, float y) {
		logger.info("Result: " + (x / y));
		return x / y;
	}

}
