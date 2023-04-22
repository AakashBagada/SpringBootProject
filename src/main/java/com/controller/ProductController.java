package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.products;
import com.repository.ProductRepository;

@RestController
public class ProductController {
	
    @Autowired
	ProductRepository Repo;
    @PostMapping("/adddProduct")
	public products addproduct(@RequestBody products product) {
		
    	Repo.save(product);
		return product;
		
	}
    
   @GetMapping("/GetAllData")
  public List<products> getAllrecord() {
	  
    	return Repo.findAll();
    }
  @GetMapping("/productById/{id}")
  public products getProductById(@PathVariable("id") Integer id) {
	  
	 Optional<products> optional= Repo.findById(id);
	  if(optional.isEmpty()) {
		  return null;
	  }
	  else {
		  return optional.get();
	  }
  
	  
  }
  @GetMapping("/productByName/{name}")
  public List<products> getProductByName(@PathVariable("name") String name) {
	    
	  return Repo.findByName(name);
	
  }
  
  @DeleteMapping("/DeleteProductById/{id}")  
  public products deleteAllById(@PathVariable("id") Integer id) {
	  
	  products products = Repo.findById(id).get();
	  
	  Repo.deleteById(id);
	  
	  return products;
	  
	  
  }
  @PutMapping("/updateproduct")
  public products updateAll(@RequestBody products product) {
	  Repo.save(product);
	  return product;
  } 
	
}
