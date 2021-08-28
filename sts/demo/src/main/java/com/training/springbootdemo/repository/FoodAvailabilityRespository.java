package com.training.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.springbootdemo.model.FoodQuantity;

public interface FoodAvailabilityRespository extends JpaRepository<FoodQuantity, Integer>{

	@Query(value = "select quantity from foodquantity where foodname = :foodname", nativeQuery = true)
	int checkQuantity(String foodname);
}
