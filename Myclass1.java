import java.util.Scanner;
public class Myclass1
{   int x;
    float a;
    float b;
    String c;   
                      
                      
   Myclass1(int x)
   {
    this.x=x;
    System.out.println("IN CONSTRUCTOR 1 INTEGER VALUE="+this.a);}                   
     
                    
   Myclass1(float a, float b)
   {
    this.a=a;
    this.b=b;
    System.out.println("IN CONSTRUCTOR 2 FLOAT VALUE 1="+this.a);
    System.out.println("IN CONSTRUCTOR 2 FLOAT VALUE 2="+this.b);
    }
   
                    
   Myclass1(String c)
   {
    this.c=c;
    System.out.println("IN CONSTRUCTOR 3 STRING VALUE="+this.c);
   
   }                 
                      
    
  public static void main(String args[])
  { Myclass1 obj1=new Myclass1(50);
    Myclass1 obj2=new Myclass1(4.5f,6.5f);
    Myclass1 obj3=new Myclass1("Kinshuk");
    
  }



}
