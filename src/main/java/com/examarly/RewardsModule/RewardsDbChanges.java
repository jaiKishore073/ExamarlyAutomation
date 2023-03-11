package com.examarly.RewardsModule;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RewardsDbChanges extends RewardsModuleWeb {
	
	String baseUrl="http://backend-stage.examarly.com";
	String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MTAxNzEyLCJtb2JpbGVObyI6Ijg1NTM0ODE3NjQiLCJlbWFpbCI6Imtpc2hvcmUucmFqdTk3OUBnbWFpbC5jb20iLCJyb2xlIjoidGVzdGVyIiwiZXhwaXJ5IjoxNjY4NTEzNTY4LjEwNDI0MTh9.3jAdCp0WrrFf88LWsSXA9ntLXI-YNPtolM_KNcUH_wk";
		
	
	  
	  @SuppressWarnings("rawtypes")
	  @BeforeTest
	  @AfterTest
	  public void getUserData() { 
	  RestAssured.baseURI = baseUrl;
	  RequestSpecification httpRequest =
	  RestAssured.given().header("Authorization", "Bearer " + token)
	  .header("Content-Type", "application/json");
	  
	  Response res = httpRequest.get("/api/automationTesting/testData");
	  ResponseBody body = res.body(); 
	  //Converting the response body to string
	  String rbdy = body.asString(); 
	  System.out.println("Data from the GET API- "+rbdy); 
	  }
	 
	  @Test
	  public void deletedata() {
		  RestAssured.baseURI = baseUrl;
		  RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + token)
			         .header("Content-Type", "application/json");
		 
		  //Calling the Delete API with request body
		  Response res = httpRequest.delete("/api/automationTesting/testData");
	 
		  //Fetching the response code from the request and validating the same
		  System.out.println("The response code is - " +res.getStatusCode());
	    //  Assert.assertEquals(res.getStatusCode(),204);
     
	  }
}
