public class CreatingVariables {
  public static void main( String [] args ) {
    int x, y, age, temp;
    double seconds, e, checking, chance;
    String firstName, lastName, title, city, state;

    x = 10;
    y = 400;
    age = 39;
    temp = 78;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    chance = 70.5;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    city = "Denver";
    state = "Colorado";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y. " );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "It is " + temp + " degrees, and there is a " + chance + "% chance of rain in " + city + ", " + state);
  }
}
