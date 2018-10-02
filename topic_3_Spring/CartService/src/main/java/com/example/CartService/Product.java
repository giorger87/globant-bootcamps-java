package com.example.CartService;



import com.fasterxml.jackson.databind.node.ObjectNode;

public class Product {
	private final long id;
	private final String name;
	private final String price;
	private final String amount;
	
	   public Product(long id, String name, String price, String amount) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.amount = amount;
	    }
	public long getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public String getAmount() {
		return amount;
	}

}
