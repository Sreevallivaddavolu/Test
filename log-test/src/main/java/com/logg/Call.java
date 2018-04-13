package com.logg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Call {
	final static Logger log = LoggerFactory.getLogger(Call.class);
	public void getM()
	{
	 System.out.println("nothing happens");
	 log.debug("debug msg");
	 log.info("info msg");
	
	}
}
