package com.ustglobal.sorting.list;

public class LapTop implements Comparable<LapTop>{
		
		int cost;
		String brand;
		int ram;
		public LapTop(int cost, String brand, int ram) {
			super();
			this.cost = cost;
			this.brand = brand;
			this.ram = ram;
		}
		@Override
		public String toString() {
			return "LapTop [cost=" + cost + ", brand=" + brand + ", ram=" + ram + "]";
		}
		@Override
		public int compareTo(LapTop o) {
			
			String s = this.brand;
			String d = o.brand;
			return s.compareToIgnoreCase(d);			
		}
		
//		@Override
//		public int compareTo(LapTop l) {
//			
//			Integer i = this.cost;
//			Integer j =  l.cost;
//			return i.compareTo(j);
//			
//			
//		}
}
