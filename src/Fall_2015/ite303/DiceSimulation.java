package Fall_2015.ite303;
import java.util.Random;
/**
 * Hussein Ahmed ID:13-00312
 * Grade: 100/100
 */
public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        int freq2=0, freq3=0, freq4=0, freq5=0, freq6=0, freq7=0, freq8=0, freq9=0, freq10=0, freq11=0, freq12=0;

        for (int i = 0; i < 1000; i++) {
            int dice1 = 1 + random.nextInt(6);
            int dice2 = 1 + random.nextInt(6);

            switch (dice1 + dice2) {
                case 2:
                    freq2++;
                    break;
                case 3:
                    freq3++;
                    break;
                case 4:
                    freq4++;
                    break;
                case 5:
                    freq5++;
                    break;
                case 6:
                    freq6++;
                    break;
                case 7:
                    freq7++;
                    break;
                case 8:
                    freq8++;
                    break;
                case 9:
                    freq9++;
                    break;
                case 10:
                    freq10++;
                    break;
                case 11:
                    freq11++;
                    break;
                case 12:
                    freq12++;
                    break;
            }
        }

        printChart(2, probability(freq2));
        printChart(3, probability(freq3));
        printChart(4, probability(freq4));
        printChart(5, probability(freq5));
        printChart(6, probability(freq6));
        printChart(7, probability(freq7));
        printChart(8, probability(freq8));
        printChart(9, probability(freq9));
        printChart(10, probability(freq10));
        printChart(11, probability(freq11));
        printChart(12 , probability(freq12));
    }

    private static String stargraph(double number) {
        String bar = "";

        for (int i = 0; i < Math.round(number); i++) {
            bar += "*";
        }

        return bar;
    }

    private static double probability(int frequency) {
        return frequency / 1000.0 * 100;
    }

    private static void printChart(int face, double probability) {
        System.out.printf("%-8s", String.format("Face %d ", face ));
        System.out.printf("%-20s", stargraph(probability));
        System.out.printf("(%.2f%%)%n", probability);
    }
}
