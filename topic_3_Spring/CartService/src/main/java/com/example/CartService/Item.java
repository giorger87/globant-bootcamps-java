package com.example.CartService;

public class Item {

	private long id;
	private String title;
	private String price;
	public Item() {}
	
	public Item(long id, String title, String price) {
		this.id = id;
		this.title = title;
		this.price = price;

	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getPrice() {
		return price;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setPrice(String price) {
		this.price = price;
	}
}
