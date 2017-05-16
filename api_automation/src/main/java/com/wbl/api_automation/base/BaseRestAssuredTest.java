package com.wbl.api_automation.base;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.wbl.api_automation.helper.ConfigUtils;

import io.restassured.specification.RequestSpecification;

public class BaseRestAssuredTest {

	protected RequestSpecification rs;
	HashMap<String,String> hm=null;
	
	@BeforeSuite
	public void beforeSuite(){
		Properties prop= ConfigUtils.loadProperties("config.properties");
		baseURI=prop.getProperty("TSurl");
		basePath=prop.getProperty("subjectspath");
		rs=given().when();
		if(prop.getProperty("auth").equals("true")){
		rs.auth().oauth(prop.getProperty("consumerkey"), prop.getProperty("consumersecret"),
				prop.getProperty("accessToken"), prop.getProperty("accessSecret"));
		}
		if(prop.getProperty("headers").equals("true")){
			rs.headers(createHeaderMap());
		}
	}
	
	private HashMap<String,String> createHeaderMap(){
		
		Properties prop= ConfigUtils.loadProperties("headers.properties");
		
		hm=new HashMap<String,String>();
		
		for(Map.Entry entry:prop.entrySet()){
			hm.put((String)entry.getKey(), (String)entry.getValue());
		}
		return hm;
	}
}
