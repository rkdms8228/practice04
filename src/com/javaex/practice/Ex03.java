package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i = 0; i<intA.length; i++) {
			System.out.println(intA[i]);
		} //intA가 본인의 값을 가지고 있음. intB와 같다고 선언. 하지만 intB는 두 번째 값이 없음.
		  //해서 intA은 두 번째 즉, intA[1]의 값이 원래 자신이 초기화 했던 값을 출력할 것으로 예상
		  //20, 6, 10

	}

}
