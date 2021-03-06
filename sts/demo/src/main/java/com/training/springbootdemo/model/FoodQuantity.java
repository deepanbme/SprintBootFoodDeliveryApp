package com.training.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foodquantity")
public class FoodQuantity {


	@Id
	private int id;
	
	@Column(name = "foodname")
	private String foodName;
	
	@Column(name = "quantity")
	private int quantity;
	
	public FoodQuantity() {
		
	}

	public FoodQuantity(int id, String foodName, int quantity) {
		this.id = id;
		this.foodName = foodName;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodAvailability [id=" + id + ", foodName=" + foodName + ", quantity=" + quantity + "]";
	}
	
	
}
