package com.rmgyantra.CRUDoperation;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetTheAllProjects {
	
	@Test
	public void getProjects() {
		
	io.restassured.response.Response resp = RestAssured.get("http://localhost:8084/projects");
	}
}

