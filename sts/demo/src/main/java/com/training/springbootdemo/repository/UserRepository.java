package com.training.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springbootdemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
