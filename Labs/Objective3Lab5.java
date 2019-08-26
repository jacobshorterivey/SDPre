import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    double a,b,c;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 1st number: ");
    a = input.nextDouble();

    System.out.println("Enter 2nd number: ");
    b = input.nextDouble();

    c = a+b;
    System.out.println("The sum of " + a + " + " + b + " = " +  c);

  }
}
