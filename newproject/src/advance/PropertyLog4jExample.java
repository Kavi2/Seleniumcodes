package advance;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {
	
	static Logger logger= Logger.getLogger(PropertyLog4jExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 PropertyConfigurator.configure("log.properties");
		 logger.debug("This is the debug message");
		 logger.info("This is an info");
		 logger.warn("This is a warning");
		 logger.error("This is an error message");
		 logger.fatal("This is an fatal message");

	}

}
