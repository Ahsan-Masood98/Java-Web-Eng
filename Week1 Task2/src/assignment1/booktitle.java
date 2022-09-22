/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

abstract class Book {

    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

}

class Fiction extends Book {

    public Fiction(String title) {
        super(title);

    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}

class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);

    }

    @Override
    public void setPrice() {
        price = 37.99;
    }

    public static void main(String[] args) {
        Fiction Fiction = new Fiction("Fiction : harry potter");
        Fiction.setPrice();
        NonFiction NonFiction = new NonFiction("NonFiction : calculus");
        NonFiction.setPrice();
        System.out.println("Title: " + Fiction.getTitle());
        System.out.println("Price: " + Fiction.getPrice());

        System.out.println("Title: " + NonFiction.getTitle());
        System.out.println("Price: " + NonFiction.getPrice());
    }
}
