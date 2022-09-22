/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2abstarctioencaps;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class primenumber {
        
 public static void main(String args[]){    
     
     Scanner input = new Scanner(System.in);
        System.out.println("enter the number to find even or odd ");
        int n = input.nextInt();
  int i,m=0,flag=0;      
 //it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
    
} 
    
}
