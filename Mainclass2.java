

class A1
{

 void m(int x)
 {   System.out.println("Method  form 1. Value=X");
 }

 int m(int x,int y)
 { System.out.println("Method form 2 invoked");
   return x*y;   
  }

 double m(int x, double y)//form 1
 {  System.out.println("Method form 3  invoked");
   
  return x*y; 
 }

}//end of class A1



public class Mainclass2
{

public static void main(String args[])
 {
    A1 obj =new A1();
    obj.m(23);
    int a=obj.m(78,87);
    double b=obj.m(43,98.8);
    System.out.println( a);
    System.out.println( b);           
  

 }


}
