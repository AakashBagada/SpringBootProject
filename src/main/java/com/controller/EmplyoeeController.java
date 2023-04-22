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
import com.entity.EmplyoeeEntity;
import com.repository.EmpDepartmentRepository;
import com.repository.EmplyoeeRepository;

@RestController
public class EmplyoeeController {

	@Autowired
	EmplyoeeRepository emplyoeeRepo;
	
	
	@Autowired
	EmpDepartmentRepository empDepartmentRepository;

	@PostMapping("/AddEmploee")
	public EmplyoeeEntity addEmploee(@RequestBody EmplyoeeEntity emplyoeeEntity) {
        empDepartmentRepository.save(emplyoeeEntity.getEmpdept());
		emplyoeeRepo.save(emplyoeeEntity);
		return emplyoeeEntity;
	}
	
	@GetMapping("/GetAllEmplyoee")
	public List<EmplyoeeEntity> getAllEmplyoee() {
		return emplyoeeRepo.findAll();
	}

	@GetMapping("/getEmployeeById/{id}")
	public EmplyoeeEntity getEmployeeByID(@PathVariable("id") Integer id) {
		Optional<EmplyoeeEntity> emplyoeeEntityoptional = emplyoeeRepo.findById(id);

		if (emplyoeeEntityoptional.isEmpty()) {
			return null;
		} else {
			return emplyoeeEntityoptional.get();
		}

	}
   @DeleteMapping("/deleteEmployee/{id}")
   public EmplyoeeEntity deleteEmployee(@PathVariable("id") Integer id) {
	EmplyoeeEntity emplyoeeEntity=emplyoeeRepo.findById(id).get();
	   emplyoeeRepo.deleteById(id);
	   return emplyoeeEntity;
   }
   @PutMapping("/updateEmployee")
   public EmplyoeeEntity updateEmployee(@RequestBody EmplyoeeEntity emplyoeeEntity) {
	   emplyoeeRepo.save(emplyoeeEntity);
	   return emplyoeeEntity;
   }
}
