import java.util.Scanner;
class MyClass5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
if(a==0)
System.out.println("Neither even nor odd");
else if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}
