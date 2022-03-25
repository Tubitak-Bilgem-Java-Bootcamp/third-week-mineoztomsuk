import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {



        Book book1 = new Book("Vadideki Zambak", 302, "Balzac", 1230);
        Book book2 = new Book("Antikacı Dükkanı", 255 , "Dostoevsky", 1326);
        Book book3 = new Book("Suç ve Ceza", 384 , "Dostoyevski", 1512);
        Book book4 = new Book("Siyah Lale", 240, "A.Dumas",6523);
        Book book5 = new Book("Nana ", 293, "Emıle Zola",1416);

        TreeSet<Book> bookSetName = new TreeSet<>();

        bookSetName.add(book1);
        bookSetName.add(book2);
        bookSetName.add(book3);
        bookSetName.add(book4);
        bookSetName.add(book5);

        for (Book book:bookSetName) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }

        System.out.println("ikinci kez set tipinden bir veri yapısı");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNum() - b2.getPageNum();
            }
        }.reversed());

        bookSetPageNum.add(book1);
        bookSetPageNum.add(book2);
        bookSetPageNum.add(book3);
        bookSetPageNum.add(book4);
        bookSetPageNum.add(book5);

        for (Book book:bookSetPageNum) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }



    }
}
