package Fall_2015.ite303;

import java.util.ArrayList;

/**
 * Hussein Ahmed ID:13-00312
 */
public class Publisher {
    private static int publisherCounter = 0;
    private int publisherID;
    private String publisherName;
    private String publisherAddress;
    private String contactName;
    private ArrayList<Publication> publications = new ArrayList<>();

    public Publisher(String publisherName, String publisherAddress, String contactName) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.contactName = contactName;
        publisherCounter++;
        publisherID = publisherCounter;
    }

    public int getPublisherCounter() {
        return publisherCounter;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void printPublisherDetails() {
        System.out.printf("%s%n%s%n", "Publisher Details", "-------------------");
        System.out.printf("Publisher ID: %d%nPublisher Name: %s%nAddress: %s%nContact Person: %s%n",
                getPublisherID(), getPublisherName(), getPublisherAddress(), getContactName());
    }

    public void printAllPublications() {
        String title = String.format("All publications for %s", getPublisherName());
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < getPublications().size(); i++)
            getPublications().get(i).printDetails();
    }

    public void addPublication(Publication publication) {
        getPublications().add(publication);
    }
}
