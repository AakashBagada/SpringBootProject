//package com.entity;
//
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//
//
//@Entity
//@Table(name = "students")
//public class StudentEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer sid;
//	private String name;
//	private String email;
//	
//	@ManyToMany
//	@JoinTable(name ="Student_course", joinColumns=@JoinColumn(name="sid"),inverseJoinColumns=@JoinColumn(name="cid"))
//	CourseEntity courseEntity;
//
//	public CourseEntity getCourseEntity() {
//		return courseEntity;
//	}
//
//	public void setCourseEntity(CourseEntity courseEntity) {
//		this.courseEntity = courseEntity;
//	}
//
//	public Integer getSid() {
//		return sid;
//	}
//
//	public void setSid(Integer sid) {
//		this.sid = sid;
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
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//
//}
