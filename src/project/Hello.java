package project;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Hello {
	
	public static final Logger logger = Logger.getLogger(Hello.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
        logger.info("Sistema per svolgere operazioni.");
		
		Operation op = new Operation();
		op.add(5, 5);
		op.sub(5, 5);
		op.molt(5, 5);
		op.div(5, 5);
	}
}
