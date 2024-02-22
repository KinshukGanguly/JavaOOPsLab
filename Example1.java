public class Example1
{

	static int a;
	int b;

	void display()
		{
		  System.out.println("Object parameters- a(STATIC)="+a+" b(NON STATIC)="+b);

		}
		
	public static void main(String args[])
		{ Example1 obj1=new Example1();
		  Example1 obj2=new Example1();
		  Example1 obj3=new Example1();

		  obj1.a=5;
		  obj1.b=10;
		  
		  obj2.a=34;
		  obj2.b=20;
		  
		  obj3.a=24;
		  obj3.b=30;
		  
		  
                  obj1.display();
                  obj2.display();
                  obj3.display();
       
		}

}
