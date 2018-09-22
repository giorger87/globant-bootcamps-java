package com.example.CartService;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

 
public class MockedCart {
	List<Product> mockedDB = new ArrayList<Product>();

	public MockedCart() {

		ObjectMapper mapper= new ObjectMapper();
		ObjectNode objectNode1 = mapper.createObjectNode();
        objectNode1.put("name", "Pasta");
        objectNode1.put("price", "10");
		Product p1 = new Product(0, objectNode1);
		
		ObjectNode objectNode2 = mapper.createObjectNode();
        objectNode2.put("name", "Pizza");
        objectNode2.put("price", "7");
		Product p2 = new Product(0, objectNode2);
		
		ObjectNode objectNode3 = mapper.createObjectNode();
        objectNode3.put("name", "Biscuits");
        objectNode3.put("price", "2.5");
		Product p3 = new Product(0, objectNode3);
		
		
		mockedDB.add(p1);
		mockedDB.add(p2);
		mockedDB.add(p3);

	}
}
