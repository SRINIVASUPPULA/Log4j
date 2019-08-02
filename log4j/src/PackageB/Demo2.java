package PackageB;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo2 {
	
	private static Logger log=LogManager.getLogger(Demo2.class.getName());
	public static void main(String args[]){
		
		log.debug("I am Debug2");
		log.error("I am Error2");
		log.fatal("I am Fatal2");
		log.info("I am info2");
		//By default log4j passes error logs to console
		//to get all the logs on console or file,create a xml configuration file at project level
	}

}
