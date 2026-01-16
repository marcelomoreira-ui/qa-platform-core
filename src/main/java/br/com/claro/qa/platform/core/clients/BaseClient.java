package br.com.claro.qa.platform.core.clients;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public abstract class BaseClient {

    protected RequestSpecification baseRequest() {
        return RestAssured
                .given()
                .contentType("application/json")
                .log().all();
    }
}