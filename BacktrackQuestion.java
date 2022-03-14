
import java.util.ArrayList;
import java.util.List;

public class BacktrackQuestion {
    public static void main (String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        boolean[][] arr = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // start
        int x1 = 1, y1 = 1;
        // target
        int x2 = 3, y2 = 3;
//        System.out.println(recList(arr, x2 - x1, y2 - y1, ""));
        System.out.println(recList1(arr, x2 - x1, y2 - y1, ""));
    }

    static List<String> recList (boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }
        if (!arr[x][y]) {
            return list;
        }
        arr[x][y] = false;
        if (x < arr.length - 1) {
            list.addAll(recList(arr, x + 1, y, str + "E"));
        } if (x > 0) {
            list.addAll(recList(arr, x - 1, y, str + "W"));
        } if (y < arr[0].length - 1) {
            list.addAll(recList(arr, x, y + 1, str + "S"));
        } if (y > 0) {
            list.addAll(recList(arr, x, y - 1, str + "N"));
        }
        arr[x][y] = true;
        return list;
    }

    static List<String> recList1 (boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>(0);
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || !arr[x][y]) {
            return list;
        }
        arr[x][y] = false;
        list.addAll(recList1(arr, x + 1, y, str + "E"));
        list.addAll(recList1(arr, x - 1, y, str + "W"));
        list.addAll(recList1(arr, x, y + 1, str + "S"));
        list.addAll(recList1(arr, x, y - 1, str + "N"));
        arr[x][y] = true;
        return list;
    }
}