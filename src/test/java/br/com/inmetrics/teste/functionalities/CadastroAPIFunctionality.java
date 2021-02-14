package br.com.inmetrics.teste.functionalities;

import br.com.inmetrics.teste.pages.Empregado;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class CadastroAPIFunctionality {

    String nomeNovo, cpfNovo, dataNovo, emailNovo, telefoneNovo;

    public void cadastraEmpregado() throws IOException {

        int i = 2;

        FileInputStream test = new FileInputStream("dados.txt");
        Reader reader = new InputStreamReader(test, StandardCharsets.UTF_8);
        BufferedReader buff = new BufferedReader(reader);

        String linha = buff.readLine();
        nomeNovo = linha;

        while (linha != null) {
            linha = buff.readLine();

            switch(i) {
                case 2:
                    cpfNovo = linha;
                case 4:
                    emailNovo = linha;
                case 5:
                    telefoneNovo = String.valueOf(linha);
            }
            i++;
        }

        buff.close();

        Empregado emp = new Empregado("18/02/2020", "Engenheiro de automacao", "500,00", cpfNovo, 2, nomeNovo, "3.100,00", "i", "clt");
        Empregado array[] = new Empregado[1];
        array[0] = emp;
        Response response = given().auth().preemptive().basic("inmetrics", "automacao").header("Accept", ContentType.JSON.getAcceptHeader()).contentType(ContentType.JSON)
                .body(array[0]).when().post("https://inm-test-api.herokuapp.com/empregado/cadastrar").then().statusCode(202).extract().response();

        ResponseBody body = response.getBody().prettyPeek();
        System.out.println(body.asString());
    }

}
