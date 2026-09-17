package com.portfolioproject.model;

public class Asset
{
	private String bookid;
	private String booktitle;
	private double price;
	
	public User(String bookid, String booktitle, double price)
	{
		this.bookid=bookid;
		this.booktitle=booktitle;
		this.price=price;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}