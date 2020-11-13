package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int number1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int number2 = sc.nextInt();
		
		if(number1>number2) {
			if(number1%number2==0) {
				System.out.println(number2+"는(은) "+number1+"의 약수입니다.");
			}else {
				System.out.println(number2+"는(은) "+number1+"의 약수가 아닙니다.");
			}
		}else {
			if(number2%number1==0) {
				System.out.println(number1+"는(은) "+number2+"의 약수입니다.");
			}else {
				System.out.println(number1+"는(은) "+number2+"의 약수가 아닙니다.");
			}
				
		}
		
		sc.close();
	}				
				
}
