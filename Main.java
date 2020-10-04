import java.util.Scanner;

/**
 * Write a program that will prompt the user to enter in an integer. The program will then start at 100 and count down by 5 until it gets as low as possible without going past the entered number.

 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner for user input 
    Scanner input = new Scanner(System.in); 
    // ask the user from the number 
    System.out.println("Please enter an integer to count down to"); 

    // Create variable for user input and starting number(100)
    int doTo = input.nextInt();
    int count = 100; 

    System.out.println("Count down:");
    // using a loop to take away 5's from 100 until it's close to the users number 
    while(count > doTo || count == doTo){ 
     
      System.out.println(count); 
      // take away 5 
      count = count - 5; 

    }


    
  }
}
