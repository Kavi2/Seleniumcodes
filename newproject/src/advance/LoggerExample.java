package advance;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerExample {
	
	
	static Logger logger= Logger.getLogger(LoggerExample.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 BasicConfigurator.configure();	
	 logger.debug("This is the debug message");
	 logger.info("This is an info");
	 logger.warn("This is a warning");
	 logger.error("This is an error message");
	 logger.fatal("This is an fatal message");
	}

}
