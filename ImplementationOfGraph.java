import java.util.ArrayList;
import java.util.List;

public class ImplementationOfGraph {

    static void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        System.out.print(node + "-->");
        visited[node] = true;

        for (Integer i : graph.get(node)) {
            if (visited[i] == false) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int V = 5;

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(0).add(4);
        graph.get(1).add(3);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(4).add(0);

        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " --> [");

            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + ", ");
            }

            System.out.println(" ] ");
        }

        boolean visited[] = new boolean[V + 1];

        dfs(graph, visited, 0);
    }
}
