import java.util.Scanner; 
public class Program2{

        static int add (int a, double b) {
        return a + (int)b;
    }
   
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter integer:");
        int  n = input.nextInt();
        System.out.println("enter double:");
        double  d = input.nextDouble();
        System.out.println("Integer input is " + n);
        System.out.println("double input is " + d);


        int result = add (n, (int)d);
        System.out.println("Sum is " + result);
    }  
      
       
        }