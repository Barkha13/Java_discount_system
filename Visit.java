/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
/**
 *
 * @author amipatel
 */
public class Visit {
    private Customer cust;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(Customer cust, Date date){
        this.cust = cust;
        this.date = date;
    }
    
    public Customer getName(){
        return cust;
    }
    
    public double getServiceExpense(){
        return serviceExpense;
    }
    
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense += serviceExpense;
    }
    public double getProductExpense(){
        return serviceExpense;
    }
    
    public void setProductExpense(double productExpense){
        this.productExpense += productExpense;
    }
    
    public double getTotalExpense(){
        double totalService = serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(cust.getMemberType()));
        double totalProduct = productExpense - (productExpense * DiscountRate.getProductDiscountRate(cust.getMemberType()));
        return totalService + totalProduct;

    }
    
    @Override
    public String toString(){
        return ("** Visit info ** " +
                "Customer name :" + cust.getName() +
                ", Member : " + cust.isMember() +
                ", Membertype : " + cust.getMemberType() +
                ", Date : " + date);
    }
    
}
