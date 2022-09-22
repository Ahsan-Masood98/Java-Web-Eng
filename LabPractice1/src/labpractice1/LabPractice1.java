/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpractice1;

interface Animal {

    public abstract void AnimalSound();

    public abstract void Sleep();
}

class Cat implements Animal {

    public void AnimalSound() {
        System.out.println("The Cat say: Meow");
    }

    public void Sleep() {
        System.out.println("The Cat say: zzzZZZ");
    }
}

class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.AnimalSound();
        myCat.Sleep();
    }
}
