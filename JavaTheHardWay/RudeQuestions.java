import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age, rating;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println ( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + "." );

    System.out.print( "Oh, and on a scale from 1 - 10, how much do you like pizza? " );
    rating = keyboard.nextInt();

    System.out.println( rating + "? Really? You have questionable taste.");

  }
}

//No, because integers will just be stored as doubles with .00 after them
//No, because numbers can be strings
/*strings blow the program up when I include spaces
ints blow up when I enter doubles
doubles blow up if I enter a comma*/
