package com.ustglobal.sorting.list;

public class Pen2  {
	
	double price;
	String color;
	
	public Pen2(double price, String color) {
		super();
		this.price = price;
		this.color = color;
		
	}
	@Override
	public String toString() {
		return "Pen [price=" + price + ", color =" + color + "]";
	}
//	@Override
//	public int compareTo(Pen2 o) {
//		
//		Double d = this.price;
//		Double g = o.price;
//		return d.compareTo(g);
//		
//	}
	

}
