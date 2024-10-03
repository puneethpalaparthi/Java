import java.util.*;
class Exe 
{
    public static void main(String[] args) 
    {
        int a = 10, result = 0;
        for (int b = 10; b >= 0; b--) 
        {
            try {
                result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}
