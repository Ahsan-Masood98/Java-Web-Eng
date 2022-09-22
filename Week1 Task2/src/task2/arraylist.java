/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class arraylist {

    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void add(int value) {

        int n = array.length;
        int newArr[] = new int[n + 1];
        int value1 = value;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            newArr[i] = array[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));
    }

    public void size() {

//        int size = array.length;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            count++;
        }

        System.out.println("size of array is " + count);

    }

    public void remove(int k) {

        int[] temp1 = new int[array.length];

        for (int i = 0; i < temp1.length - 1; i++) {

            if (temp1[i] >= k) {

                temp1[i] = array[i + 1];
                System.out.println(temp1[i]);
            } else {
                temp1[i] = array[i];
                System.out.println(temp1[i]);
            }

        }
    }

    public static void main(String[] args) {

        arraylist ar = new arraylist();

        ar.add(12);

        ar.size();

        ar.remove(5);

    }

}
