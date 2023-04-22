//package com.entity;
//
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
////import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "Courses")
//public class CourseEntity {
//  
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer cid;
//	private String name;
//	
////	@JsonIgnore
//	@ManyToMany(mappedBy ="courseEntity")
//	Set<StudentEntity> studentEntity;
//
//	public Integer getCid() {
//		return cid;
//	}
//
//	public void setCid(Integer cid) {
//		this.cid = cid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Set<StudentEntity> getStudentEntity() {
//		return studentEntity;
//	}
//
//	public void setStudentEntity(Set<StudentEntity> studentEntity) {
//		this.studentEntity = studentEntity;
//	}
//	
//	
//	
//}
