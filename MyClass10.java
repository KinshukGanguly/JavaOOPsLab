import java.util.Scanner;
public class MyClass10
{
 
 public static void main(String args[])
 {  Scanner sc=new Scanner(System.in);
   int n,sum=0;
   System.out.println("Enter number");
   n=sc.nextInt();
   while(n>0)
   {
   sum=sum+n%10;
   n/=10;   
   }
   System.out.println("SUM="+sum);
  }  
 
 }



