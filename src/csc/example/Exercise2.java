package csc.example;

import java.util.Scanner;
import java.math.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner( System.in );
		 int n;
		 float sum = 0.0F;
		 System.out.println("input n ");
		 n=input.nextInt();
		 for(int i = 1; i <= n; i++)
		 {
			 sum+= Math.pow(-1, i+1)/i;
		 }
		 System.out.println("Sum is "+sum);

	}

}
