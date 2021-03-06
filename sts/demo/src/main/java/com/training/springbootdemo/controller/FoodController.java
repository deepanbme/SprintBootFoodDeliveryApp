package com.training.springbootdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootdemo.model.Food;
import com.training.springbootdemo.model.FoodQuantity;
import com.training.springbootdemo.model.OrderDetails;
import com.training.springbootdemo.repository.FoodAvailabilityRespository;
import com.training.springbootdemo.repository.FoodRepository;
import com.training.springbootdemo.repository.OrderDetailsRepository;

@RestController
@RequestMapping("/orderfood")
public class FoodController {

	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private FoodAvailabilityRespository foodAvailabilityRespository;
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	
	@GetMapping
	public Iterable<Food> findAllMenu()
	{
		return foodRepository.findAll();
	}
	
	@GetMapping("/foodName")
	public Optional<Food> getFoodByName(@RequestParam String foodName)
	{
		return foodRepository.findByName(foodName);
	}
	
	@PutMapping
	public String placeOrder(@RequestBody FoodQuantity foodQuantity)
	{
		int checkQuantity = foodAvailabilityRespository.checkQuantity(foodQuantity.getFoodName());
		if(checkQuantity >= foodQuantity.getQuantity())
		{
			foodQuantity.setQuantity(checkQuantity-foodQuantity.getQuantity());
			orderDetailsRepository.saveOrder(foodQuantity.getId(), foodQuantity.getFoodName(), foodQuantity.getQuantity());
			foodAvailabilityRespository.save(foodQuantity);
			return "Yay! Your order is placed successfully!";
		}
		else if(checkQuantity < foodQuantity.getQuantity())
		{
			return "available quantity is "+ checkQuantity + " Please select from available stock";
		}
		else return "Order out of stock" ;
	}
	
	
}
