package com.mk.practice.java;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {

		System.out.println("Enter two integers: ");
		Scanner input = new Scanner(System.in);

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("The sum: " + (num1 + num2));
	}

}
