package com.concretepage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyApplication {  
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
    }       
}            
/* Insert - Post
http://localhost:8080/user/article
    {
        "articleId": 2,
        "title": "TEST",
        "category": "TEST2"
    }
*/
 /*Ubdate Put
    http://localhost:8080/user/article
    {
        "articleId": 2,
        "title": "Hola",
        "category": "Test"
    }
*/
/*Get 
http://localhost:8080/user/articles
*/
/*Detele
http://localhost:8080/user/article/{id}
*/