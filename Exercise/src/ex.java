
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Scanner;
import java.util.regex.*;
import java.lang.Math;


public class ex {
	 boolean [] b = new boolean[3];
	  int count = 0;

	    void set(boolean [] x, int i) 
	    {
	        x[i] = true;
	        ++count;
	    }
	    
	    void test() 
	    {
	        if ( b[0] && b[1] | b[2] )
	            count++;
	        if (true && b[(++count - 2)] )
	            count += 7;
	        System.out.println("count = " + count);
	    }
	    
	public void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	      String line = "abc\\sfd\\opui";
	      String pattern = "(.*)\\\\([a-z]+)\\\\(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) );
	      }else {
	         System.out.println("NO MATCH");
	      }
	/*	
		int[][] arry = {{1,2},{3,4,5}};
		String x = new String("xyz");
		String y = "abc";
		x = x + y;
		//System.out.println(x);
		String[] s = "I say ".split(" ");
		
		for(String a : s)
		{
			System.out.println("token "+a);
			
		}
		*/
		/*System.out.println("foo"+true);
		
		String Str = new String("Hello");
		Str.concat(" world");		
		System.out.println(Str );
		StringBuffer sb = new StringBuffer("aaa");
		sb.append(" bbb");
		System.out.println(sb );*/
		
		
		
		
		
		
		
		
	/*	ex ba = new ex();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();*/
     
		/* InputStreamReader isr =new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(isr); 
		
	     System.out.println("Radius ");
	     String str = br.readLine();
	     System.out.print(str);
	     System.out.println("Radius2 ");
	     String str2 = br.readLine();
	     System.out.print(str2);*/
	/*int h =9;
double r = Math.pow(8.9,0.8);

Scanner cin = new Scanner(System.in);
int a = 3;
//int a = cin.nextInt();
//String num = cin.nextLine();
int[] f = new int[a];

	String arr[] = new String[a];*/
	
	/*for(int i=0; i < a; i++)
{
	System.out.println("input data");
	String n = cin.nextLine();
	//int b = cin.nextInt();
	System.out.println("data: "+n);
}*/

	/*int i = 65;
	char c = (char)i;*/
	//System.out.println("mmm"+c);
	
	
	
	}

}
