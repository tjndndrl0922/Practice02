package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int number1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int number2 = sc.nextInt();
		
		if(number1>number2){
			System.out.println("몫: "+number1/number2);
			System.out.println("나머지: "+number1%number2);
		}
		else {
			System.out.println("몫: "+number2/number1);
			System.out.println("나머지: "+number2%number1);
		}
		
		sc.close();
	}
}
