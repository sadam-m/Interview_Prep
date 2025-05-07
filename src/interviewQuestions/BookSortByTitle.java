package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSortByTitle implements  Comparable<BookSortByTitle>{

    String title;

    BookSortByTitle(String title){
        this.title=title;
    }

    @Override
    public int compareTo(BookSortByTitle another) {

        return  this.title.compareTo(another.title);
    }

    public static void main(String[] args) {

        BookSortByTitle book1=new BookSortByTitle("organic chemistry");
        BookSortByTitle book2=new BookSortByTitle("Law of physics");
        BookSortByTitle book3=new BookSortByTitle("Spring in action");

        List<BookSortByTitle> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (BookSortByTitle book:books){
            System.out.println(book.title);
        }

        Collections.sort(books);

        System.out.println("sorted by title");

        for (BookSortByTitle book:books){
            System.out.println(book.title);
        }
    }
}
