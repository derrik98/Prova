package project;

public class Operation extends Calculate{
	
	private static final String RES = "Result: ";
	
	public double add(double x, double y) {
		logger.info(RES + (x + y));
		return x + y;
	}
	
	public double sub(double x, double y) {
		logger.info(RES + (x - y));
		return x - y;
	}
	
	public double molt(double x, double y) {
		logger.info(RES + (x * y));
		return x * y;
	}
	
	public double div(double x, double y) {
		logger.info(RES + (x / y));
		return x / y;
	}
	
	public int add(int x, int y) {
		logger.info(RES + (x + y));
		return x + y;
	}
	
	public int sub(int x, int y) {
		logger.info(RES + (x - y));
		return x - y;
	}
	
	public int molt(int x, int y) {
		logger.info(RES);
		return x * y;
	}
	
	public int div(int x, int y) {
		logger.info(RES + (x / y));
		return x / y;
	}

}