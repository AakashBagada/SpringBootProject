package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.EmplyoeeEntity;

@Repository
public interface EmplyoeeRepository extends CrudRepository<EmplyoeeEntity, Integer> {

	List<EmplyoeeEntity> findAll();
}
