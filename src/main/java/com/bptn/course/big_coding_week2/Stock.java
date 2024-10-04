package com.bptn.course.big_coding_week2;

public class Stock {
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;

	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {

		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0.00;
		this.marketCap = (long) totalShares * price;
	}

	public void adjustPrice(int change) {
		price += change;
		percentChange = ((double) change / price) * 100;
		marketCap = (long) totalShares * price;
	}

	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n" + "Current Price: $" + price
				+ " (" + percentChange + "%)" + "\n" + "Market Cap: $" + marketCap;
	}

}
