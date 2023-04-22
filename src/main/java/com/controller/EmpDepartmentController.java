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

import com.entity.EmpDepartmentEntity;
import com.repository.EmpDepartmentRepository;

@RestController
public class EmpDepartmentController {

	@Autowired
	EmpDepartmentRepository empDepartmentRepo;

	@PostMapping("/AddEmpDepartment")
	public EmpDepartmentEntity addEmpDepartment(@RequestBody EmpDepartmentEntity empDepartmentEntity) {

		empDepartmentRepo.save(empDepartmentEntity);
		return empDepartmentEntity;
	}

	@GetMapping("/GetAlldepartment")
	public List<EmpDepartmentEntity> getAlldeptData() {
		return empDepartmentRepo.findAll();
	}

	@GetMapping("/GetEmpdepartmentBYid/{id}")
	public EmpDepartmentEntity getEmpDeptDataById(@PathVariable("id") Integer id) {

		Optional<EmpDepartmentEntity> empDepartmentEntity = empDepartmentRepo.findById(id);
		if (empDepartmentEntity.isEmpty()) {
			System.out.println(empDepartmentEntity);
			return null;
		} else {
			return empDepartmentEntity.get();
		}
	}

	@DeleteMapping("/DeleteEmpDpetById/{id}")
	public EmpDepartmentEntity deleteEmpDeptById(@PathVariable("id") Integer id) {
		EmpDepartmentEntity empDpeartmentEntity = empDepartmentRepo.findById(id).get();
		empDepartmentRepo.deleteById(id);
		return empDpeartmentEntity;
	}

	@PutMapping("/updateEmpDept")
	public EmpDepartmentEntity update(@RequestBody EmpDepartmentEntity empDepartmentEntity) {
		empDepartmentRepo.save(empDepartmentEntity);
		return empDepartmentEntity;
	}

}
