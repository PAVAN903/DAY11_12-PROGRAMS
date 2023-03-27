package com.bridgelab;

import java.util.ArrayList;
import java.util.List;

public class StockPortFolio {
	List<Stock> stcks=new ArrayList<>();
	void addStock(Stock stock) {
		stcks.add(stock);
	}
	public double totalValue() {
		double TotalValue=0;
		for(Stock stocks:stcks) {
			TotalValue+=stocks.getValue();
			}
		return TotalValue;
	}
	  public void printStockReport() {
	        System.out.println("Stock Report");
			System.out.println(String.format("%-10s %10s %10s %10s",
	                "Name", "Shares", "Price", "Value"));
	        System.out.println("------------------------------------------");
	        for (Stock stock : stcks) {
	            System.out.println(stock);
	        }
	        System.out.println("------------------------------------------");
	        System.out.println(String.format("%-30s %10.2f", "Total value of portfolio:", totalValue()));
	    }

}
