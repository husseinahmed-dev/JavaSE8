//package ITS350;
//import java.util.ArrayList;
//
///**
// * Hussein Ahmed: 13-00312
// */
//public class Assignment01 {
//    private static int[] array = new int[N];
//
//    public static void main(String[] args) {
//        orderOfC();              // O(1)
//        orderOfC_2(3);           // O(1)
//
//        orderOfN();              // O(N)
//        orderOfN_2(3);           // O(N)
//
//        orderOfN2();             // O(N²)
//        orderOfN2_2(array);      // O(N²)
//
//        orderOfLogN(3);         // O(log N)
//        orderOfLogN_2(3);       // O(log N)
//        orderOfLogN_3();        // O(log N)
//
//        orderOf2N(25);                      // O(2^N)
//        orderOf2N_2(route, cities);          // O(2^N)
//
//    }
//
//    // Declaring and adding variables
//    public static int orderOfC() {
//        int firstNumber = 10;
//        int secondNumber = 20;
//        return firstNumber + secondNumber;
//    }
//
//    // Accessing array index
//    public static int orderOfC_2(int index) {
//        return array[index];
//    }
//
//    // Traversing an array
//    public static void orderOfN() {
//        int total = 0;
//
//        for (int i=0; i < array.length; i++) {
//            total += array[i];
//        }
//
//        System.out.println(total);
//    }
//
//    // Linear Search
//    public static boolean orderOfN_2(int key) {
//        boolean isFound = false;
//        for (int i = 0; i < array.length; i++) {
//            if (key == array[i]) isFound = true;
//        }
//        return isFound;
//    }
//
//    // Traversing a 2D array
//    public static void orderOfN2() {
//        int[][] array2 = new [N][M];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                array2[N][M] = j+i;
//            }
//        }
//    }
//
//    // Bubble Sorting an unsorted array
//    public static void orderOfN2_2(int[] unsorted) {
//        for (int i = 1; i < unsorted.length; i++) {
//            int temp = 0;
//            if (unsorted[i - 1] > unsorted[i]) {
//                temp = unsorted[i - 1];
//                unsorted[i - 1] = unsorted[i];
//                unsorted[i] = temp;
//            }
//        }
//    }
//
//    // Binary Search
//    public static int orderOfLogN(int key) {
//        return java.util.Arrays.binarySearch(array, 0, array.length-1, key);
//    }
//
//    // Divide and Conquer strategy
//    public static void orderOfLogN_2(int key) {
//        while (key > 0) {
//            key/=2;
//        }
//    }
//
//    // incremental by multiple of 2
//    public static void orderOfLogN_3() {
//        for (int i = 1; i < array.length; i *= 2) {
//            System.out.println(array[i-1]);
//        }
//    }
//
//    // Implementing Fibonacci Numbers recursively
//    public static int orderOf2N(int number) {
//        if ((number == 0) || (number == 1))
//            return number;
//        else
//            return orderOf2N(number - 1) + orderOf2N(number - 2);
//    }
//
//    // Travelling Salesman problem
//    // * an outside resource from stackovervlow.com
//    public static void orderOf2N_2(Route r, ArrayList<City> citiesNotInRoute) {
//
//        if(!citiesNotInRoute.isEmpty())
//        {
//            for(int i = 0; i<citiesNotInRoute.size(); i++)
//            {
//                City justRemoved = (City) citiesNotInRoute.remove(0).clone();
//                Route newRoute = (Route) r.clone();
//                newRoute.addToRoute(justRemoved);
//
//                BruteForceFindBestRoute(newRoute, citiesNotInRoute);
//                citiesNotInRoute.add(justRemoved);
//            }
//        }
//        else //if(citiesNotInRoute.isEmpty())
//        {
//            if(IsBestRoute(r))
//                bestRoute = r;
//        }
//
//
//    }
//
//
//
//
//}
