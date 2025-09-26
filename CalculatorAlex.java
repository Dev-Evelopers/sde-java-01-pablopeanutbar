import java.util.Scanner;

// Abstract class
abstract class Calculator {
    public abstract int add(int a, int b);
}

// Adder class
class Adder extends Calculator {
    
    public int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a + b;
    }
}

// Multiplier class
class Multiplier {
    public int multiply(int a, int b, Calculator calculator) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = calculator.add(result, a); // use Adder to add repeatedly
        }
        return result;
    }
}

//  Main class

public class CalculatorAlex {
    public static void main(String[] args) {
        

        // Create objects
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number:");
       int a = sc.nextInt();
       System.out.println("enter second number:");
       int b = sc.nextInt();



        // Solution class
        
        // Testing Addition
        System.out.println("Testing Addition");
        int sum = adder.add(a, b);
        System.out.println("Sum = " + sum);

        // Testing Multiplication
        System.out.println("Testing Multiplication");
        int product = multiplier.multiply(a, b, adder);
        System.out.println("Product = " + product);
        sc.close();
    }
}