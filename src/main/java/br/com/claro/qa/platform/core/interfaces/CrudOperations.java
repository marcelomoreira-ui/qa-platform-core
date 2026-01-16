package br.com.claro.qa.platform.core.interfaces;

import io.restassured.response.Response;

public interface CrudOperations<T> {

    Response create(T body);

    Response getById(String id);

    Response update(String id, T body);

    Response delete(String id);
}