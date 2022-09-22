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
public class oddeven {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter the number to find even or odd ");
        int e = input.nextInt();
        
        if(e%2 == 0 ) {
            System.out.println(e + "is even");
        }
        else {
            System.out.println(e + "is odd number");
        }
        
    }
    
    
    
}
