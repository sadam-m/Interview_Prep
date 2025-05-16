package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import interviewQuestions.BookSortByAuthorCompartor;
import interviewQuestions.BookSortByTitleCompartor;

public class Book {

    String author;
    String title;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.title,this.author);
    }

    @Override
    public boolean equals(Object object){

        if (this==object) return  true;
        if (object==null || getClass()!=object.getClass()) return  false;
        Book obj=(Book)object;
        return  this.title.equals(obj.title) && this.author.equals(obj.author);
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

//        Equals method
        Book book4=new Book("hello","world");
        Book book5=new Book("hello","world");

        System.out.println("equals() check");

        System.out.println(book4==book5);

    }
}
