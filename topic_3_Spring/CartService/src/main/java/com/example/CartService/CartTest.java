package com.example.CartService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class CartTest {

	public static void main(String[] args) {
		System.out.println("agagagas");
	    final Logger log = LoggerFactory.getLogger(CartServiceApplication.class);

		Map<Long,Product> MockedDB = new HashMap<Long,Product>();
		System.out.println(MockedDB.toString());
		 
//	        
		 
	       log.info(ItemService.getDataBase().getAll().toString()); 
	       log.info(ItemService.getDataBase().getById("2").toString());
	}

}
