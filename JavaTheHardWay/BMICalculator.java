import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double inches, pounds, m, kg, bmi;

    System.out.print( "Your height in inches: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    m = inches / 0.0254;
    kg = pounds / 2.205;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
