package com.first_java;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int markA[]=new int[5];
		int i;
		float total=0, avg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Marks for 5 sub:");
		for(i=0;i<5;i++)
		{
			markA[i]=scanner.nextInt();
			total=total+markA[i];
			
		}
		avg=total/5;
		System.out.println("Student's Grade is");
		if(avg>80)
		{
			System.out.println("A");
		}
		else if(avg>60 && avg<=80)
		{
			System.out.println("B");
		}
		else if(avg>40 && avg<=60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
		scanner.close();

	}

}
