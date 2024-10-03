import java.util.Scanner;

public class IT24101603Lab7Q1B 
{
    public static void main(String[] args)   
    {
        int Mark1,Mark2,Mark3,Mark4,Sum;
        int i;
        double Average;
        Scanner input = new Scanner(System.in);

        for (i = 1; i <= 3; i++) 
        {
            System.out.println("Student " + i);
            System.out.print("Enter Marks: ");
            Mark1 = input.nextInt();
            Mark2 = input.nextInt();
            Mark3 = input.nextInt();
            Mark4 = input.nextInt();

            Sum = Mark1 + Mark2 + Mark3 + Mark4;
            Average = Sum / 4.0;

            System.out.println("Average is : "+ Average);

            if (Average > 75) 
            {
                System.out.println("Overall Grade is: Distinction");
            } 
            else if (Average > 50) 
            {
                System.out.println("Overall Grade is: Credit");
            } 
            else 
            {
                System.out.println("Overall Grade is: Fail");
            }
            System.out.println();
        }
    }
}