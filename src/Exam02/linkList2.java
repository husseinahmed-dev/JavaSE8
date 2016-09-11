//package Exam02;
//
///**
// * Created by Hussein on 4/9/16.
// */
//class Link {
//    public int iData;
//    public double dData;
//    public Link next;
//
//    public Link(int id, double dd) {
//        iData = id;
//        dData = dd;
//    }
//
//    public void displayLink() {
//        System.out.print("{" + iData + ", " + dData + "} ");
//    }
//}
//////////////////////////////////////////////////////////////////////////
//class LinkList {
//    private Link first;
//
//    public LinkList() {
//        first = null;
//    }
//
//    public void insertFirst(int id, double dd) {
//        Link newLink = new Link(id, dd);
//        newLink.next = first;
//        first = newLink;
//    }
//
//    // find link with given key
//    public Link find(int key) {
//        Link current = first;
//        while (current.iData != key) {
//            if (current.next == null)           // if end of list,
//                return null;                    // didn't find it
//            else                                // not end of list,
//                current = current.next;         // go to next link
//        }
//        return current;                         // found it
//    }
//
//    // delete link with given key
//    public Link delete(int key) {
//        Link current = first;
//        Link previous = first;
//        while (current.iData != key) {
//            if (current.next == null) return null;
//            else {
//                previous = current;
//                current = current.next;
//            }
//        }
//        if (current == first)
//            first = first.next;
//        else
//            previous.next = current.next;
//        return current;
//    }
//
//    public void displayList() {
//        System.out.print("List (first-->last): ");
//        Link current = first;       // start at beginning of list
//        while (current != null) {
//            current.displayLink();
//            current = current.next;
//        }
//    }
//}
///////////////////////////////////////////////////////////////////////////////
//class LinkList2App {
//    public static void main(String[] args) {
//        LinkList theList = new LinkList();      // make list
//
//        theList.insertFirst(22, 2.99);          // insert 4 items
//        theList.insertFirst(44, 4.99);
//        theList.insertFirst(66, 6.99);
//        theList.insertFirst(88, 8.99);
//
//        theList.displayList();                  // display list
//
//        Link f = theList.find(44);              // find item
//        if (f != null)
//            System.out.println("Found link with key " + f.iData);
//        else
//            System.out.println("Can't find link");
//
//        Link d = theList.delete(66);            // delete item
//        if (d != null)
//            System.out.println("Deleted link with key " + d.iData);
//        else
//            System.out.println("Can't delete link");
//
//        theList.displayList();
//    }
//}
