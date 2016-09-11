package Fall_2015.package1;

public enum Book {
    JHTP("Java How to Program", "2015", "Hussein"),
    CHTP("C How to Program", "2013", "Nazyan"),
    IW3HTP("Internet & World Wide Web How to Program", "2012", "Nma"),
    CPPHTP("C++ How to Program", "2014", "Soma"),
    VBHTP("Visual Basic How to Program", "2014", "Zizo"),
    CSHARPHTP("C# How to Program", "2015", "Halbast");

    private final String title;
    private final String copyrightYear;
    private final String author;

    Book(String title, String copyrightYear, String author) {
        this.title = title;
        this.copyrightYear = copyrightYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public String getAuthor() {
        return author;
    }
}