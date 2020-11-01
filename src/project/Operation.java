package project;

public class Operation extends Hello{
	
	private static final String RES = "Result: ";
	
	public static float add(float x, float y) {
		logger.info(RES + (x + y));
		return x + y;
	}
	
	public static float sub(float x, float y) {
		logger.info(RES + (x - y));
		return x - y;
	}
	
	public static float molt(float x, float y) {
		logger.info(RES);
		return x * y;
	}
	
	public static float div(float x, float y) {
		logger.info(RES + (x / y));
		return x / y;
	}

}
