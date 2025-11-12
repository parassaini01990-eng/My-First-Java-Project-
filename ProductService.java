package com.ecommerce.model;
import java.util.*;
import java.util.ArrayList;

public class ProductService {
	
private ArrayList<Product>productList=new ArrayList<>();

public ProductService() {
	
	productList.add(new Product(1,"Laptop", 45000,"Electrionics"));
	productList.add(new Product(2,"Phone", 15000,"Electrionics"));
	productList.add(new Product(3,"Shoes", 1200,"Fashion"));
	productList.add(new Product(4,"Watch", 2000,"Fashion"));
	productList.add(new Product(5,"Keyboard", 600,"Electrionics"));
	
}

public void showAllProducts() {
	productList.forEach(System.out::println);
}

public Product getProductById(int id) {
	return productList.stream().filter(p->p.getId()==id).findFirst().orElse(null);
}

//filter by category
public void filterByCategory(String cat) {
	productList.stream().filter(p->p.getCategory().equalsIgnoreCase(cat)).forEach(System.out::println);
}

//sort by price ascending
public void sortByPriceAsc() {
	productList.sort((a,b)->Double.compare(a.getPrice(),b.getPrice()));
	showAllProducts();
}

//sort by name
public void sortByName() {
	productList.sort((a,b)->a.getName().compareToIgnoreCase(b.getName()));
	showAllProducts();
}
}
