package com.example.CartService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.CartService.exceptions.ItemNotFoundException;
@RestController
public class ItemController {


    
    @RequestMapping(value="/items",method = RequestMethod.GET, 
    		  headers = "Accepts=application/json")
     List<Item> getItems() {
    	
    	return ItemService.getDataBase().getAll();

    }

/*    @RequestMapping(value="items/{id}",method = RequestMethod.GET, 
  		  headers = "Accepts=application/json")
  Item getById(@PathVariable Long id) throws ItemNotFoundException  {
  	
  	return ItemService.getDataBase().getById(id);

  }
    
  
    */
    
}