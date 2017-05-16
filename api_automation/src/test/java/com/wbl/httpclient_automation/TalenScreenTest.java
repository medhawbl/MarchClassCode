package com.wbl.httpclient_automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.api_automation.base.BaseAPITest;
import com.wbl.api_automation.base.BaseApi;
import com.wbl.api_automation.helper.RestResponse;

public class TalenScreenTest extends BaseAPITest{
	
	BaseApi api;
	
	@BeforeClass
	public void beforeClass(){
		api = new BaseApi(endpoint);
	}
	@Test
	public void getSubjectsTest(){
		RestResponse response = api.get("/subjects?authentication=false");
		//getting important header info from response
		//assert for status code
		assertEquals(response.getStatuscode(),200);
		//assert for status message
		assertTrue(response.getStatusMessage().contains("OK"));
		//getting actual body(resposne payload)  
		//parsing json object
		JSONArray json = new JSONArray(response.getPayload());
		System.out.println(json.toString());
		
		System.out.println("id:"+((JSONObject)json.get(0)).get("id"));
	}
	@Test
	public void postSubjectsTest(){
		RestResponse response = api.post("/subjects?authentication=false");
		//getting important header info from response
		//assert for status code
		assertEquals(response.getStatuscode(),201);
		//assert for status message
		assertTrue(response.getStatusMessage().contains("Created"));
		//getting actual body(resposne payload)  
		//parsing json object
		JSONObject json = new JSONObject(response.getPayload());
		System.out.println(json.toString());
		
		System.out.println("id:"+json.get("id"));
		assertNotNull(json.get("id"));
	}

	@Test(dependsOnMethods="postSubjectsTest")
	public void updateSubjectsTest(){
		RestResponse response = api.update("/subjects","/68?authentication=false");
		//getting important header info from response
		//assert for status code
		assertEquals(response.getStatuscode(),200);
		//assert for status message
		assertTrue(response.getStatusMessage().contains("OK"));
		//getting actual body(resposne payload)  
		//parsing json object
		JSONObject json = new JSONObject(response.getPayload());
		System.out.println(json.toString());
		
		System.out.println("name:"+json.get("name"));
		assertNotNull(json.get("name"));
	}
	@Test(dependsOnMethods="updateSubjectsTest")
	public void deleteSubjectsTest(){
		RestResponse response = api.delete("/subjects","/68/?authentication=false");
		//getting important header info from response
		//assert for status code
		assertEquals(response.getStatuscode(),204);
	}

}
