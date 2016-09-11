package Fall_2015.package1;
import java.util.EnumSet;
/**
 * Created by Hussein on 6/8/15.
 */
public class EnumTest {
    public static void main(String[] args) {

        System.out.println("All Books");
        for (Book book : Book.values())
            System.out.printf("%-45s%-12s%s%n", book.getTitle(), book.getAuthor(), book.getCopyrightYear());

        System.out.printf("%n%nDisplay range by EnumSet%n");
        for (Book book : EnumSet.range(Book.CPPHTP, Book.CSHARPHTP))
            System.out.printf("%-45s%-12s%s%n", book.getTitle(), book.getAuthor(), book.getCopyrightYear());
    }
}
