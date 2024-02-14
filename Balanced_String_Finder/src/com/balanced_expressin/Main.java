package com.balanced_expressin;

/**
 * Driver class for running the application
 */
public class Main {

	public static void main(String[] args) {
		BracketsBalancer balancer

				= new BracketsBalancer("()");

		balancer.check();

	}

}
