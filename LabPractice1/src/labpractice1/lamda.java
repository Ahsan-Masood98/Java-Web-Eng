/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractice1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ahsan PC
 */
abstract interface animal {

    public void printanimal();

}

public class lamda {

    public static void main(String[] args) {
        List l1 = new LinkedList();
        l1.add("cow");
        l1.add("cat");
        l1.add("dog");

        animal a = () -> {
            System.out.println(l1);
        };
        a.printanimal();
    }
}
