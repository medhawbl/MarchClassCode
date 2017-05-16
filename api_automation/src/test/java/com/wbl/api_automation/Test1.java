package com.wbl.api_automation;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class Test1 {
	@Test
	public  void test(){
			Response responseThen = given().when().get("https://maps.googleapis.com/maps/api/directions/json?origin=Disneyland&destination=Universal+Studios+Hollywood4&key=AIzaSyCaMoHis4skbMPhLiB39EwHN-zuJatxqio");
			System.out.println(responseThen.prettyPrint());
			List<HashMap<Object,Object>> routes = (List<HashMap<Object,Object>>)responseThen.path("routes");
			System.out.println("size:"+routes.size());
			for(int i=0;i<routes.size();i++){
				System.out.println(routes.get(i).get("bounds"));

				System.out.println(routes.get(i).containsKey("northeast"));
				HashMap<String,String> northeast = (HashMap<String,String>)routes.get(i).get("bounds");
				System.out.println(northeast.get("lat"));
			}
			
			List<HashMap<Object,Object>> legs = (List<HashMap<Object,Object>>)responseThen.path("routes[0].legs");
			System.out.println("size:"+legs.size());
			for(int i=0;i<legs.size();i++){
				String s = (String)legs.get(i).get("start_address");
				System.out.println(s);
			}


	}
}
