package Exam02;

/**
 * Created by Hussein on 4/9/16.
 */
class Link {
    public int iData;       // data item (key)
    public double dData;    // data item
    public Link next;   // next link in list

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
/////////////////////////////////////////////////////////////////////
class LinkList {
    private Link first;     // ref to first link on list

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at start of list
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);    // make new link
        newLink.next = first;               // newLink --> old first
        first = newLink;                    // first --> newLink
    }

    // delete first item
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while (current != null) {
            current.displayLink();  // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
///////////////////////////////////////////////////////////////////////
class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  // make new list

        theList.insertFirst(22, 2.99);      // insert four items
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();              // display list

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();     // delete link
            System.out.print("Deleted ");           // display it
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
