package interviewQuestions;

import java.util.Comparator;

public class BookSortByAuthorCompartor implements Comparator<Book> {


    public int compare(Book book1,Book book2){
        return  book1.author.compareTo(book2.author);
    }
}
