package csc.example;

public class exercise3 {

	static double function(double x) {
	      return Math.pow(x,3) - 0.5*x;
	   }
	
	 static double integrate(double a, double b, int N) {
	      double h = (b - a) / N;              // step size
	      double sum = 0.5*(function(a) + function(b));   
	      for (int i = 1; i < N; i++) {
	         double x = a + h * i;
	         sum = sum + function(x);
	      }

	      return sum * h;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(integrate(1,5,1000));

	}

}
