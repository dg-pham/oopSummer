package books;

import java.util.ArrayList;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CCNE
 */
public class Books {

    private String bookname;
    private int sum, lending;

    Scanner sc = new Scanner(System.in);

    ArrayList<String> books = new ArrayList();

    public void Scanner() {

        System.out.println("Enter the sum:");
        sum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sum; i++) {
            System.out.println("book" + "" + i + ":");
            bookname = sc.nextLine();
            books.add(bookname);
        }
        System.out.println("Enter the number of books which are borrowed: ");
        lending = sc.nextInt();
        sc.close();
    }

    public void showInfo() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("The library's books");
            System.out.println(books.get(i));
        }

    }

    public int residual() {
        if (sum >= lending) {
            return sum - lending;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Books book = new Books();
        book.Scanner();
        book.showInfo();
        System.out.println("The number of the remaining books: ");
        System.out.println(book.residual());
    }
}
