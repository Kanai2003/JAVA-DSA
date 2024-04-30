
public class GraphArray {

  public static void simpleGraph(int[][] edges) {
    // find the max node
    int max = 0;
    for (var edge : edges) {
      max = Math.max(max, Math.max(edge[0], edge[1]));
    }

    int adj[][] = new int[max + 1][max + 1];

    for (var edge : edges) {
      adj[edge[0]][edge[1]] = 1;
      adj[edge[1]][edge[0]] = 1;
    }

    for (int i = 0; i <= max; i++) {
      for (int j = 0; j <= max; j++) {
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void weightedGraph(int [][] edges ){
    // find the max node
    int max = 0;
    for(var edge: edges){
      max = Math.max(max, Math.max(edge[0], edge[1]));
    }

    int adj[][] = new int[max+1][max+1];

    for(var edge: edges){
      adj[edge[0]][edge[1]] = edge[2];
      adj[edge[1]][edge[0]] = edge[2];
    }

    for(int i = 0; i <= max; i++){
      for(int j = 0; j <= max; j++){
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] edges = { { 5, 6 }, { 1, 2 }, { 1, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 5 } };

    // consider first two elemets are nodes/vertices and the third element is the weight of the edge
    int[][] weightedEdges = { { 5, 6, 1 }, { 1, 2, 2 }, { 1, 3, 3 }, { 2, 4, 4 }, { 3, 4, 5 }, { 3, 5, 6 }, { 4, 5, 7 } };

    System.out.println("----------Simple Graph----------");
    simpleGraph(edges);
    System.out.println("----------Weighted Graph----------");
    weightedGraph(weightedEdges);
  }
}
