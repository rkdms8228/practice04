package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		
		double average = 0;
		
		for(int i = 0; i<num.length; i++) {
			
			num[i] = sc.nextInt();
			average = average+num[i];
			
		}
		
		System.out.println("평균은 "+(average/5)+"입니다.");

		sc.close();

	}

}
