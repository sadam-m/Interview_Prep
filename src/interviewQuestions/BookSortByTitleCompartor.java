package interviewQuestions;

import java.util.Comparator;

public class BookSortByTitleCompartor implements Comparator<Book> {

    public int compare(Book book1,Book book2){

        return book1.title.compareTo(book2.title);
    }
}
