package com.ecommerce.model;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		ProductService pservice=new ProductService();
		ShoppingCart cart=new ShoppingCart();
		int choice;
		
		do {
	System.out.println("\n******E-Commerce Application******");
	System.out.println("1.View Products");
	System.out.println("2.Filter by Category");
	System.out.println("3.Sort by Price(Low to High)");
	System.out.println("4.Sort by name");
	System.out.println("5.Add to Cart");
	System.out.println("6.View Cart");
	System.out.println("7.Remove Item from Cart");
	System.out.println("8.Checkout");
	System.out.println("9.Exit");
	System.out.println("Enter Choice");
	
		choice =sc.nextInt();
		switch(choice) {
		case 1:
			pservice.showAllProducts();
			break;
			
		case 2:
			sc.nextLine();
			System.out.print("Enter Category:");
			String cat=sc.nextLine();
			pservice.filterByCategory(cat);
			break;
			
		case 3:
			pservice.sortByPriceAsc();
			break;
			
		case 4:
			pservice.sortByName();
			break;
			
		case 5:
			System.out.print("Enter Product Id");
			int id=sc.nextInt();
			Product selected=pservice.getProductById(id);
			
			if(selected!=null) {
				System.out.print("Enter Quantity");
				int qty=sc.nextInt();
				cart.addToCart(selected, qty);}
			
			else {
				
				System.out.println("Invalid Product Id!");	
			}
			break;
			
		case 6:
			cart.viewCart();
			break;
			
		case 7:
			System.out.print("Enter ProductId to Remove");
			
			cart.removeItem(sc.nextInt());
			break;
			
		case 8:
			double total=cart.getBill();
			System.out.println("Total Price=Rs."+total);
			System.out.println("Thankyou for shopping");
			
			cart.clearCart();
			break;
			
		case 9:
			System.out.println("Exiting");
			break;
			
		default:
			System.out.println("Invalid Choice");
			
		}
		}
		while(choice!=9);
			sc.close();
	}	
	}



