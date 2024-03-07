class Computer
{
	void display()
	{ System.out.println("I am in class computer");}
}

class Laptop extends Computer
{    void display()
	{ 
	  System.out.println("I am in class laptop");
	}
}

class Tablet extends Computer
{
	void display()
	{ 
	  System.out.println("I am in class tablet");
	}

}
public class MainClass1
{    


	public static void main(String args[])
	{
        //Computer ref;
		Computer obj1=new Computer();		
		Laptop obj2=new Laptop();
		Tablet obj3=new Tablet();

		//computer parent class itself
		//ref=obj1;
		obj1.display();
         System.out.println(obj1.hashCode());
		//laptop class method
		obj1=obj2;
		obj1.display();
          System.out.println(obj1.hashCode());
		//tablet class
		obj1=obj3;
		obj1.display();
          System.out.println(obj1.hashCode());

	}


}
