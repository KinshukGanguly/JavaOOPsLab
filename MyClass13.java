import java.util.Scanner;
import java.util.Arrays;
public class MyClass13
{
 
 public static void main(String args[])
 { Scanner sc=new Scanner(System.in);
   float avg=0.0f;
   System.out.println("Enter length of array-");
   int length=sc.nextInt();
   int a[]=new int[length];
   
   System.out.println("Enter elements of the array-");
   for (int i=0;i<length;i++)
   {
     a[i]=sc.nextInt(); 
     avg+=a[i];
   
   }
   System.out.println("Average-"+(avg/length));
   System.out.println(Arrays.toString(a));
   
   
  } //end of main
 
 
 }//end of class



