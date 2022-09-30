package BrackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPath {
    public static void main(String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        int x1, y1, x2, y2;

        // start
        x1 = 1; y1 = 1;
        // target
        x2 = 3; y2 = 3;
        recList(new int[Math.abs(y1 - y2) + 1][Math.abs(x1 - x2) + 1], x1 - x2, y1 - y2, " ", x1 - x2 > 0 , y1 - y2 > 0, 0);
        System.out.println("=============================");

        // start
        x1 = 1; y1 = 3;
        // target
        x2 = 3; y2 = 1;
        recList(new int[Math.abs(y1 - y2) + 1][Math.abs(x1 - x2) + 1], x1 - x2, y1 - y2, " ", x1 - x2 > 0 , y1 - y2 > 0, 0);
        System.out.println("=============================");

        // start
        x1 = 3; y1 = 1;
        // target
        x2 = 1; y2 = 3;
        recList(new int[Math.abs(y1 - y2) + 1][Math.abs(x1 - x2) + 1], x1 - x2, y1 - y2, " ", x1 - x2 > 0 , y1 - y2 > 0, 0);
        System.out.println("=============================");

        // start
        x1 = 3; y1 = 3;
        // target
        x2 = 1; y2 = 1;
        recList(new int[Math.abs(y1 - y2) + 1][Math.abs(x1 - x2) + 1], x1 - x2, y1 - y2, " ", x1 - x2 > 0 , y1 - y2 > 0, 0);
        System.out.println("=============================");

    }

    static void recList (int[][] arr, int x, int y, String str, boolean bool1, boolean bool2, int count) {
        if (x == 0 && y == 0) {
            System.out.print("->");
            System.out.println(Arrays.toString(arr[0]));
            for(int i = 1; i < arr.length; i++) {
                System.out.print("  ");
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println("  " + str);
            arr = new int[arr[0].length][arr.length];
            return;
        } if (!bool1) {
            if (!bool2) {
                if (-x < 0 || -x >= arr.length || -y < 0 || -y >= arr[0].length || arr[arr[0].length + y - 1][arr.length + x - 1] != 0){
                    return;
                }
                arr[arr[0].length + y - 1][arr.length + x - 1] = ++count;
                recList(arr, x + 1, y, str + "E", bool1, bool2, count);
                recList(arr, x - 1, y, str + "W", bool1, bool2, count);
                recList(arr, x, y + 1, str + "S", bool1, bool2, count);
                recList(arr, x, y - 1, str + "N", bool1, bool2, count);
                arr[arr[0].length + y - 1][arr.length + x - 1] = 0;
                --count;
                return;
            } if (bool2) {
                if (-x < 0 || -x >= arr.length ||  y < 0 || y >= arr[0].length || arr[y][arr.length + x - 1] != 0) {
                    return;
                }
                arr[y][arr.length + x - 1] = ++count;
                recList(arr, x + 1, y, str + "E", bool1, bool2, count);
                recList(arr, x - 1, y, str + "W", bool1, bool2, count);
                recList(arr, x, y + 1, str + "S", bool1, bool2, count);
                recList(arr, x, y - 1, str + "N", bool1, bool2, count);
                arr[y][arr.length + x - 1] = 0;
                --count;
                return;
            }
        } if (bool1) {
            if (!bool2) {
                if (x < 0 || x >= arr.length || -y < 0 || -y >= arr[0].length || arr[arr[0].length + y - 1][x] != 0) {
                    return;
                }
                arr[arr[0].length + y - 1][x] = ++count;
                recList(arr, x + 1, y, str + "E", bool1, bool2, count);
                recList(arr, x - 1, y, str + "W", bool1, bool2, count);
                recList(arr, x, y + 1, str + "S", bool1, bool2, count);
                recList(arr, x, y - 1, str + "N", bool1, bool2, count);
                arr[arr[0].length + y - 1][x] = 0;
                --count;
                return;
            } if (bool2) {
                if (x < 0 || x >= arr.length ||  y < 0 || y >= arr[0].length || arr[y][x] != 0) {
                    return;
                }
                arr[y][x] = ++count;
                recList(arr, x + 1, y, str + "E", bool1, bool2, count);
                recList(arr, x - 1, y, str + "W", bool1, bool2, count);
                recList(arr, x, y + 1, str + "S", bool1, bool2, count);
                recList(arr, x, y - 1, str + "N", bool1, bool2, count);
                arr[y][x] = 0;
                --count;
                return;
            }
        }
    }

}