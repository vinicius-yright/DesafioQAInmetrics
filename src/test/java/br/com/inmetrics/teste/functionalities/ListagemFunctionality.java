package br.com.inmetrics.teste.functionalities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


import static io.restassured.RestAssured.given;

public class ListagemFunctionality {

    public void listaTodosEmpregados() {
        Response response = given().auth().preemptive().basic("inmetrics", "automacao").header("Accept", ContentType.JSON.getAcceptHeader()).contentType(ContentType.JSON)
                .when().get("https://inm-test-api.herokuapp.com/empregado/list_all").then().statusCode(200).extract().response();

        ResponseBody body = response.getBody().prettyPeek();
        System.out.println(body.asString());
    }

    public void listaEmpregadoEspecifico() {

        Response response = given().auth().preemptive().basic("inmetrics", "automacao").header("Accept", ContentType.JSON.getAcceptHeader()).contentType(ContentType.JSON)
                .when().get("https://inm-test-api.herokuapp.com/empregado/list/9" ).then().statusCode(202).extract().response();

        ResponseBody body = response.getBody().prettyPeek();
        System.out.println(body.asString());
    }
}
