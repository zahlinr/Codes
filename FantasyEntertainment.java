/**
 *
 * @author Lynes
 */

import java.util.Scanner; //importing scanner

public class FantasyEntertainment { //start FantasyEntertainment class

    public static void main(String[] args) { //start main method
    Scanner input = new Scanner (System.in); //initializing the scanner
    
    //declaring variables
    String sCustomerName = ""; //initializing customer name variable
    int nServicePurchased = 0; //initializing service purchased variable
    double dPriceOfServices = 0.0; //initializing price of services variable
    double dTotalPriceOfServices = 0.0; //initializing total price of services variable
    double dSalesTax = 0.0; //initializing sales tax variable
    double dTotalAmtDue = 0.0; //initializing total amount due variable
    double dAmtSaved = 0.0; //initializing amount saved variable
    int nCount = 0; //initializing the count variable for when statement
    boolean bFacePainting = false; //initializing face painting variable
    boolean bBaloonTwisting = false; //initializing baloon twisting variable
    boolean bPuppetShows = false; //initializing puppet shows variable
    boolean bStiltWalkers = false; //initializing stilt walkers variable
    boolean bBounceHouse = false; //initializing bounce house variable
    boolean bRockWall = false; //initializing rock wall variable
    boolean bPettingZoo = false; //initializing petting zoo variable
    //end declaring variables
    
    //declaring constants
    final double SALES_TAX = 6.5; //declaring sales tax constant
    final int FACE_PAINTING = 50; //declaring face painting price constant
    final int BALOON_TWISTING = 45; //declaring baloon twisting price constant
    final int PUPPET_SHOWS = 55; //declaring puppet shows price constant
    final int STILT_WALKERS = 60; //declaring stilt walkers price constant
    final int BOUNCE_HOUSE = 80; //declaring bounce house price constant
    final int ROCK_WALL = 70; //declaring rock wall price constant
    final int PETTING_ZOO = 65; //declaring petting zoo price constant
    final int PROMOTION_1 = 10; // declaring promotion 1 amount constant
    final int PROMOTION_2 = 80; //declaring promotion 2 amount constant
    final int EXIT_MENU = 10; //declaring exit menu constant
    
    //start title text body
        System.out.println("Welcome to Fantasy Entertainment"); //printing the welcome message
        System.out.println(""); //empty line for formatting
        System.out.print("Please Enter your name: "); //prompting customer to enter name
            sCustomerName = input.nextLine(); //scanner receiving customer name
    //end title text body
    
    //start menu body
        System.out.println(""); //empty line for formatting
        System.out.println("Menu"); //printing menu header
        System.out.println("1. Face Painting .......$" + FACE_PAINTING); //printing option 1 with price
        System.out.println("2. Baloon Twisting .....$" + BALOON_TWISTING); //printing option 2 with price
        System.out.println("3. Puppet Shows ........$" + PUPPET_SHOWS); //printing option 3 with price
        System.out.println("4. Stilt Walkers .......$" + STILT_WALKERS); //printing option 4 with price
        System.out.println("5. Bounce House ........$" + BOUNCE_HOUSE); //printing option 5 with price
        System.out.println("6. Rock Wall ...........$" + ROCK_WALL); //printing option 6 with price
        System.out.println("7. Petting Zoo .........$" + PETTING_ZOO); //printing option 7 with price
        System.out.println("10. Exit"); //printing exit menu option
        System.out.println("*************************************************************"); //printing asterix for formatting 
        System.out.println("*                          PROMOTION 1                      *"); //printing promotion 1 title
        System.out.println("*     if you select Face Painting and Baloons -> $" + PROMOTION_1 + " OFF    *"); //printing promotion 1 details
        System.out.println("*************************************************************"); //printing asterix for formatting
        System.out.println(""); //empty line for formatting
        System.out.println("*************************************************************"); //printing asterix for formatting
        System.out.println("*                          PROMOTION 2                      *"); //printing promotion 2 title
        System.out.println("*           if you select all options -> $" + PROMOTION_2 + " OFF            *"); //printing promotion 2 details
        System.out.println("*************************************************************"); //printing asterix for formatting
    //end menu body
    
    //start customer input
        System.out.print("Please select your options:"); //prompting customer to enter their option
            nServicePurchased = input.nextInt(); //scanner receiving the entered option
            
        while (nServicePurchased != EXIT_MENU);{ //start while statement for when chosen option is not equal to the exit menu constant
            nCount ++; //adding 1 to the nCount variable
            if (nServicePurchased == 1){ //if statement for option 1
                dPriceOfServices = dPriceOfServices + (double)FACE_PAINTING; //adding option 1 price to price of services variable
                bFacePainting = true; //setting face painting variable to true
            } //end if statement for option 1
            else if (nServicePurchased == 2){ //if statement for option 2
                dPriceOfServices = dPriceOfServices + (double) BALOON_TWISTING; //adding option 2 price to price of services variable
                bBaloonTwisting = true; //setting baloon twisting variable to true
            } //end if statement for option 2
            else if (nServicePurchased == 3){ //if statement for option 3
                dPriceOfServices = dPriceOfServices + (double) PUPPET_SHOWS; //adding option 3 price to price of services variable
                bPuppetShows = true; //setting puppet shows variable to true
            } //end if statement for option 3
            else if (nServicePurchased == 4){ //if statement for option 4
                dPriceOfServices = dPriceOfServices + (double) STILT_WALKERS; //adding option 4 price to price of services variable
                bStiltWalkers = true; //setting stilt walkers variable to true
            } //end if statement for option 4
            else if (nServicePurchased == 5){ //if statement for option 5
                dPriceOfServices = dPriceOfServices + (double) BOUNCE_HOUSE; //adding option 5 price to price of services variable
                bBounceHouse = true; //setting bounce house variable to true
            } //end if statement for option 5
            else if (nServicePurchased == 6){ //if statement for option 6
                dPriceOfServices = dPriceOfServices + (double) ROCK_WALL; //adding option 6 price to price of services variable
                bRockWall = true; //setting rock wall variable to true
            } //end if statement for option 6
            else if (nServicePurchased == 7){ //if statement for option 7
                dPriceOfServices = dPriceOfServices + (double) PETTING_ZOO; //adding option 7 price to price of services variable
                bPettingZoo = true; //setting petting zoo variable to true
            } //end if statement for option 7
            
            System.out.print("Enter another option: "); //prompting customer to enter another option
                nServicePurchased = input.nextInt(); //scanner receiving the next option
        } //end while statement for when chosen option is not equal to the exit menu constant
    //end customer input
    
        //determining if discount is applied
        if (bFacePainting == true && bBaloonTwisting == true && bPuppetShows == true && bStiltWalkers == true && bBounceHouse == true && bRockWall == true && bPettingZoo == true){ //if statement for all options chosen
            dAmtSaved = (double)PROMOTION_2; //assigning promotion 2 constant to amount saved variable
        } //end if statement for all options chosen
        else if (bFacePainting == true && bBaloonTwisting == true){ //if statement for first two options chosen
            dAmtSaved = (double)PROMOTION_1; //assigning promotion 1 constant to amount saved variable
        } //end if statement for first two options chosen
        else{ //else statement for no applicable promotion
            dAmtSaved = 0.0; //assigning 0.0 to amount saved variable
        } //end else statement for no applicable promotion
        
        //calculations
        dTotalPriceOfServices = dPriceOfServices - dAmtSaved; //calculating total price of services
        dSalesTax = (SALES_TAX/100) * dTotalPriceOfServices; //calculating sales tax
        dTotalAmtDue = dTotalPriceOfServices + dSalesTax; //calculating total amount due
        //end calculations
        
        //start footer output
        System.out.println(""); //empty line for formatting
        System.out.println("Thank you for ordering with Fantasy Entertainment, " + sCustomerName); //printing thank you with customer name variable
        System.out.println("Total services ordered: " + nCount); //printing number of services with count variable
        System.out.println("Price for the services: $" + dTotalPriceOfServices); //printing price for services with total price of services variable
        System.out.println("Sales Tax: $" + dSalesTax); //printing sales tax amount with sale tax variable
        System.out.println("Total amount due: $" + dTotalAmtDue); //printing total amount due with total amount due variable
        System.out.println("You saved: $" + dAmtSaved); //printing amount saved with amount saved variable
        //end footer output
        
    } //end main method
    
} //end FantasyEntertainment class
