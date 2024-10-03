import java.util.Scanner;

public class IT24101603Lab7Q3 
{
    public static void main(String[] args)   
    {
      int N,i;
      N = 1;
      double Amount,Discount,Total;
      Discount = 0;
      Total = 0;
      char Mode;
      Scanner input = new Scanner(System.in);
      
      for(i = 1; i <=5; i++)
      {
       System.out.println("Customer "+N);
       System.out.print("Enter total bill amount: ");
       Amount = input.nextDouble();
       System.out.print("Enter mode of payment (C for cash, O for other): ");
       Mode = input.next().charAt(0);
       if(Mode == 'C' || Mode == 'c')
       {
        Discount = Amount*(0.05);
        Total = Amount - Discount;
        System.out.println("Discount is : "+Discount);
        System.out.println("Amount to be paid: "+Total);
       }
       else if(Mode == 'O' || Mode == 'o')
       {
        System.out.println("No discount applicable");
        Total = Amount;
        System.out.println("Amount to be paid: "+Total);
       }
       else
       {
        System.out.println("Payment mode is Not Valid");
       }
       System.out.println();
       N++;
       }
     }
}
      
      