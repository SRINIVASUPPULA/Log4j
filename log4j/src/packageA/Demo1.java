package packageA;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String args[]){
		
		log.debug("I am Debug");
		log.error("I am hello");
		log.fatal("I am Fatal");
		log.info("I am info");
		//By default log4j passes error logs to console
		//to get all the logs on console or file,create a configuration file with file name log4j2.xml
		System.out.println("Hello");
	}

}
