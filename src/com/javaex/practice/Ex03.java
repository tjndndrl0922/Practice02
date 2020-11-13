package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//나이가 20세 초과면 "1번그룹입니다."
		//나이가 20세 이하면 '2번그룹입니다'
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\"");
		}
		
		else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
				
				
				
		sc.close();
	}
}
