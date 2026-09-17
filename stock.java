package com.portfolioproject.model;

public class stock 
{
      private String stockid;
     private String stockname;
     private double Price;

	public stock(String stockid, String stockname,double Price)
	{ 
	this.stockid=stockid;
	this.stockname=stockname;
	this.Price=Price;
	
	

	}

	public String getStockid() {
		return stockid;
	}

	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
