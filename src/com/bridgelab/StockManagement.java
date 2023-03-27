package com.bridgelab;

import java.util.Scanner;

public class StockManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of stocks");
		int n=sc.nextInt();
		StockPortFolio port=new StockPortFolio();
		for(int i=1;i<=n;i++) {
		    System.out.println("name : ");
			String name=sc.next();
			System.out.println("no of shares");
			int NumShare=sc.nextInt();
			System.out.println("share price");
			double SharePrice=sc.nextDouble();
			
			Stock stock=new Stock(name,NumShare,SharePrice);
			port.addStock(stock);
		}
		port.printStockReport();
	}

}
