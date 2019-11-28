package com.ustgobal.beanobject.bean;

public class Accountant {

	private int accNo ;
	private long contNo;
	
	public void setAccNo(int accNo) 
	{
		if(accNo >=0 && accNo <= 12)
		{
			
			System.out.println("invalid"); 
		}
		else {
			this.accNo = accNo;	
		}
	}
	public int getAccNo() {
		return accNo;
	}
	
	public void setContNo(long contNo) 
	{
		if(contNo>0 && contNo<11) 
		{
			System.out.println("contact invalid");	
		} else
		{
				
			this.contNo = contNo;
		}
	}

	public long getContNo() {
		return contNo;
	}

}
