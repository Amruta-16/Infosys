package com.first_java;

import java.util.Scanner;

public class Arrayavg {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=s.nextInt();
		int[]array=new int[size];
		
		System.out.println("Enter array values:");
		for(int i=0;i<size;i++)
		{
			int value=s.nextInt();
			array[i]=value;
		}
		int length=array.length;
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		double avg=sum/length;
		System.out.println("avg of array:"+avg);
				

	}

}
