package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import interviewQuestions.BookSortByAuthorCompartor;
import interviewQuestions.BookSortByTitleCompartor;

public class Book {

    String author;
    String title;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args) {

        Book book1=new Book("Law of physics","PBA");
        Book book2=new Book("Spring in action","John Bredin");
        Book book3=new Book("Domain driven design","Dominic Dugggan");

        List<Book> books=new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book book:books){
            System.out.println(book.author+" "+book.title);
        }

        System.out.println("After sorting");

        Collections.sort(books,new BookSortByAuthorCompartor());

        for (Book book:books){
            System.out.println(book.author+" "+book.title);
        }

//        Collections.sort(books,new BookSortByTitleCompartor());
//
//        System.out.println("After sorting by title");
//
//        for (Book book:books){
//            System.out.println(book.author+" "+book.title);
//        }

         Collections.sort(books,new BookSortByTitleCompartor().thenComparing(new BookSortByAuthorCompartor()));

        for (Book book:books){
            System.out.println(book.author+" "+book.title);
        }

    }
}
