package com.logg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
	final static Logger log = LoggerFactory.getLogger(TestLog.class);
	public static void main(String[] args) {
		System.out.println("started");
		log.info("Msg #1");
		log.warn("Msg #2");
		log.error("Msg #3");
		if(log.isDebugEnabled()){
			log.debug("Msg #xyz");
		}
		log.info("Hello there. I am {}");		
		log.debug("Debugging message");
		Call cl= new Call();
		cl.getM();
	}

}
