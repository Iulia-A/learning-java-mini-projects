package com.miniapps.shopapp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ShopApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", Customer.Membership.GOLD);

        Book book1 = new Book("Attitude is everything", 50, "Jeff Keller");
        Book book2 = new Book("How successful people think", 60, "John Maxwell");
        Book book3 = new Book("Harry Potter", 45, "J.K");

        Candy candy1 = new Candy("chocolate", 5, 80);
        Candy candy2 = new Candy("buble gums", 13, 120);
        Candy candy3 = new Candy("cake", 20, 250);

        Basket basket1 = new Basket(customer1);
        basket1.addProduct(book2);
        basket1.addProduct(book1);
        basket1.addProduct(candy3);
        basket1.addProduct(candy1);
        basket1.addProduct(candy2);
        basket1.addProduct(book3);
        basket1.getFinalPrice(customer1);
        customer1.setMembership(Customer.Membership.SILVER);
        basket1.getFinalPrice(customer1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a new customer.\n Please enter the name of the customer: ");
        String nameCustomer = scanner.nextLine();
        Integer status = null;
        Customer customer = new Customer();
        while (status == null) {
            System.out.println("Choose customer's membership status => For GOLD enter 1, for SILVER enter 2, NO membership enter 3, and for exit press 4: ");
            try {
                status = scanner.nextInt();
                switch (status) {
                    case 4:
                        break;
                    case 1:
                        customer = new Customer(nameCustomer, Customer.Membership.GOLD);
                        break;
                    case 2:
                        customer = new Customer(nameCustomer, Customer.Membership.SILVER);
                        break;
                    default:
                        customer = new Customer(nameCustomer, Customer.Membership.WITHOUT);
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Wrong info!");
            }
        }

        Basket basket = new Basket(customer);
        Book book;
        Candy candy;
        String bookName;
        double bookPrice;
        String author;

        String candyName;
        double candyPrice;
        double candyQuantity;

        System.out.println("Create new products~~~\nFor books => enter 1 ~~~ For Candies => enter 2 ~~~ For exit => enter 3.");
        Integer productChoice = null;
        while (productChoice == null) {
            try {
                productChoice = scanner.nextInt();
                switch (productChoice) {
                    case 3:
                        break;
                    case 1:
                        System.out.println("Enter the title of the book: ");
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        System.out.println("Enter the price: ");
                        bookPrice = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter the author: ");
                        author = scanner.nextLine();
                        book = new Book(bookName, bookPrice, author);
                        basket.addProduct(book);
                        basket.getFinalPrice(customer);
                        break;
                    case 2:
                        System.out.println("Enter the name of the candy: ");
                        scanner.nextLine();
                        candyName = scanner.nextLine();
                        System.out.println("Enter the quantity in grams: ");
                        candyQuantity = scanner.nextDouble();
                        System.out.println("Enter the price: ");
                        candyPrice = scanner.nextDouble();
                        candy = new Candy(candyName, candyPrice, candyQuantity);
                        basket.addProduct(candy);
                        basket.getFinalPrice(customer);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (NumberFormatException exc) {
                System.out.println("Wrong info!");

            }
        }
    }
}
