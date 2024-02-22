public class Example2
{ static int instant_count=0;
   
  Example2()
  {
   System.out.println("instance created successfully");
   instant_count++;  
  }
  
  
  
  
 public static void main(String args[])
 {
   Example2 obj1=new Example2();
    
   Example2 obj2=new Example2();
   
   Example2 obj3=new Example2();
   
   Example2 obj4=new Example2();
   
   Example2 obj5=new Example2();
   
   
   System.out.println("Number of instances created-"+instant_count);
  
 }

}
