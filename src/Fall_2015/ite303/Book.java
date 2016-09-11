package Fall_2015.ite303;

import java.util.Date;

/**
 * Hussein Ahmed ID:13-00312
 */
public class Book extends Publication {
    private static int bookCounter = 0;
    private String ISBN_10;
    private String ISBN_13;
    private String authorName;

    public Book(String publicationTitle, Date publicationDate, Publisher publisher, String ISBN_10,
                String ISBN_13, String authorName) {
        super(publicationTitle, publicationDate, publisher);
        this.ISBN_10 = ISBN_10;
        this.ISBN_13 = ISBN_13;
        this.authorName = authorName;
        bookCounter++;
    }

    public void setISBN_10(String ISBN_10) {
        this.ISBN_10 = ISBN_10;
    }

    public String getISBN_10() {
        return ISBN_10;
    }

    public void setISBN_13(String ISBN_13) {
        this.ISBN_13 = ISBN_13;
    }

    public String getISBN_13() {
        return ISBN_13;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookCounter() {
        return bookCounter;
    }


    @Override
    public void printDetails() {
        System.out.printf("%s%n%s%n", "Printing Book Details", "----------------------");
        System.out.printf("Title: %s%nPublication Date: %s%nPublisher ID: %d%nPublisher Name: %s%nISBN-10: %s%nISBN-13: %s%nAuthor: %s%n%n",
                getPublicationTitle(), getPublicationDate(), getPublisherID(), getPublisherName(),
                getISBN_10(), getISBN_13(), getAuthorName());
    }
}
