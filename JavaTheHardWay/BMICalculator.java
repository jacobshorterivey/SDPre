import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double inches, ft, pounds, m, kg, bmi;

    System.out.print( "Your height (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    m = (inches + (ft*12)) / 39.37;
    kg = pounds / 2.205;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
