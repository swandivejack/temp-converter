import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double fahrenheitInput;
        
        fahrenheitInput = input.nextDouble();
        System.out.println(fahrenheitToCelsius(fahrenheitInput));
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        
        fahrenheit = 9 * celsius / 5 + 32;
        
        return fahrenheit;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        
        celsius = (fahrenheit - 32) * 5 / 9;
        
        return celsius;
    }
}
