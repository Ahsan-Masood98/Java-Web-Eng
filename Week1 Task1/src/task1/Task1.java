/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("case task");
        
       // Scanner input = new Scanner(System.in);
        //System.out.println("enter your character to find vowels");
        //int x = input.nextInt();
        
        char cont = 'y';
        while (cont == 'y' || cont == 'Y') {
            Scanner inp = new Scanner(System.in);
            System.out.println("enter ur char to find vowels");
            char c = inp.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println(" this is a vowel");
                    break;
                case 'e':
                    System.out.println(" this is a vowel");
                    break;
                case 'i':
                    System.out.println(" this is a vowel");
                    break;
                case 'o':
                    System.out.println(" this is a vowel");
                    break;
                case 'u':
                    System.out.println(" this is a vowel");
                    break;
                default:
                    System.out.println(" this is not a vowel");
            }
            Scanner con = new Scanner(System.in);
            System.out.println("Enter n to end or Y to try Again");
            cont = con.next().charAt(0);
        }
        
    }
    
}
