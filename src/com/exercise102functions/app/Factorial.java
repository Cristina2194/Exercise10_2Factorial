package com.exercise102functions.app;
import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		//Variables declaration
		long factorial = 1;
		int number=-1;
		//Objects construction
		Scanner input =new Scanner(System.in);
		do
		{
			System.out.println("Number to calculate factorial");
			number=input.nextInt();
			if(number<0)
			{
				System.out.println("You must input a positive value");
			}
		}while (number<0);
		
		factorial = Givefactorial(number);
		{
			System.out.println("The factorial of "+ number+"is: \t"+factorial+"\n wich is gotten by multiplying several times "+number);
		}
	}
		public static long Givefactorial (int n)
		{
			int factorial = 1;
			for(int i=1;i<=n;i++)
			{
				factorial=factorial*i;
			}
		return factorial;
		}
		/*public static long GiveFactorial(double n)
		{
			return 0;
		}
		*/
}
