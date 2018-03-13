/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;

/**
 *
 * @author barkhapatel
 */
public class DiscountTest {
    public static void main(String[] args){
        Customer c1 = new Customer("Bob",true,"Premium");
        Customer c2 = new Customer("Jack",true,"Silver");
        Customer c3 = new Customer("Mike", false, "noMember");
        
        Visit v1 = new Visit(c1, new Date());
        Visit v2 = new Visit(c2, new Date());
        Visit v3 = new Visit(c3, new Date());
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());

        v1.setProductExpense(10.5);
        v1.setServiceExpense(90.2);
        v2.setProductExpense(13.7);
        v2.setServiceExpense(25.5);
        v3.setProductExpense(11.9);
        v3.setServiceExpense(29.0);
     
        
        System.out.println("Invoice for  " + v1.getName() + " is " + v1.getTotalExpense() + " Discount : " + DiscountRate.getProductDiscountRate(c1.getMemberType()));
        System.out.println("Invoice for " + v2.getName() + " is " + v2.getTotalExpense()+ " Discount : " + DiscountRate.getProductDiscountRate(c2.getMemberType()));
        System.out.println("Invoice for " + v3.getName() + " is " + v3.getTotalExpense()+ " Discount : " + DiscountRate.getProductDiscountRate(c3.getMemberType()));
    }
    
}
