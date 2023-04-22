package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.EmpDepartmentEntity;

@Repository
public interface EmpDepartmentRepository extends CrudRepository<EmpDepartmentEntity, Integer> {

	List<EmpDepartmentEntity> findAll();
}
