package com.wbl.api_automation.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.wbl.api_automation.helper.ConfigUtils;
import com.wbl.api_automation.helper.RestResponse;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

public class BaseApi {

	private String url;
	RestResponse restResponse;	
	HttpClient httpclient;
	OAuthConsumer consumer;
	
	public BaseApi(String url){
		this.url=url;
		httpclient = HttpClientBuilder.create().build();
		setAuthentication();
	}
	
	public void setAuthentication(){
		Properties prop = ConfigUtils.loadProperties("config.properties");
		consumer = new CommonsHttpOAuthConsumer(prop.getProperty("consumerkey"), prop.getProperty("consumersecret"));
		consumer.setTokenWithSecret(prop.getProperty("accessToken"), prop.getProperty("accessSecret"));
	}
	public RestResponse get(String resource){
		
		//create required httpmethod object
		HttpGet get = new HttpGet(url+resource);	
		restResponse= new RestResponse();
		try {
			//sends request to API and get response(header and payload)
			HttpResponse response = httpclient.execute(get);
			restResponse.setStatuscode(response.getStatusLine().getStatusCode());
			restResponse.setHeaders(response.getAllHeaders());
			restResponse.setStatusMessage(response.getStatusLine().toString());
			restResponse.setPayload(IOUtils.toString(response.getEntity().getContent()));
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return restResponse;
	}
	

	public RestResponse post(String resource){
		
		//create required httpmethod object
		HttpPost post = new HttpPost(url+resource);	
		restResponse= new RestResponse();
		try {
			
			post.setHeader("Content-Type","application/json");
			consumer.sign(post);
			/*List<NameValuePair> entityList = new ArrayList <NameValuePair>();
			entityList.add(new BasicNameValuePair("lang", "fr"));
			HttpEntity entity = new UrlEncodedFormEntity(entityList);*/
			
			
			HttpEntity entity = new StringEntity(createRequestPayload());
			post.setEntity(entity);
			
			HttpResponse response = httpclient.execute(post);
			restResponse.setStatuscode(response.getStatusLine().getStatusCode());
			restResponse.setHeaders(response.getAllHeaders());
			restResponse.setStatusMessage(response.getStatusLine().toString());
			restResponse.setPayload(IOUtils.toString(response.getEntity().getContent()));
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return restResponse;
	}
	
public RestResponse update(String resource, String requestParam){
		
		//create required httpmethod object
		HttpPut put = new HttpPut(url+resource+"/"+requestParam);	
		restResponse= new RestResponse();
		try {
			
			put.setHeader("Content-Type","application/json");
			
			HttpEntity entity = new StringEntity(createRequestPayload());
			put.setEntity(entity);
			
			HttpResponse response = httpclient.execute(put);
			restResponse.setStatuscode(response.getStatusLine().getStatusCode());
			restResponse.setHeaders(response.getAllHeaders());
			restResponse.setStatusMessage(response.getStatusLine().toString());
			restResponse.setPayload(IOUtils.toString(response.getEntity().getContent()));
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return restResponse;
	}

public RestResponse delete(String resource, String requestparam){
	
	//create required httpmethod object
	HttpDelete del = new HttpDelete(url+resource+"/"+requestparam);	
	restResponse= new RestResponse();
	try {
		HttpResponse response = httpclient.execute(del);
		restResponse.setStatuscode(response.getStatusLine().getStatusCode());
		restResponse.setHeaders(response.getAllHeaders());
		restResponse.setStatusMessage(response.getStatusLine().toString());
		
	} catch (ClientProtocolException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return restResponse;
}
	
	private String createRequestPayload(){
		String reqPayload = "{\"name\": \"APINEW3\",\"icon_class\": \"ts-seleniumwebdriver\", \"description\": \"SWD\"}";

		JSONObject json = new JSONObject();
		json.put("name", "APINEW3");
		json.put("icon_class", "ts-seleniumwebdriver");
		json.put("description", "SWd");
		
		return json.toString();
		//return reqPayload;
	}

	
}
