package com;

import java.util.Scanner;

public class MergeTwoStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str1=sc.nextLine();
		System.out.println("Enter string2: ");
		String str2=sc.nextLine();
		String rs=str1+","+str2;
		System.out.println(rs);
	}
}
