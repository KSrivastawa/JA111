package com.enums;

public enum StationaryItems {

	MAP,BOOK(15),PENCIL,PEN(9),SHARPNER;
	
	int price;
	
	private StationaryItems() {
		this.price = 10;
	}
	
	private StationaryItems(int price) {
		this.price = price;
		
	}

	public int getPrice() {
		return this.price;
	}

	
}
