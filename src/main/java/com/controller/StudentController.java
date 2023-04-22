//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.entity.StudentEntity;
//import com.repository.CourseRepository;
//import com.repository.StudentRepository;
//
//@RestController
//public class StudentController {
//
//	@Autowired
//	StudentRepository studentRepository;
//	
//	@Autowired
//	CourseRepository courseRepository;
//	
//	@PostMapping("/addStudent")
//	public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
//		
//		courseRepository.save(studentEntity.getCourseEntity());
//		studentRepository.save(studentEntity);
//		return studentEntity;
//	}
//}
