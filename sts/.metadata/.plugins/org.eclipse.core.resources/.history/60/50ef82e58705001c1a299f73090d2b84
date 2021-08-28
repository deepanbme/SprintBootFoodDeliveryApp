package com.training.springbootdemo.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.training.springbootdemo.model.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer>{

	@Query(value = "insert into orderdetails value(:id, :foodname, :quantity)", nativeQuery = true)
	void saveOrder(int id, String foodname, int quantity);


}
