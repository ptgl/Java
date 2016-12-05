package csc.example;

import java.util.Scanner; 
import java.util.*;

public class exercise1 {
	
	
	public static boolean checkPalindrome(int num){
		
		String s = Integer.toString(num);
		for(int i = 0, j = s.length()-1; i < s.length()/2; i++, j--)
		{
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner( System.in );
		   int n;
		   int sumOdd = 0, sumEven = 0;

		   System.out.print("input size ");
		   n=input.nextInt();
		   int arr[] = new int[n];
		   System.out.print("input elements ");
		   for (int i = 0; i < n; i++)
		   {
			   arr[i]=input.nextInt();
			   if(arr[i] % 2 == 0){
				   sumEven+=arr[i];
			   }else{
				   sumOdd+=arr[i];
			   }
			   
			   if(checkPalindrome(arr[i])){
				   System.out.println("Palindrome number is "+arr[i]);
			   }

		   }
		   System.out.println("Sum of odd numbers: "+sumOdd+"\nSum of even numbers: "+sumEven);

	}

}
