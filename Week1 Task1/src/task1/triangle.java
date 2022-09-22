/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

public class triangle {

    public static void main(String[] args) {
        int i, j, row = 6;

        for (i = 0; i < row; i++) {

            for (j = row - i; j > 1; j--) {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
