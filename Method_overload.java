public class Method_overload
{

 void m1(int x)
 { 
  System.out.println("METHOD FORM 1 INTEGER VALUE-"+x);
 }


 void m1(float a, float b)
 {
  System.out.println("METHOD FORM 2 FLOAT VALUE 1-"+a+"FLOAT VALUE 2-"+b);
 }


 void m1(String c)
 {
   System.out.println("METHOD FORM 3 STRING VALUE-"+c);
 }


 public static void main(String args[])
 {
  Method_overload obj1= new Method_overload();
  obj1.m1(56);
  obj1.m1(56.25f,78.14f);
  obj1.m1("Kinshuk");
  
 }
}
