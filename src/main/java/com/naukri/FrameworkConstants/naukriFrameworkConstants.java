package com.naukri.FrameworkConstants;

public class naukriFrameworkConstants {
	
	
	private final static String BASEURL = "https://www.naukri.com/";
	private final static int WAITTIME = 10;
	
	
	private final static String CONFIGPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
	
	
	public static String getConfigpath() {
		return CONFIGPATH;
	}
	public static String getBaseurl() {
		return BASEURL;
	}
	public static int getWaittime() {
		return WAITTIME;
	}
	
	

	

}
