/**
 * Created by Hussein
 */
class Link {

    public int iData;
    public Link next;

    public Link(int x) {
        iData = x;
    }

    public void displayLink() {
        System.out.print(iData + " ");
    }

}

class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int x) {
        Link newLink = new Link(x);
        Link current = first;
        Link previous = null;

        while (current != null && x < current.iData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newLink.next = first;
            first = newLink;
        }

        else {
            previous.next = newLink;
            newLink.next = current;
        }
    }

    public Link remove() {
        Link current = first;
        Link previous = null;
        Link temp = current;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;

        return temp;
    }

    public void display() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println(" ");
    }

}

class PriorityQ {

    private LinkList theList;

    public PriorityQ() {
        theList = new LinkList();
    }

    public void insert(int x) {
        theList.insert(x);
    }

    public void remove() {
        theList.remove();

    }

    public void displayList() {
        System.out.print("Priority Queue: ");
        theList.display();
    }

}

public class LinkListPriorityQ {
    public static void main(String[] args) {
        PriorityQ queue1 = new PriorityQ();

        queue1.insert(5);
        queue1.insert(3);
        queue1.insert(8);
        queue1.insert(2);

        queue1.displayList();

        queue1.remove();
        queue1.displayList();

        queue1.remove();
        queue1.displayList();

        queue1.remove();
        queue1.displayList();
    }
}
