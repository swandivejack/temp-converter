package edu.cnm.deepdive;

import java.util.*;
import java.lang.Math;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    convert(input);
  }

  public static double celsiusToFahrenheit(double celsius) {

    return 9 * celsius / 5 + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {

    return (fahrenheit - 32) * 5 / 9;
  }


  private static void convert(Scanner scanner) {
    try {
      String line;
      while (!(line = scanner.nextLine().trim()).isEmpty()) {
        char finalChar = line.toUpperCase().charAt(line.length() - 1);
        if (finalChar == 'C') {
          double celcius = parseTemperature(line);
          System.out.printf("%.3f F%n", celsiusToFahrenheit(celcius));
        } else if (finalChar == 'F') {
          double fahrenheit = parseTemperature(line);
          System.out.printf("%.3f C%n", fahrenheitToCelsius(fahrenheit));
        }
      }
    } catch (NoSuchElementException expected) {}
  }

  private static double parseTemperature(String line) {
    line = line.substring(0, line.length() - 1).trim();
    return Double.parseDouble(line);
  }

}
