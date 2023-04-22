package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.userEntity;

@Repository
public interface UserRepository extends CrudRepository<userEntity,Integer>{

	List<userEntity> findAll();
}
