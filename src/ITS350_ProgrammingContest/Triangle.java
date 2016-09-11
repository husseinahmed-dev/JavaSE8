package ITS350_ProgrammingContest;

/**
 * Created by Hussein on 3/12/16.
 */
public class Triangle {

    public int findLargest(int[][] coordinates) {
        int maxDestroyed = 0;

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = i+1; j < coordinates.length; j++) {
                for (int k = j+1; k < coordinates.length; k++) {
                    int ax = coordinates[i][0];
                    int ay = coordinates[i][1];
                    int bx = coordinates[j][0];
                    int by = coordinates[j][1];
                    int cx = coordinates[k][0];
                    int cy = coordinates[k][1];

                    int currentDestroyed = shipsDestroyed(coordinates, ax, ay, bx, by, cx, cy);

                    if (currentDestroyed > maxDestroyed) {
                        maxDestroyed = currentDestroyed;
                    }

                }
            }
        }
        return maxDestroyed;

    }

    public double findArea(int ax, int ay, int bx, int by, int cx, int cy) {
        double area;
        area = Math.abs(ax * (by - cy) + bx * (cy - ay) + cx * (ay - by) / 2);
        return area;
    }

    public boolean shipInTriangle(int shipX, int shipY, int ax, int ay, int bx, int by, int cx, int cy) {

        double s = ay * cx - ax * cy + (cy - ay) * shipX + (ax - cx) * shipY;
        double t = ax * by - ay * bx + (ay - by) * shipX + (bx - ax) * shipY;

        if ((s < 0) != (t < 0)) return false;
        double A = -by * cx + ay * (cx - bx) + ax * (by - cy) + bx * cy;
        if (A < 0.0) {
            s = -s;
            t = -t;
            A = -A;
        }
        return s > 0 && t > 0 && (s + t) <= A;
    }

    public int shipsDestroyed(int[][] coordinates, int ax, int ay, int bx, int by, int cx, int cy) {
        int shipsCounter = 3;
        for (int i = 0; i < coordinates.length; i++) {
                if (coordinates[i][0] != ax && coordinates[i][1] != ay || coordinates[i][0] != bx && coordinates[i][1] != by || coordinates[i][0] != cx && coordinates[i][1] != cy) {
                    if (shipInTriangle(coordinates[i][0], coordinates[i][1], ax, ay, bx, by, cx, cy))
                        shipsCounter++;
                }
        }
        return shipsCounter;
    }
}
