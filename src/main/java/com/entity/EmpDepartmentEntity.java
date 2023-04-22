package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "empdepartment")
public class EmpDepartmentEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String deptName;
    
	@JsonIgnore
	@OneToMany(mappedBy = "empdept")
//	orphanRemoval = true,
//    cascade = CascadeType.ALL)
	Set<EmplyoeeEntity> empentity;
	
	public Set<EmplyoeeEntity> getEmpentity() {
		return empentity;
	}

	public void setEmpentity(Set<EmplyoeeEntity> empentity) {
		this.empentity = empentity;
	}

	public Integer getId() {
		return id;
	}

	public void setDeptId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
