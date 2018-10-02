package com.example.CartService;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@Slf4j
@Service
public class ItemService {
	
	
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Item> items ;
		Item item;
	   //create an object of SingleObject
	   private static ItemService ItemDB = new ItemService();
	   
	   public ItemService(){}

	   //Get the only object available
	   public static ItemService getDataBase(){
		   
	      return ItemDB;
	   }
//this method connects to the external Database to get all existing Items
	   public ArrayList<Item> getAll(){
	    // log.info("Retrieving Data from external db");
	      RestTemplate restTemplate = new RestTemplate();
		     ResponseEntity<List<Item>> itemsResponse =
		      restTemplate.exchange("http://challenge.getsandbox.com/articles",
		                  HttpMethod.GET, null, new ParameterizedTypeReference<List<Item>>() {
		          });
			    items= (ArrayList<Item>) itemsResponse.getBody();   
				return items;
	   }
	   //this method connects to the external DB to get one item by id
	   public Item getById(String id) {
		   //borrar siguiente linea ??
		   
		   try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Item> itemResponse = restTemplate.exchange("http://challenge.getsandbox.com/articles/{id}",
					HttpMethod.GET, null, new ParameterizedTypeReference<Item>() {
					}, id);
			item = itemResponse.getBody();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return item;
		   
	   }
}

	