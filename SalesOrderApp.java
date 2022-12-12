/**
 *
 * @author Lynes
 */

import java.util.Scanner;  //importing scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesOrderApp { //start SalesOrderApp class


    public static void main(String[] args) throws FileNotFoundException{ //start main method

    ArrayList<SalesOrder> orderList = new ArrayList<SalesOrder>();    
        
    GenerateSalesOrders(orderList);
    
    System.out.println("SALE ORDERS REPORT");
    
    for (int nIndex=0;nIndex<orderList.size();nIndex++){
    PrintSalesOrderInfo(orderList.get(nIndex));
    }
    
        System.out.println("Total orders: " + orderList.size());
        
    } //end main method
    
    
    public static void GenerateSalesOrders(ArrayList<SalesOrder> list) throws FileNotFoundException{ //start GenerateSaleOrders method
        
    String sFileName = "SalesOrders.txt";
    File FileToOpen = new File(sFileName);
    String sInputLine = "";    
    Scanner inputFile = new Scanner(FileToOpen);
    String[] saTokens = null;
    
    while (inputFile.hasNext()){ //while loop to read the file
        sInputLine = inputFile.nextLine();
        saTokens = sInputLine.split("#");
        SalesOrder sales = new SalesOrder();
        sales.setOrderDate(saTokens[0]);
        sales.setRegion(saTokens[1]);
        sales.setRepresentative(saTokens[2]);
        sales.setPhone(saTokens[3]);
        sales.setItemName(saTokens[4]);
        sales.setUnit(Integer.parseInt(saTokens[5]));
        sales.setUnitCost(Double.parseDouble(saTokens[6]));
        list.add(sales);
        
    } //end while loop to read the file
    
        inputFile.close(); //closing the file
        
    } //end GenerateSaleOrders method
    
    public static void PrintSalesOrderInfo(SalesOrder saleOrder){ //start printSalesOrderInfo method
        
        System.out.println("");
        System.out.println("Order Date: " + saleOrder.getOrderDate());
        System.out.println("Region: " + saleOrder.getRegion().trim());
        System.out.println("Representative: " + saleOrder.getRepresentative().toUpperCase());
        System.out.println("Phone: (" + saleOrder.getPhone().substring(0,3) + ")" + saleOrder.getPhone().substring(3,6) + "-" + saleOrder.getPhone().substring(6));
        System.out.println("Item Name: " + saleOrder.getItemName().substring(0,1).toUpperCase() + saleOrder.getItemName().substring(1).toLowerCase());
        System.out.println("Units: " + saleOrder.getUnit());
        System.out.println("Unit Cost: $" + saleOrder.getUnitCost());
        System.out.println("Total: $" + saleOrder.totalCost());
        System.out.println("");
        
        
    } //end printSalesOrderInfo method
    
} //end SalesOrderApp class
