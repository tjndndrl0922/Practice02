package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		int number1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int number2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int number3 = sc.nextInt();
		
		if(number1<number2 && number1<number3) {
			System.out.println("가장 작은수는 "+number1+" 입니다.");
		}
		
		else if(number2<number1 && number2<number3) {
			System.out.println("가장 작은수는 "+number2+" 입니다.");
		}
		
		else {
			System.out.println("가장 작은수는 "+number3+ " 입니다.");
		}
		
		sc.close();
		
	}

}
