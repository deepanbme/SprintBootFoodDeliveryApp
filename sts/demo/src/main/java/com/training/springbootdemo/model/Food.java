package com.training.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Food {

	@Id
	int id;
	
	@Column(name="foodname")
	String foodName;
	
	double price;
	
	
	public Food() {
		
	}

	public Food(int id, String foodName, double price) {
		this.id = id;
		this.foodName = foodName;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", price=" + price + "]";
	}
	
	
}
