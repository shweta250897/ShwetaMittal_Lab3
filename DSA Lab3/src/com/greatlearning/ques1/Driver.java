package com.greatlearning.ques1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression to check if the brackets are balanced or not");
		String expression = sc.nextLine();
		if(BalancingBracket.areBracketsBalanced(expression))
			System.out.println("The entered string has balanced brackets");
		else
			System.out.println("The entered string do not contain balanced brackets");
		sc.close();
	}

}
