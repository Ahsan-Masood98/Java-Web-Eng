/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter subject 1 name");
        String a = in.nextLine();
        Scanner b1 = new Scanner(System.in);
        System.out.println("enter subject 2 name");
        String b = in.nextLine();
        Scanner c1 = new Scanner(System.in);
        System.out.println("enter subject 3 name");
        String c = in.nextLine();
        Scanner d1 = new Scanner(System.in);
        System.out.println("enter subject 4 name");
        String d = in.nextLine();
//        
        Scanner input = new Scanner(System.in);
        System.out.println("enter total number of subject 1 ");
        int e = input.nextInt();
        Scanner f1 = new Scanner(System.in);
        System.out.println("enter obtain number of subject 1 ");
        int f = input.nextInt();
        Scanner g1 = new Scanner(System.in);
        System.out.println("enter total number of subject 2 ");
        int g = input.nextInt();
        Scanner h1 = new Scanner(System.in);
        System.out.println("enter obtain number of subject 2 ");
        int h = input.nextInt();
        Scanner i1 = new Scanner(System.in);
        System.out.println("enter total number of subject 3");
        int i = input.nextInt();
        Scanner j1 = new Scanner(System.in);
        System.out.println("enter obtain number of subject 3");
        int j = input.nextInt();
        Scanner k1 = new Scanner(System.in);
        System.out.println("enter total number of subject 4");
        int k = input.nextInt();
        Scanner l1 = new Scanner(System.in);
        System.out.println("enter obtain number of subject 4 ");
        int l = input.nextInt();
//        

        int subtotal = f + h + j + i;

        System.out.println(" ________________________________");

        System.out.println("| SUBJET  |   TOTAL  |   OBTAIN  |");
        System.out.println("|" + "  " + a + "   " + "|" + "   " + e + "    " + "|" + "   " + f + "      " + "|");
        System.out.println("|" + "  " + b + "   " + "|" + "   " + g + "    " + "|" + "   " + h + "      " + "|");
        System.out.println("|" + "  " + c + "   " + "|" + "   " + i + "    " + "|" + "   " + j + "      " + "|");
        System.out.println("|" + "  " + d + "   " + "|" + "   " + k + "    " + "|" + "   " + l + "      " + "|");

        System.out.println(" ________________________________");
        System.out.println("                   subtotal =" + subtotal);
        // TODO code application logic here
    }

}

// System.out.println("|" + a + "|" +  e  + "|" +  f + "|");
//         System.out.println("|" + b + "|" +  g  + "|" +  h + "|");
//         System.out.println("|" + c + "|" +  i  + "|" +  j + "|");
//         System.out.println("|" + d + "|" +  k  + "|" +  l + "|");
