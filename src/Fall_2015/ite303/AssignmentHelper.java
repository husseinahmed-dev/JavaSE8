package Fall_2015.ite303;

import java.util.Calendar;
import java.util.Date;

/**
 * Hussein Ahmed ID:13-00312
 */
public class AssignmentHelper {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Cisco Press", "Indianapolis, Indiana", "Pearson Education");
        Publisher publisher2 = new Publisher ("Microsoft Press", "Silicon Valley", "Microsoft");


        Book ciscoBook1 = new Book("CCNP Security SISAS 300-208 Official Cert Guide", new Date(2015, Calendar.JULY, 27), publisher1,
                "1587144263", "978-1587144264", "Aaron T. Woland");
        Book ciscoBook2 = new Book("Cisco ASA: All-in-one Next-Generation Firewall, IPS, and VPN Services",
                new Date(2014, Calendar.MAY, 10), publisher1, "1587143070", "978-1587143076", "Jazib Frahim, Omar Santos, Andrew Ossipov");

        publisher1.addPublication(ciscoBook1);
        publisher1.addPublication(ciscoBook2);
        publisher1.printAllPublications();

        System.out.println("\n\n");

        Book microsoftBook1 = new Book("Exam Ref 70-412 Configuring Advanced Windows Server 2012 R2 Services",
                new Date(2014, Calendar.MARCH, 25), publisher2, "0735673616", "978-0735673618", "J.C. Mackin, Orin Thomas");
        Book microsoftBook2 = new Book("Exam Ref 70-696 Managing Enterprise Devices and Apps (MCSE)",
                new Date(2015, Calendar.JANUARY, 2), publisher2, "0735695598", "978-0735695597", "Orin Thomas");
        publisher2.addPublication(microsoftBook1);
        publisher2.addPublication(microsoftBook2);
        publisher2.printAllPublications();
    }
}
