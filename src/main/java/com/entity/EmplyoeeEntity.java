package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "emplyee1")
public class EmplyoeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empName;
	private String empEmail;
	private String empPass;
	
	@ManyToOne
	@JoinColumn(name = "deptid",referencedColumnName = "id")
	EmpDepartmentEntity empdept;
	
	public EmpDepartmentEntity getEmpdept() {
		return empdept;
	}

	public void setEmpdept(EmpDepartmentEntity empdept) {
		this.empdept = empdept;
	}

	public Integer getId() {
		return id;
	}

	public void setEmpId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

}
