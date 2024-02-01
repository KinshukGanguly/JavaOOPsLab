import java.util.Scanner;
public class Emp2
{   int a;
  String b;
  float c;
   
   
  public void show()
  {
   System.out.println("INTEGER VALUE="+a+" STRING VALUE="+b);
  }
   
  public static void main(String args[])
  { 
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter string value");
  String s=sc.nextLine();
  
  System.out.println("enter int value");
  int m=sc.nextInt();
  
  Emp2 obj1=new Emp2();
  obj1.a=m;
  obj1.b=s;
    
    obj1.show();
   
  }
  }

