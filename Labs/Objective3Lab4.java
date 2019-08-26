import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your first name: ");
    firstName = input.next();
    System.out.println("Enter your last name: ");
    lastName = input.next();
    System.out.println("Enter your age: ");
    age = input.nextInt();

    System.out.println("First Name: " + firstName + " Last Name: " + lastName + " Age: " + age);

    input.close();
  }
}
