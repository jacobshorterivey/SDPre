import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int userNum;

    System.out.println("Enter a number: ");
    userNum = input.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("The number is even.");
    }
    else
      System.out.println("The number is odd.");
  }
}
