package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.products;

@Repository
public interface ProductRepository extends CrudRepository<products, Integer> {
	
  List<products> findAll();
  
List<products> findByName(String name);
}
