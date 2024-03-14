class Bank
{
 int Interestrate()
 {return 0;}

}

class Axis extends Bank
{
 int Interestrate()
 {return 8;}
}

class ICICI extends Bank
{
 int Interestrate()
 {return 10;}
}

class MainClassBank
{ public static void main(String args[])
  {
   Axis obj1=new Axis();
   ICICI obj2=new ICICI();
    System.out.println("AXIS-"+obj1.Interestrate());
    System.out.println("ICICI-"+obj2.Interestrate());  
  }
}
