package br.ce.vini.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	String APP_BASE_URL = "https://jsonplaceholder.typicode.com"; 
    Integer APP_PORT = 443;
    String APP_BASE_PATH = "";
    
   ContentType APP_CONTENT_TYPE = ContentType.JSON;
   
   Long MAX_TIMEOUT = 7000L; //Tempo maximo de requisição
   
   
   
    
    
}
