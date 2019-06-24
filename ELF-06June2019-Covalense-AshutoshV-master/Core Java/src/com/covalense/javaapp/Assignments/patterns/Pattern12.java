package com.covalense.javaapp.assgn.patterns;


public class Pattern12 {
	public static void main(String[] args) {
		int n=20;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1||i==j||i==0||j==0||i==n-1||j==n-1||i==n/2||j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
