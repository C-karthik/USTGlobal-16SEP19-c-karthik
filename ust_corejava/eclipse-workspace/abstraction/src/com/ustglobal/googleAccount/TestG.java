package com.ustglobal.googleAccount;

public class TestG {
	public static void main(String[] args) {
		
		Browser b = new Browser();
		
		Google gd = new GoogleDrive();  //upcasting
		b.browse(gd);
		
		Google gg = new Gmail();
		b.browse(gg);
		
	}
	
}
