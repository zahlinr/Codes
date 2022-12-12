/**
 *
 * @author Zahlin
 */

import java.util.Scanner;

public class ArraysPractice { //start ArraysPractice class
    
    
    public static void main(String[] args) { //start main method
    
    Scanner input = new Scanner(System.in); //declaring and initializing the scanner    
        
    int[] numList = new int[3]; //initializing and declaring the Array
    int total = 0; //initializing and declaring the total variable
    int i = 0; //initializing and declaring the index variable
    
    for (i=0;i<numList.length;i++){//start receiving for loop
        System.out.print("Please enter a number: "); //promting the user to enter a number
            numList[i] = input.nextInt(); //scanner receiving number entered by user
    } //end receiving for loop
    
    for (i=0;i<numList.length;i++){ //start calculation for loop
        total = total + numList[i]; //calculating total of entered numbers
    } //end calculating for loop
    
        System.out.println("The total of the entered numbers is: " + total);
    } //end main method
    
} //end ArraysPractice class
