package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double revenue = sc.nextDouble();
		double tax=0;
	
		
		if(revenue>=0 && revenue<=1000) {
			tax = 0.09*revenue;
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(revenue>1000 && revenue<=4000){
			tax = 1000*0.09+0.18*(revenue-1000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(revenue>4000 && revenue<8000) {
			tax = 1000*0.09 + 3000*0.18+0.27*(revenue-4000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(revenue>=8000) {
			tax = (1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(revenue-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}

}
