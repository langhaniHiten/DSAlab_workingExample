import java.util.*;
public class GraphDegree {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        calculateDegrees(graph);
    }
    public static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void calculateDegrees(Map<Integer, List<Integer>> graph) {
        System.out.println("Node Degrees:");
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            int node = entry.getKey();
            int degree = entry.getValue().size();
            System.out.println("Node " + node + ": " + degree);
        }
    }
}
