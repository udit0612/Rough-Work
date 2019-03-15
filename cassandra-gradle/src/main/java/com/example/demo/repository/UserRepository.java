package com.example.demo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.entity.User;

public interface UserRepository extends CassandraRepository<User, Integer>{

	
	

}
