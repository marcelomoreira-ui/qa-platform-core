package br.com.claro.qa.platform.core.config;

import  io.restassured.RestAssured;
import  io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class RestAssuredConfig {
    static {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }
    private RestAssuredConfig(){}
}
