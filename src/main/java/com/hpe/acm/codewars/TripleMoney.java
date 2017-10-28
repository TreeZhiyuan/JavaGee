package com.hpe.acm.codewars;

/*
 * https://www.codewars.com/kata/money-money-money
 * 
 * @author cuizh
 *
 */
public class TripleMoney {

	public static void main(String[] args) {
		int years = TripleMoney.calculateYears(1000, 0.05, 0.18, 1100);
		System.out.println(years);
	}

	/**
	 * formula for calculating the needed years principal reach expected number
	 * Always have space to refactor your code
	 * 
	 * @param principal
	 * @param interest
	 * @param tax
	 * @param desired
	 * @return
	 */
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		int years = 0;
		while (principal < desired) {
			// principal = principal + principal*interest*(1-tax);
			principal += principal * interest * (1 - tax);
			years++;
		}
		return years;
	}

}
