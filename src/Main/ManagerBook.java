package Main;

import Modun.Book;

import java.util.ArrayList;
import java.util.List;

public class ManagerBook {
    private List<Book> bookList = new ArrayList<>();

    public ManagerBook(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addbook(){
        System.out.println("Enter Information Book:");
        Book book  = new Book();
        book.inputBook(bookList);
        bookList.add(book);
    }

    public void showAllBook(){
        System.out.println("List all student: ");
        for (Book book : bookList)
            book.print();
    }

    public float calculate(){
        float sum = 0.0f;
        for (Book book : bookList){
            sum+= book.getAveragePrice();
        }

        return sum/bookList.size();
    }


}
