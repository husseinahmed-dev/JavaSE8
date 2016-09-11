package ITS350_ProgrammingContest;

/**
 * Created by Hussein on 4/16/16.
 */
public class P164_LCDDisplay {
    private static int[] stack = new int[10];
    private static int nElems = 0;
    public static void main(String[] args) {
        int s = 2;
        int n = 123;
        int rows = 2*s+3;

        // stack
        push(n);

        for (int i = 0; i < rows; i++) {
            while (nElems != 0) {
                int remainder = pop();
                switch(remainder) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
//                        System.out.print(remainder);
                        break;
                    case 4:
                        System.out.print(remainder);
                        break;
                    case 5:
                        System.out.print(remainder);
                        break;
                    case 6:
                        System.out.print(remainder);
                        break;
                    case 7:
                        System.out.print(remainder);
                        break;
                    case 8:
                        System.out.print(remainder);
                        break;
                    case 9:
                        System.out.print(remainder);
                        break;
                    case 0:
                        System.out.print(remainder);
                        break;
                }
            }
                System.out.println();
            push(n);
        }

    }

    public static void push(int number) {
        while (number != 0) {
            int remainder = number % 10;
            stack[nElems++] = remainder;
            number /= 10;
        }
    }

    public static int pop() {
        if (nElems != 0) {
            return stack[--nElems];
        } else {
            return -1;
        }
    }

    public static int peek() {
        if (nElems != -1) return stack[nElems];
        else return -1;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
