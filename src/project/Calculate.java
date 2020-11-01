package project;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Calculate {
	
	public static final Logger logger = Logger.getLogger(Calculate.class);
	private static final String RES = "Result: ";
	
	
	public double add(double d, double e) {
		logger.info(RES + (d + e));
		return d + e;
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
	
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
        logger.info("Sistema per svolgere operazioni.");
        
		Calculate op = new Calculate();
		op.add(5, 5);
		op.sub(5, 5);
		op.molt(5, 5);
		op.div(5, 5);
		
		Operation po = new Operation();
		po.add(3.1f, 3);
		po.add((4.0), 3.7);
	}
}
