package com.basicjava.stream;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id =id;
		this.name = name;
		this.price =price;
	}
	
	
}

public class Filter3 {
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP Laptop",25000.25));
		productList.add(new Product(2,"Dell Laptop",35000.35));
		productList.add(new Product(3,"Amma Laptop",45000.45));
		productList.add(new Product(4,"Sony Laptop",15000.15));
		productList.add(new Product(5,"Lenova Laptop",85000.85));
		
		
		productList.stream().filter(p-> p.price > 30000)
		.forEach(pr -> System.out.println(pr.price));
		
	}

}
