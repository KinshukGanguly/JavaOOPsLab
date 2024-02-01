import java.util.Scanner;
public class Emp
{   String name;
    String dept;
    static String ceo;
    
   
   
  public void show()
  {System.out.println("name="+name+" dept="+dept+" ceo="+ceo);}
   
  public static void main(String args[])
  { Emp obj1=new Emp();
    obj1.name="Akash Bhatt";
    obj1.dept="CSE";
    obj1.ceo="Arun Lal";
    obj1.ceo="Rohit Sen";
    
    Emp obj2=new Emp();
    obj2.name="Rahul Roy";
    obj2.dept="ECE";
    obj2.ceo="Joy Dutta";
    
    Emp obj3=new Emp();
    obj3.name="Rakshit Majumder";
    obj3.dept="CSE";
    obj3.ceo="Arun Sisodia";
    
    obj1.show();
    obj2.show();
    obj3.show();
      
  }



}

