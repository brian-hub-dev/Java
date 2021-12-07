import java.util.Scanner;

public class TripPlanner {


  public static void main(String[] args){
    greeting();
    budget();
  }

  public static void greeting(){
    String welcome = "Welcome to Vacation Planner!";
    Scanner input = new Scanner(System.in);
    System.out.println(welcome);
    System.out.print("What is your name? ");
    String name = input.nextLine();
    System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
    String place = input.nextLine();
    System.out.println("Great! " + place + " sounds like a great trip");
    System.out.println("*************");
  }

  public static void budget(){
    Scanner input = new Scanner(System.in);
    System.out.print("How many days are you going to spend traveling? ");
    int days = input.nextInt();
    System.out.print("How much money, in USD, are you planning to spend on your trip? ");
    double amount = input.nextDouble();
    System.out.print("What is the tree letter currency symbol for your travel destination? ");
    String symbol = input.next();
    System.out.print("How many " + symbol + " are there in 1 USD? ");
    int convert = input.nextInt();
    System.out.println("*************");

    int hours = days * 60;
    int minutes = hours * 60;

    System.out.println("If you are travelling for " + days + " that is the same as " + hours + " hours or " + minutes + " minutes");

    double amountPerDay = amount / days;

    System.out.println("If you are going to spend $" + amount + " USD that means per day you can spend up to $" + amountPerDay +" USD");

    double localCurrency = amount * convert;
    double localCurrencyPerDay = localCurrency / days;

    System.out.println("Your total budget in " + symbol + " is " + localCurrency + " " + symbol + ", which per day is "  + localCurrencyPerDay + " " + symbol);


  }

}
