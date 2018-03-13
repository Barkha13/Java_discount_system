/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author barkhapatel
 */
public class Prime{  
  public static void main(String args[]){    
    System.out.println(checkPrime(10));  
    System.out.println(checkPrime(2));  
    System.out.println(checkPrime(0));    
}  

  static String checkPrime(int n){  
        boolean flag = true;    
        if(n == 0||n == 1){  
         return (n+" : number is not prime.");      
        }else{  
         for(int i=2 ;i<=n/2; i++){      
          if(n % i == 0){ 
              flag = false;           
          }      
         }      
         if(flag){ 
             return (n+" : number is prime."); 
         }  
        }
        return (n+" : number is not prime."); 
      }
}
 