/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swaping;

/**
 *
 * @author Administrator
 */
public class Swaping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int a= 5;
        int b=6;
        int temp;
        
        temp = a;
        a=b;
        b=temp;
        
        
        System.out.println("a value is" + a);
        System.out.println("b value is" + b);
        
        
        int c= 6;
        int d=5;
        
        c= c+d;
        d = c-d;
        c=c-d;
        
        
        System.out.println("c value is" + c);
        System.out.println("d value is" + d);
        
    }
    
}
