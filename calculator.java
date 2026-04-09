import java.util.Scanner;
public class Calculator {

    static int add (int num1, int num2){
        return num1 + num2;
         }
         static int subtract (int num1, int num2){
            return num1 - num2;
         }  

            static int multiply (int num1, int num2){
                return num1 * num2;
            }

            static int divide (int num1, int num2){
                if(num2==0){
                    System.out.println("error: division by zero");
                    return 0;
                } else {
                    return num1 / num2;
                }
            }

    public static void main (String[] args){
       
            
        Scanner input =new Scanner(System.in);

        while(true){
        System.out.println("Welcome to the calculator program!");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("0.exit program");
        
        System.out.println("enter your choice");
        int Choice = input.nextInt();

      if(Choice ==0){
        System.out.println("exiting program");
        break;
      }
      System.out.println("enter first number:");
      int num1=input.nextInt();
     System.out.println("enter second number:");
      int num2=input.nextInt();


      switch (Choice){
        case 1:
        System.out.println("result is " + add(num1, num2));
        break;  

        case 2:
        System.out.println("result is " + subtract(num1, num2));
        break;

        case 3:
        System.out.println("result is " + multiply(num1, num2));
        break;  

        case 4:
        System.out.println("result is " + divide(num1, num2));
        break;

        default:
        System.out.println("invalid choice");
        break; 
         
      }
     

    }
    input.close();
}
} 
