/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractice1;

import java.util.LinkedList;

import java.util.Queue;

/**
 *
 * @author Ahsan PC
 */
public class queuePractice {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue " + q);

        //Add elemnt into queue
        q.offer(10);
        System.out.println(q);
        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);
      
        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);

        //retrives but dont removes from the head of the queue
        int getValue = q.element();
        System.out.println("Value at the head of queue-" + getValue);

        //retrives and removes from the head of the queue
        int pull = q.poll();
        System.out.println("pulling " + pull);
    }
}
