package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	
	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Pen o) {
		
		Double d = this.price;
		Double g = o.price;
		return d.compareTo(g);
		
	}
	

}