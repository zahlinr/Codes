/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Zahlin
 */
import java.util.Scanner;
public class HomeWork3 {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // To receive the data
      String customerName = "";
      String typeofCust = "";
      // varaibles start
      int booksPurchased = 0;// amount of books purchased
      int memberType = 0;// If user enter 1 for regular and 2 for premium
      double price = 0.0; // cost of books
      int freeBooks = 0; // Number of free books
      final double book_Reg_Cust_Price = 12.95;
      final double book_Prem_Cust_Price = 11.49;
      int totalBooksReceived = 0; // Number of free books
      double priceBeforeTax = 0; // books before sales tax
      final double taxRate = 0.065; //rate of 6.5 percent
      double salesTax = 0; // sales tax percentage
      double totalAmount = 0; // final sale with tax
      String memberType4= "";// user status 
      
      
      //start of customer input
      System.out.print("Enter Name: ");
        //Receive the customer name
       customerName = input.next(); 
       //customer's name
        System.out.print("Enter Member Type:  ( Enter 1 for regular 2 for premium)");
        memberType = input.nextInt();
        
        System.out.print("Number Of Books Purchased: ");
        booksPurchased = input.nextInt();
        // end of customer input
        
        // Selection start of regular membership
        //Regular customers
        if (memberType == 1){
            price = 12.95;
            // recognizing free books
            if (booksPurchased < 8){
                freeBooks = 0;
            }
            else if(booksPurchased >=8 && booksPurchased <=12){
                freeBooks = 1;
            }
            else if (booksPurchased > 12){
                freeBooks = 2;
            }
            memberType4 = "Regular";
             }// end of validation for regular customers
        
        // to validate Premium Customer
        else if (memberType == 2){
           price = 11.49; 
           // free books for premium customers
            if (booksPurchased < 6){
                freeBooks = 0;
            }
            else if(booksPurchased >=6 && booksPurchased <=9){
                freeBooks =1;
            }
            else if (booksPurchased > 9){
                freeBooks = 2;
            }
            memberType4 = "Premium";
        }// end validation for premium customers
        // toal number of books received
        totalBooksReceived = booksPurchased + freeBooks;
        priceBeforeTax = booksPurchased * price;
        salesTax = taxRate*priceBeforeTax;
        totalAmount = booksPurchased * price + salesTax;
        
        // end of calculations
        
        // Receipt output
        System.out.println("     Recipt    ");
        System.out.println("Customer Name; " + customerName);
        System.out.println("Membership Type: " + memberType4);
        System.out.println("Total Number Of Books: " +  totalBooksReceived );
        System.out.println("Price Before Tax: " + priceBeforeTax );
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Total Amount Due: " +totalAmount );
        // Recipt output ending
    
    }
    
}
