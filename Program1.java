import java.util.Scanner;
public class Program1 {
    
   static double add(double a, double b) {
    return a + b;
}
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("enter double:");
         double  n = input.nextDouble();
         System.out.println("enter double:");
         double  d = input.nextDouble();
         System.out.println("Double input is " + n);
         System.out.println("Double input is " + d);
           
            double result = add (n, d);
            System.out.println("result is " + result);
        input.close();  
    }
     
    }