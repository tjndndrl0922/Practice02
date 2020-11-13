package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String sign = sc.nextLine();
		
		System.out.print("숫자1: ");
		double number1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double number2 = sc.nextDouble();
				
		double plus = number1+number2;
		double minus = number1-number2;
		double multiply = number1*number2;
		double division = number1/number2;
		
		switch(sign) {
		case "+" :
			System.out.println("결과는: "+plus);
			break;
		case "-" :
			System.out.println("결과는: "+minus);
			break;
		case "*" :
			System.out.println("결과는: "+multiply);
			break;
		case "/" :
			if(number2==0 || number1==0){
				System.out.println("계산할 수 없습니다.");
			}else {
				System.out.println("결과는: "+division);
			}
			break;
		default :
			System.out.println("계산할 수 없는 기호입니다.");
	}
		
		/*
		if(sign.equals("+")) {
			System.out.println("결과는 "+plus);
		}else if(sign.equals("-")){
			System.out.println("결과는 "+minus);
		}else if(sign.equals("*")) {
			System.out.println("결과는 "+multiply);
		}else if(sign.equals("/")) {
			if(number2==0 || number1==0) {
				System.out.println("계산할 수 없습니다.");
			}else{
				System.out.println("결과는 "+division);
			}
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		*/
	
		sc.close();
	}
}
