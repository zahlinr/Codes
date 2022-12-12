/**
 *
 * @author Zahlin
 */

import java.util.Scanner; //importing scanner

public class UniversityElections { //start UniversityElections class   
    
    public static final int SIZE = 6; //declaring global constant for array sizes
    public static final double PERCENTAGE = 100.0; //declaring global constant for percentage calculation
    
    
    
    public static void main(String[] args) { //start main method
        //initializing and declaring variables
        String[] saCandidateName = new String[SIZE]; //initializing the candidate name array
        int[] naNumberOfVotes = new int[SIZE]; //initializing the nymber of votes array
        double[] daPercentageOfVotes = new double[SIZE]; //initializing the percentage of votes array
        int nCount = 0; //initializing and declaring the ncount variable
        int nTotalVotes = 0; //initializing and declaring the total number of votes variable

        
        Scanner input = new Scanner(System.in); //initializing the scanner
        
        //data collection
        for (nCount=0;nCount<SIZE;nCount++){ //start data collection for loop
            System.out.print("Please enter the candidate's name: "); //prompting the user to enter the candidate's name
                saCandidateName[nCount] = input.next(); //scanner receiving the candidate's name
            System.out.print("Please enter the number of votes: "); //prompting the user to enter the number of votes
                naNumberOfVotes[nCount] = input.nextInt(); //scanner receiving the number of votes
            System.out.println(""); //empty line for formatting
        } //end data collection for loop
        //end data collection
        
        //calculating total number of votes
        nTotalVotes = TotalVotesCalculation(naNumberOfVotes); //calling the TotalVotesCalculation mathod to calculate the total number of votes
        
        
        //calculating percentage of votes
        for (nCount=0;nCount<SIZE;nCount++){ //start percentage calculation for loop
            daPercentageOfVotes[nCount] = (naNumberOfVotes[nCount]/(double)nTotalVotes)*PERCENTAGE; //calculating the percentage of votes each candidate received
        } //end percentage calculation for loop
       
        
        System.out.println(""); //empty line for formatting
        System.out.println(""); //empty line for formatting
        System.out.println(""); //empty line for formatting
        
        //displaying data
        System.out.printf("%-10s%-10s%-10s\n", "Candidate", "Votes", "Percentage"); //printing the table headers
        
        for (nCount=0;nCount<SIZE;nCount++){ //start candidate data display for loop
            System.out.printf("%-10s%-10d%-2.2f%%\n", saCandidateName[nCount], naNumberOfVotes[nCount], daPercentageOfVotes[nCount]); //printing the candidate name, number of votes received and the percentage of votes received
        } //end candidate data display for loop
        
        System.out.printf("%-10s%-10d\n", "Total", nTotalVotes); //printing the total number of votes

    } //end main method
    
    
    public static int TotalVotesCalculation(int[] naTotVotes){ //start total votes calculation method
        //intitializing and declaring variables
        int nTotal = 0; //initializing and declaring the total variable
        int nIndex = 0; //initializing and declaring the nIndex variable
        
        //calculating the total number of votes
        for (nIndex=0;nIndex<SIZE;nIndex++){ //start total vote calculation for loop
            nTotal = nTotal + naTotVotes[nIndex]; //calculating the total number of votes
        } //end total vote calculation for loop
        
        return nTotal; //returning the calculated total to the main method
        
    } //end total votes calculation method
    
    
} //end UniversityElections class

/**
    *sample input:
    *John 5000
    *Santiago 4000
    *Tim 7000
    *Michael 2500
    *Peter 1800
    *Lucas 3000
*/
