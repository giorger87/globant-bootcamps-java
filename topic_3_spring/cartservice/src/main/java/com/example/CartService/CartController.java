package com.example.CartService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private static final String template = "Hello!";
    private final AtomicLong counter = new AtomicLong();
    private final MockedCart DB = new MockedCart();
    
    // listar carrito entero
  //  @GetMapping("/getfullcart")
  //  public Product getcart(@RequestParam(value="id", defaultValue="0") int id) {
    	
     //   return DB.mockedDB.();
      
   // }
    @GetMapping("/getoneproduct")
    public Product getone(@RequestParam(value="id", defaultValue="0") int id) {
    	
        return DB.mockedDB.get(id);
      
    }
  //  hacer el post
    //@PostMapping("/addproduct")
    
    
}