package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i<intArray.length; i++) { //<=에서 <로 수정(설정한 크기를 넘어서는 부호)
			result = result+intArray[i];
		}
		
		System.out.println(result);
		//모든 값의 합이 나올 것으로 예상 --> 22

	}

}
