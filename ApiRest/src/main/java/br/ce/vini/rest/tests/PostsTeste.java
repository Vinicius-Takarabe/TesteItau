package br.ce.vini.rest.tests;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Test;

import br.ce.vini.rest.core.BaseTest;
import io.restassured.response.Response;

public class PostsTeste extends BaseTest  {
	
	//Obter dados (GET)
	
	 @Test 
	    public void getRequest() {
	        Response response = given()
	                .when()
	                .get("/posts")
	                .then()
	                .extract().response();

	        Assert.assertEquals(200, response.statusCode());
	        Assert.assertEquals("2", response.jsonPath().getString("id[1]"));
	        Assert.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
	        Assert.assertEquals("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla", response.jsonPath().getString("body[1]"));
	        
	    }
	 
	 //Postar dados (POST)
	 
	 private static String requestBody = "{\n" +
	            "  \"title\": \"foo\",\n" +
	            "  \"body\": \"bar\",\n" +
	            "  \"userId\": \"1\" \n}";
	 @Test
	    public void postRequest() {
	        Response response = given()
	                .body(requestBody)
	                .when()
	                .post("/posts")
	                .then()
	                .extract().response();

	        Assert.assertEquals(201, response.statusCode());
	        Assert.assertEquals("1", response.jsonPath().getString("userId"));
	        Assert.assertEquals("101", response.jsonPath().getString("id"));
	        Assert.assertEquals("foo", response.jsonPath().getString("title"));
	        Assert.assertEquals("bar", response.jsonPath().getString("body"));
	       
	    }
	 
	 //Atualizar dados (PUT) atualiza o recurso, mas requer a carga útil JSON completa.
	 
	 private static String requestBody1 = "{\n" +
	            "  \"title\": \"foo\",\n" +
	            "  \"body\": \"baz\",\n" +
	            "  \"userId\": \"1\",\n" +
	            "  \"id\": \"1\" \n}";
	 @Test
	    public void putRequest() {
	        Response response = given()
	                .body(requestBody1)
	                .when()
	                .put("/posts/1")
	                .then()
	                .extract().response();

	        Assert.assertEquals(200, response.statusCode());
	        Assert.assertEquals("1", response.jsonPath().getString("userId"));
	        Assert.assertEquals("1", response.jsonPath().getString("id"));
	        Assert.assertEquals("foo", response.jsonPath().getString("title"));
	        Assert.assertEquals("baz", response.jsonPath().getString("body"));
	        
	    }
	 
	 //Atualizar dados (PATH) atualiza o recurso, mas requer apenas os campos que estão sendo atualizados na carga
	 
	 private static String requestBody2 = "{\n" +
	            "  \"title\": \"bax\" \n}";

	   

	    @Test
	    public void patchRequest() {
	        Response response = given()
	                .body(requestBody2)
	                .when()
	                .patch("/posts/1")
	                .then()
	                .extract().response();
	        
	        Assert.assertEquals(200, response.statusCode());
	        Assert.assertEquals("1", response.jsonPath().getString("userId"));
	        Assert.assertEquals("1", response.jsonPath().getString("id"));	      
	        Assert.assertEquals("bax", response.jsonPath().getString("title"));
	       
	    }
	    
 
	    //Excluir recurso (DELETE)
	    
	    @Test
	    public void deleteRequest() {
	        Response response = given()
	                .header("Content-type", "application/json")
	                .when()
	                .delete("/posts/1")
	                .then()
	                .extract().response();

	        Assert.assertEquals(200, response.statusCode());
	    }
	 
	 
	 
	 
	 
	 
}