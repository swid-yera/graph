import java.util.*;

public class Graph {

    private final Map<String, List<String>> graph = new HashMap<>();

    public void addVertex(String vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String oneVertex, String secondVertex) {
        graph.get(oneVertex).add(secondVertex);
        graph.get(secondVertex).add(oneVertex);
    }

    public List<String> getDependencies(String vertex) {
        return graph.get(vertex);
    }

    public void search(String startVertex) {
        Set<String> visited = new HashSet<>();
        searchHelper(startVertex, visited);
    }

    public void searchHelper(String vertex, Set<String> visited) {
        if (!visited.contains(vertex)) {
            visited.add(vertex);
            System.out.println(vertex);
            for (String vertexD : getDependencies(vertex)) {
                searchHelper(vertexD, visited);
            }
        }
    }

}
