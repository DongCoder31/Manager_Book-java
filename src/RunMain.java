import Main.ManagerBook;
import Modun.Book;
import Utils.Menu;
import Utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        ManagerBook mn = new ManagerBook(bookList);
        int i;

        do {
            Menu.menu();
            do {
                i = Validate.getInt(scanner,"Choice: ");
                if ((i < 1) || (i > 4))
                    System.out.println("Enter a number from 1 to 6");
            } while ((i < 1) || (i > 4));

            switch (i) {
                case 1-> {
                    mn.addbook();
                    System.out.println();
                }
                case 2 -> {
                    mn.showAllBook();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Averege price: " + mn.calculate());
                    System.out.println();
                }
                case 4 -> System.out.println("Program is finished");
            }
        } while (i != 4);

    }
}
