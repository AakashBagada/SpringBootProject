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

import com.entity.AddressEntity;
import com.repository.AddressRepository;
import com.repository.UserRepository;

@RestController
public class AddressController {

	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	UserRepository userRepo;

	@PostMapping("/AddAdress")
	public AddressEntity addAddress(@RequestBody AddressEntity addressEntity) {
		userRepo.save(addressEntity.getUserEntity());
		addressRepo.save(addressEntity);
		return addressEntity;
	}

	@GetMapping("/GetAddressById/{id}")
	public AddressEntity getDataByID(@PathVariable("id") Integer id) {

		Optional<AddressEntity> addressEntityOptional = addressRepo.findById(id);
		if (addressEntityOptional.isEmpty()) {
			System.out.println(addressEntityOptional);
			return null;
		} else {
			return addressEntityOptional.get();
		}

	}

	@GetMapping("/GetAllAddressdata")
	public List<AddressEntity> getAllAddressData() {
		return addressRepo.findAll();
	}

	@DeleteMapping("/DleteAddressById/{id}")
	public AddressEntity deleteById(@PathVariable("id") Integer id) {
		AddressEntity addressEntity = addressRepo.findById(id).get();
		addressRepo.deleteById(id);
		return addressEntity;
	}

	@PutMapping("/updateAddress")
	public AddressEntity updateById(@RequestBody AddressEntity addressEntity) {
		addressRepo.save(addressEntity);
		return addressEntity;
	}

}
