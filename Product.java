package com.ecommerce.model;

import java.util.Scanner;

public class Product {
	
private int id;
private String name;
private double price;
private String category;

public Product(int id,String name,double price,String category) {
	this.id=id;
	this.name=name;
	this.price=price;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public double getPrice() {
	return price;
} 

public String getCategory() {
	return category;
}

@Override
public String toString() {
	return id+" "+name+" Rs."+price;
	
}
}