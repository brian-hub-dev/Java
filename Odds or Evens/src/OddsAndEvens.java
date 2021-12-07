import java.util.*;

public class OddsAndEvens {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Let’s play a game called \"Odds and Evens\"");
    System.out.print("What is your name? ");
    String name = input.next();
    System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens ?");
    String letter = input.next();

    if (letter.equals("O")) {
      System.out.println(name + " has picked odds! THe computer will be evens.");
    } else {
      System.out.println(name + " has picked evens! THe computer will be odds.");
    }

    System.out.println("----------------------------------------------");

    System.out.print("How many \"fingers\" do you put out?");
    int userNumber = input.nextInt();

    Random rand = new Random();
    int computerNumber = rand.nextInt(6);

    System.out.println("The computer plays " + computerNumber + " \"fingers\".");

    System.out.println("----------------------------------------------");
    int sum= userNumber + computerNumber;
    System.out.println(userNumber + " + " + computerNumber + " = " + sum);

    boolean oddOrEven = sum % 2 == 0;
    if(oddOrEven) {
      System.out.println(sum + " is ...... even!");
      if (letter.equals("E")){
        System.out.println("That means" + name +" wins! :)");
      } else {
        System.out.println("Sorry the computer wins");
      }
    } else {
      System.out.println(sum + " is ...... odd!");
      if (letter.equals("O")){
        System.out.println("That means" + name +" wins! :)");
      } else {
        System.out.println("Sorry the computer wins");
      }
    }
    System.out.println("----------------------------------------------");
  }
}
