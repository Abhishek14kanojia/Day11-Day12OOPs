package com.day11_12_OOPs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
	long accountBalance = 0;

	Scanner sc = new Scanner(System.in);
	List<Portfolio>list = new ArrayList<Portfolio>();
	void Stock() {
		for(int i = 0; i < 10; i++) {
			Portfolio obj = new Portfolio();
			obj.setStockName("Iphone");
			obj.setSharePrice(80000);
			obj.setNumberOfShares(5);
			
			double totalValue = obj.getTotalValueOfShares() * obj.getSharePrice();
			obj.setTotalValueOfShares(totalValue);
			list.add(obj);
			
		}
	}
	
	void credit() {
		int amount = 150000;
		accountBalance = accountBalance + amount;
		System.out.println(accountBalance);
	}
	void debit() {
		long debitAmount = 120000;
		if (debitAmount>accountBalance) {
			System.out.println("debit amount is greater then accout balance");
			
		}else {
			long remainingammount = accountBalance - debitAmount;
			System.out.println(remainingammount);
		}
	}
	
	void result () {
		for (Portfolio i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
	Function obj1 = new Function();
	System.out.println("Stoke is : ");
	obj1.Stock();
	System.out.println("Result is : ");
	obj1.result();
	obj1.credit();
	
	obj1.debit();
	}
	
	
}
