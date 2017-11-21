package com.coderlong.test;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()){
			String temp = scanner.nextLine();
			System.out.println("input is " + temp);
			System.out.println("input length is " + temp.length());
		}
	}

}
