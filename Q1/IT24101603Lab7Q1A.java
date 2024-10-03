import java.util.Scanner;
 
    public class IT24101603Lab7Q1A
    {
         public static void main(String[] args)
         {
              int Mark_1,Mark_2,Mark_3,Mark_4,Total;
              double Average;
              String Grade;
              Scanner input = new Scanner(System.in);
              System.out.print("Enter Subject Mark 1: ");
              Mark_1 = input.nextInt();
              System.out.print("Enter Subject Mark 2: ");
              Mark_2 = input.nextInt();
              System.out.print("Enter Subject Mark 3: ");
              Mark_3 = input.nextInt();
              System.out.print("Enter Subject Mark 4: ");
              Mark_4 = input.nextInt();
              Average = (Mark_1 + Mark_2 + Mark_3 + Mark_4)/4;
            
              if(Average >= 75)
              {
                  Grade = "Distiction";
              }
              else if(Average >= 50)
              {
                  Grade = "Credit";
              }
              else
              {
                  Grade ="Fail";
              }
              
              System.out.println();
              System.out.println("Average is : "+Average);
              System.out.println("Overall Grade is : "+Grade);
          }
      }
