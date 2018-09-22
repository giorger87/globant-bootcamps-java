package com.example.CartService;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Product {
	private final long id;
	private final ObjectNode content;
	
	   public Product(long id, ObjectNode content) {
	        this.id = id;
	        this.content = content;
	    }
	public long getId() {
		return id;
	}
	public ObjectNode getContent() {
		return content;
	}

}
