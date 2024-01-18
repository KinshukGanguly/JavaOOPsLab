class D
{

 int a;
 int b;
 
 D()
 {
  a=16;
  b=17;
  System.out.println("Default values->a="+a+" b="+b);  
 }


public static void main(String args[])

 {
    D obj=new D();
   
    //modifying default values
    obj.a=56;
    obj.b=58;
    System.out.println("Modified values->a="+obj.a+" b="+obj.b);
 
 }
 


}
