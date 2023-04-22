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
import org.springframework.web.bind.annotation.RestController;

import com.entity.userEntity;
import com.repository.AddressRepository;
import com.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AddressRepository addreRepository;
	

	@PostMapping("/Adduser")
	public userEntity addUser(@RequestBody userEntity userEntity) {
		addreRepository.save(userEntity.getAddrss());
		userRepository.save(userEntity);
		return userEntity;
	}
	@GetMapping("/getAllRecord")
	public List<userEntity>  getAllRecord() {
		
	return	userRepository.findAll();
	}
	
	@GetMapping("/getUserById/{id}")
	public userEntity getUserById(@PathVariable("id") Integer id) {
	Optional<userEntity> userEntityOptional=userRepository.findById(id);
	
	if(userEntityOptional.isEmpty()) {
		return null;
	}else {
		return userEntityOptional.get();
	}
}
	@DeleteMapping("/deleteById/{id}")
	public userEntity deleteBYId(@PathVariable("id") Integer id) {
		userEntity userentity=userRepository.findById(id).get();
		userRepository.deleteById(id);
		return userentity;
	}
	@PutMapping("/updateUser")
	public userEntity updateUser(@RequestBody userEntity userentity) {
		userRepository.save(userentity);
		return userentity;
	}

}
