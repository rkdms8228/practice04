package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 18, 19, 20, 30, 33, 31 };
		
		int count = 0;
		int total = 0;
		
		for(int i = 1; i<data.length; i++) {
			
			if(data[i]%3==0) {
				
				count = (i/i)+count;
				total = data[i]+total;
				
			}
			
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수 => "+count);
		System.out.println("주어진 배열에서 3의 배수의 합 => "+total);
	}

}