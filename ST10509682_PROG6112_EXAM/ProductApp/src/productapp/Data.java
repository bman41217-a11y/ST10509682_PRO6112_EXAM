/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productapp;

/**
 *
 * @author bshon
 */
public class Data {
    private String customerName;
    private String product;
    private String price;
    
    public Data(String customerName, String product, String price){
        this.customerName = customerName;
        this.product = product;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public String getPrice() {
        return price;
    }
    
    
}
