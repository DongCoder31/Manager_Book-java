package Modun;

import Interface.IBook;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class Book implements IBook {
    private int ID;
    private String fullName;
    private String publichDay;
    private String author;
    private String languege;
    private float averagePrice;

    public Book(){
    super();
    }

    public Book(int ID, String fullName, String publichDay, String author, String languege, float averagePrice) {
        super();
        this.ID = ID;
        this.fullName = fullName;
        this.publichDay = publichDay;
        this.author = author;
        this.languege = languege;
        this.averagePrice = averagePrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPublichDay() {
        return publichDay;
    }

    public void setPublichDay(String publichDay) {
        this.publichDay = publichDay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguege() {
        return languege;
    }

    public void setLanguege(String languege) {
        this.languege = languege;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public void inputBook(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        this.ID = (bookList.size() > 0) ? (bookList.size() + 1) : 1;
        this.fullName = Validate.getString(scanner, "Enter full name: ");
        this.publichDay = Validate.getDay(scanner,"Enter Day follow dd/MM/yyyy :");
        this.author = Validate.getString(scanner,"Enter author: ");
        this.languege = Validate.getString(scanner,"Enter languege: ");
        this.averagePrice = Validate.getFloat(scanner,"Enter averagePrice: ");
    }

    @Override
    public void print() {
            System.out.println("ID : " + this.ID + "\t"
                    +"Name: " + this.fullName + "\t"
                    + "Day: " + this.publichDay +"\t"
                    + "Author: " + this.author +"\t"
                    + "languege: " + this.languege +"\t"
                    + "Average Price: " + this.averagePrice +"\t");

    }
}
