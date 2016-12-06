 class A{
		int a;
		A(){
			a=10;	
		
		}
		
	}
 
 class B extends A{
		int b;
		int a;
		B(){
			//a = 5;
		super.a = 5;
			this.a = 9;
		}
		
		
	}
public class nestedclass {

	/*public class A{
		int a;
		A(){
			a=10;			
		}
		
	}
	public class B extends A{
		int b;
		B(){
			b=9;
		}
		
		
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declare inner class
		//nestedclass nest = new nestedclass();
		//nestedclass.A obj1 = nest.new A();

		
		A obj1 = new B();

		B obj2 = new B();
		//child class cannot declare with constructor of parent class but parent class can

System.out.println(obj1.a +" " + obj2.a);



	}

}
