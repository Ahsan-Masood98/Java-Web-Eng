/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractice1;

import java.util.Arrays;

/**
 *
 * @author Ahsan PC
 */
public class SimpleArrayList {
    static int[] array = {1,2,3,4,5,6,7,8,9,10};
    public void add (int value){
        int n = array.length;
        int newArr[] = new int[n + 1];
        for(int i=0; i<n; i++){
            newArr[i]= array[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        SimpleArrayList l1 = new SimpleArrayList();
        l1.add(14);
    }
}
