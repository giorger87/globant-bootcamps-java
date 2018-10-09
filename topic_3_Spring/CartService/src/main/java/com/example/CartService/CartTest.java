package com.example.CartService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class CartTest {
	@Autowired
	@Value("#{db.url}")
	private static String dbUrl ;
	public static void getAll(){
	    // log.info("Retrieving Data from external db");
	      RestTemplate restTemplate = new RestTemplate();
		     ResponseEntity<List<Item>> itemsResponse =
		      restTemplate.exchange("http://challenge.getsandbox.com/articles",
		                  HttpMethod.GET, null, new ParameterizedTypeReference<List<Item>>() {
		          });
			    List<Item> items = (ArrayList<Item>) itemsResponse.getBody();   
				System.out.println(items);;
	   }
	public static void main(String[] args) {
		System.out.println("agagagas");
	    final Logger log = LoggerFactory.getLogger(CartServiceApplication.class);
	    getAll();
		//Map<Long,Product> MockedDB = new HashMap<Long,Product>();
	//	System.out.println(MockedDB.toString());
		 
//	        
//	       
//	      log.info(ItemService.getDataBase().getAll().toString()); 
//	       try {
//			log.info(ItemService.getDataBase().getById(2L).toString());
//		} catch (ItemNotFoundException e) {
//			// TODO Auto-generated catch block
//			log.error("item not found");
//		}
	    
	    log.info("testing url");
	    System.out.println(dbUrl);
	}

}
