package com.wbl.api_automation.base;

import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.wbl.api_automation.helper.ConfigUtils;

public class BaseAPITest {
	
	protected String endpoint;
	
	@BeforeSuite
	public void beforeSuite(){
		Properties prop= ConfigUtils.loadProperties("config.properties");
		endpoint=prop.getProperty("url");
	}

}
