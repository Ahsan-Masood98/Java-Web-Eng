/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

import java.util.Scanner;

class Bank {

    String name;
    int id;
    int balance = 5000;

    public int withdrwal(int a) {
        int total = balance - a;
        System.out.println("your total balnce after withdrwal is " + total);
        return total;
    }

    public void details() {
        name = "Ahsan";
        id = 201;
        balance = 5000;

        System.out.println(name);
        System.out.println(id);
        System.out.println(balance);

    }

    public int Deposit(int a) {

        int total = balance + a;
        System.out.println("your total balnce after deposit is " + total);
        return a;
    }

}

public class methodcalling {

    public static void main(String[] args) {
        Bank bk = new Bank();
        Scanner choice = new Scanner(System.in);
        System.out.println(" 1 for withdrwal :  2 for user detail : 3 for deposit ");
        int choic = choice.nextInt();

        switch (choic) {
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.println("amount to withdraw ");
                int withdrwaw = input.nextInt();

                bk.withdrwal(500);

                break;

            case 2:

                bk.details();

                break;

            case 3:

                Scanner in = new Scanner(System.in);
                System.out.println("amount to withdraw ");
                int deposit = in.nextInt();
                bk.Deposit(deposit);

                break;

            default:

                System.out.println("invalid");

        }

    }

}
