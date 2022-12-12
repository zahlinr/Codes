
/**
 *
 * @author Zahlin
 */
//import statement
import java.util.Scanner;
// public class statement
public class HomeWork4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //variable start
       String sCustomerName = "";
       int totalNoOfServices = 0;
       int nCount = 0;
       int nDiscount = 0;
       double dPrice = 0;
       double dSalesTax = 0;
       double dTaxRate = 0.065;
       double dTotal = 0;
       boolean facePaintingSelected = false;
       boolean ballonTwistingSelected = false;
       boolean puppetShowSelected = false;
       boolean stiltWalkersSelected = false;
       boolean bounceHouseSelected = false;
       boolean rockWallSelected = false;
       boolean pettingZooSelected = false;
       double dPriceBeforeTax = 0;
       double dTotalAmountDue = 0;
       // end variables
       
       // Customer input and menu printouts
        System.out.println("Welcome To Fantasy Entertainment");
        System.out.println("Please Enter Your Name: ");
        sCustomerName = input.nextLine();
        System.out.println("Menu");
        System.out.println("1. Face Painting .... ..$50");
        System.out.println("2. Ballon Twisting  ....$45");
        System.out.println("3. Puppet Shows ........$55");
        System.out.println("4. Stilt Walkers .......$60");
        System.out.println("5. Bounce House ........$80");
        System.out.println("6. Rock Wall ...........$70");
        System.out.println("7. Petting Zoo .........$65");
        System.out.println("10.Exit");
        System.out.println("*************************************************************"); 
        System.out.println("*                      PROMOTION 1                          *");
        System.out.println("*  If you select Face Painting and Balloons -> $10 OFF      *");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("*                      PROMOTION 2                          *");
        System.out.println("*       If you select all options -> $80 OFF                *");
        System.out.println("*************************************************************");
         System.out.println("please Select Your Options: ");
        totalNoOfServices = input.nextInt();
       //End Customer Inputs
       //While Loop for chosing items on the menu 
        while (totalNoOfServices != 10) {
            if (totalNoOfServices == 1) {
                dTotal = (dTotal + 50);
                facePaintingSelected = true;
            } else if (totalNoOfServices == 2){
                dTotal = (dTotal +45);
                 ballonTwistingSelected = true;
            } else if (totalNoOfServices == 3) {
              dTotal =(dTotal + 55);
              puppetShowSelected = true;
            } else if (totalNoOfServices == 4) {
                dTotal = (dTotal + 60);
                stiltWalkersSelected = true;
            } else if (totalNoOfServices == 5) {
                dTotal = (dTotal + 80);
                bounceHouseSelected = true;
            } else if (totalNoOfServices == 6) {
                dTotal = (dTotal + 70);
                rockWallSelected = true;
            } else if (totalNoOfServices == 7) {
                dTotal = (dTotal +65);
                pettingZooSelected = true;
            }
              nCount++;
              System.out.print("Enter Another Option: ");
              totalNoOfServices = input.nextInt();
               }// end while loop all closing braces in if/else
        // statement for calculating discount
        if (facePaintingSelected == true && ballonTwistingSelected == true &&  puppetShowSelected == true && stiltWalkersSelected == true && bounceHouseSelected == true && rockWallSelected == true && pettingZooSelected == true ){
           nDiscount = 80;
    } else if (facePaintingSelected == true && ballonTwistingSelected == true){
    }
       // end of discoutn calculations
       // variable calculations
       dPriceBeforeTax = (dTotal - nDiscount);
       dSalesTax = (dTaxRate * dPriceBeforeTax);
       dTotalAmountDue = (dPriceBeforeTax + dSalesTax);
       // end vairables calculations
       // Statement Recipt
        System.out.println("\t");
        System.out.println("Thank you for ordering with Fantasy Entertainment, " + sCustomerName);
        System.out.println("Total Services Ordered: " + nCount);
        System.out.println("Price For The Services: " + dPriceBeforeTax);
        System.out.println("Sales Tax: $" + dSalesTax);
        System.out.println("Total Amount Due: $" + dTotalAmountDue);
        System.out.println("You Saved: $" + nDiscount);
       // end of Recipt statement      
    
            
       
       
       
       
       
       
       
       
    }// end main method
    
}// end class HomeWork$
