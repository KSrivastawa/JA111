package com.Q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList= new ArrayList<>();
	
	void addProductToList(Product product) {
		
		if(productList.contains(product)) {
			System.out.println("Count updated Product already exists");
		}
		else {
			System.out.println("Product added successfully");
			this.productList.add(product);
		}
		
	}
	
	List<Product> showAllProduct(){
		
		return productList;
		
	}

	
}
