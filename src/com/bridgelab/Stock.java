package com.bridgelab;

public class Stock {
	String name;
	int NumShare;
	double SharePrice;
	
	public Stock(String name, int numShare, double sharePrice) {
		this.name = name;
		NumShare = numShare;
		SharePrice = sharePrice;
	}
	 double getValue() {
		 return NumShare*SharePrice;
		
	}
	 public String toString() {
		 return String.format("%-10s %10d %10.2f",name,NumShare,SharePrice,getValue());
	 }
	 
	

}
