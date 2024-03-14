interface Bank
{

int getInterestRate();//abstract methid
 
}


class BankA implements Bank
{
public int getInterestRate()
 {
  return 8;
 
 }
}

class MainClassBank2
{
 public static void main(String args[])
 {
   BankA obj=new BankA();
   System.out.println("BankA rate of interest-"+obj.getInterestRate()); 
 }
}
