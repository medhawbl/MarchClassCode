package com.wbl.api_automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.api_automation.base.BaseAPITest;
import com.wbl.api_automation.base.BaseApi;
import com.wbl.api_automation.helper.RestResponse;

public class ItunesTest extends BaseAPITest{
	
	BaseApi api;
	
	@BeforeClass
	public void beforeClass(){
		api = new BaseApi(endpoint);
	}
	
	@Test
	public void getItunesAPI(){
		RestResponse response = api.post("/v1/subjects?authentication=false");
		//getting important header info from response
		//assert for status code
		assertEquals(response.getStatuscode(),201);
		//assert for status message
		assertTrue(response.getStatusMessage().contains("Created"));
		//getting actual body(resposne payload)  
		//parsing json object
		JSONObject json = new JSONObject(response.getPayload());
		System.out.println(json.toString());
		//assert for key value in payload
		/*assertTrue(json.getInt("resultCount")>=25);
		JSONArray resultsarray = json.getJSONArray("results");
		//assert for datacount in payload
		assertTrue(resultsarray.length()>0);
		for(int i=0;i<resultsarray.length();i++){
			JSONObject result = resultsarray.getJSONObject(i);
			//assert for key presence in payload
			assertTrue(result.has("wrapperType"));
			System.out.println(result.get("artistId"));
			System.out.println(result.get("kind"));
			////assert for value of key is not null  in payload
			assertNotNull(result.get("artistId"));
			assertNotNull(result.get("kind"));
		}
		
		for(Header header :response.getHeaders()){
			System.out.println(header.getName()+ "::"+header.getValue());
		}*/
	}

}
