/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreport;

/**
 *
 * @author bshon
 */
public class Product implements IProducts {
    
    //Method to get the total matrresses sold
    public double GetTotalProductsSold(double[] mattressSales){
        double total = 0;
        for(double sale : mattressSales){
            total += sale;
        }
        return total;
    }
    //method for calculating the average
    public double GetAverageProductSold(double mattressSales){
        return mattressSales * 0.02;
    }
    //method for gettig the most popular mattress
    public int GetMostPopularProductSold(double[] mattressSales){
        int topIndex = 0;
        for(int i = 1; i < totalSales.length; i++){
           if(totalSales[i] > totalSales[topIndex]){
               topIndex = i;
           } 
        }
        return topIndex;
    }
    
    
    
}
