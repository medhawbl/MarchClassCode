package com.wbl.restassured_automation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.wbl.api_automation.base.BaseRestAssuredTest;

public class RestAssuredAPITest extends BaseRestAssuredTest{
	
	@Test
	public void getTest(){
		 rs.get().then()
		.statusCode(200)
		.body("[1].id", equalTo(37))
		.body("[1].name", equalTo("Java "))
		.body(containsString("icon_class"));
	}
	
	
	@Test
	public void postTest(){
		String reqPayload = "{\"name\": \"APINEW4\",\"icon_class\": \"ts-seleniumwebdriver\", \"description\": \"SWD\"}";

		rs.body(reqPayload).post("?authentication=false").then().statusCode(201).
		body(containsString("id"));
	}
	

}
