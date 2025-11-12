package com.ecommerce.model;

import java.util.ArrayList;

public class ShoppingCart {
	
private ArrayList <CartItem> cart=new ArrayList<>();

	public void addToCart(Product p,int qty) {
		
		cart.add(new CartItem(p,qty));
		System.out.println("Added:"+p.getName());	
	}
	
	public void viewCart() {
		
		if(cart.isEmpty()) {
			System.out.println("Cart is Empty!");
			return;
		}
		cart.forEach(System.out::println);}
	
		public void removeItem(int productId) {
			boolean removed=cart.removeIf(item->item.getProduct().getId()==productId);
			System.out.println(removed? "Item Removed":"Item Not Found");
		}
		
		public double getBill() {
			return cart.stream().mapToDouble(CartItem::getTotalPrice).sum();
			
		}
		
		public void clearCart() {
			cart.clear();
	}

}
