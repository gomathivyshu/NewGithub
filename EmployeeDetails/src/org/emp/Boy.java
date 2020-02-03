package org.emp;

import java.util.Scanner;

public class Boy {

	public static void main(String[] args) {
		
		String s = "OrderNo ABX1245 is placed";
		
		System.out.println(s);
		
		//Substring - to print the string from particular index position
		
		String substring = s.substring(6);
		System.out.println(substring);
		
		//begin nd end index
		String substring2 = s.substring(0,3);
		System.out.println(substring2);
		
	}
}
