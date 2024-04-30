import java.util.ArrayList;

public class GraphArrayList {

  public static void simpleGraph(int[][] edges) {
    // find the max node
    int max = 0;
    for (var edge : edges) {
      max = Math.max(max, Math.max(edge[0], edge[1]));
    }

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>(max + 1);

    for (int i = 0; i <= max; i++) {
      adj.add(new ArrayList<Integer>());
    }

    for (var edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }
    System.out.println("-----------------Simple Graph-----------------");
    System.out.println(adj);
  }

  public static void weightedGraph(int[][] edges) {
    // find the max node
    int max = 0;
    for (var edge : edges) {
      max = Math.max(max, Math.max(edge[0], edge[1]));
    }
    ArrayList<ArrayList<int[]>> adj = new ArrayList<>(max + 1);

    for (int i = 0; i <= max; i++) {
      adj.add(new ArrayList<int[]>());
    }

    for (var edge : edges) {
      adj.get(edge[0]).add(new int[] { edge[1], edge[2] });
      adj.get(edge[1]).add(new int[] { edge[0], edge[2] });
    }

    System.out.println("-----------------Weighted Graph-----------------");
    for (int i = 0; i < adj.size(); i++) {
      System.out.print(i + ": ");
      for (int[] pair : adj.get(i)) {
        System.out.print("(" + pair[0] + "," + pair[1] + ") ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] edges = { { 5, 6 }, { 1, 2 }, { 1, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 5 } };

    simpleGraph(edges);

    int[][] weightedEdges = { { 1, 2, 10 }, { 1, 3, 20 }, { 2, 4, 30 }, { 3, 4, 40 }, { 3, 5, 50 }, { 4, 5, 60 },
        { 5, 6, 70 } };
    weightedGraph(weightedEdges);
  }

}
