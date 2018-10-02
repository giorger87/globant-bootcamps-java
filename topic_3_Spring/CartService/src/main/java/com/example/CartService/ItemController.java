package com.example.CartService;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ItemController {

	
    private final AtomicLong counter = new AtomicLong();
    private final MockedCart DB = new MockedCart();
    
    @RequestMapping(value="/items",method = RequestMethod.GET, 
    		  headers = "Accept=application/json")
    public ArrayList<Item> getItems() {
    	
    	return ItemService.getDataBase().getAll();

    }
    
    @RequestMapping(value="/items/{id}",method = RequestMethod.GET, 
  		  headers = "Accept=application/json")
  public Item getById(@RequestParam(value="id") String id) {
  	
  	return ItemService.getDataBase().getById(id); 

  }
    
  
    
    
}