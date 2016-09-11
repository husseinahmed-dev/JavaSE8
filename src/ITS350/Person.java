package ITS350;

/**
 * Created by Hussein on 3/9/16.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}

//////////////////////////////////////////////////////////////////////////

class ClassDataArray {
    private Person[] a;
    private int nElems;

    public ClassDataArray(int max) {
        a = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getLastName().equals(searchName))
                break;
        }
        if (j == nElems) return null;
        else return a[j];
    }

    public void insert(String firstName, String lastName, int age) {
        a[nElems] = new Person(firstName, lastName, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getLastName().equals(searchName)) break;
        }
        if (j == nElems) return false;
        else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElems; i++) {
            a[i].displayPerson();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////

class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.insert("Patty", "Evans", 24);
        arr.insert("Lorraine", "Smith", 37);
        arr.insert("Tom", "Yee", 43);
        arr.insert("Henry", "Adams", 63);
        arr.insert("Sato", "Hashimoto", 21);
        arr.insert("Henry", "Stimson", 29);
        arr.insert("Jose", "Velaquez", 72);
        arr.insert("Henry", "Lamirque", 54);
        arr.insert("Minh", "Vang", 22);
        arr.insert("Lucinda", "Creswell", 18);

        arr.displayArray();

        String searchKey = "Stimson";
        Person found;
        found = arr.find(searchKey);
        if (found!=null) {
            System.out.print("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayArray();

    }
}