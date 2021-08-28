package com.training.springbootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springbootdemo.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{
	
	@Query(value = "select * from food where foodname = :foodname", nativeQuery = true)
	Optional<Food> findByName(String foodname);
	

}
