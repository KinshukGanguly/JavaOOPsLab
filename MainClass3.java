abstract class Car
{

	//abstract
	 void drive();//declaration of abstract method

	void playmusic()
	{System.out.println("I playing music");
	}
	//abstract class contains concrete functions and declarations of abstract methods
}

//the subclass extending the abstract class needs to provid ethe definition of abstract method which has been declared in the abstract class
class Wagnor extends Car
{
    void drive()
    {
     System.out.println("I am driving wagnor");
    }
}

abstract class Fuel
{
  abstract void capacity();  

}

class MainClass3
{
 public static void main(String args[])
 {
  Wagnor obj=new Wagnor();
  obj.drive();
  obj.playmusic();
 }
}
