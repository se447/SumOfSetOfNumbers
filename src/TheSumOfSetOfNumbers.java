/*
Sum of a set of numbers
Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
*/
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //read int n from user
        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        // need sum, iterator count in loop
        int sum = 0;
        int i = 1; //iterator
        
        while (i <= limit) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
