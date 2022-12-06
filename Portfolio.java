package com.day11_12_OOPs;

public class Portfolio {
	private String stockName;
	private int numberOfShares;
	private double sharePrice;
	private double totalValueOfShares;
	public final String getStockName() {
		return stockName;
	}
	public final void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public final int getNumberOfShares() {
		return numberOfShares;
	}
	public final void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public final double getSharePrice() {
		return sharePrice;
	}
	public final void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public final double getTotalValueOfShares() {
		return totalValueOfShares;
	}
	public final void setTotalValueOfShares(double totalValueOfShares) {
		this.totalValueOfShares = totalValueOfShares;
	}
	@Override
	public String toString() {
		return "Portfolio [stockName=" + stockName + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice
				+ ", totalValueOfShares=" + totalValueOfShares + "]";
	}
	
	
	

}
