package Fall_2015.ite303;

import java.util.Date;

/**
 * Hussein Ahmed ID:13-00312
 */
public abstract class Publication extends Publisher {
    private static int publicationCounter = 0;
    private String publicationTitle;
    private Date publicationDate;
    private Publisher publisher;

    public Publication(String publicationTitle, Date publicationDate, Publisher publisher) {
        super(publisher.getPublisherName(), publisher.getPublisherAddress(), publisher.getContactName());
        this.publicationTitle = publicationTitle;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        publicationCounter++;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublicationCounter() {
        return publicationCounter;
    }

    public abstract void printDetails();
}
