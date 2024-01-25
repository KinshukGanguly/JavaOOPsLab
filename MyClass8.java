import java.util.Scanner;
public class MyClass8
{
 
 public static void main(String args[])
 {  Scanner sc=new Scanner(System.in);
   int a,b,choice;
   System.out.println("Enter numbers");
   a=sc.nextInt();
   b=sc.nextInt();
   System.out.println("Enter choice-\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
   choice=sc.nextInt();
   System.out.print("Result=");
   switch (choice){
   
    case 1:
    System.out.println(a+b);
            break;
   
    case 2:
    System.out.println(a-b);
            break;
            
    case 3:
    System.out.println(a*b);
            break;
                    
    case 4:
    System.out.println(a/b);
            break;
            
    default:
    System.out.println("Invalid choice");
            
   
   } 
 
 
 }


}
