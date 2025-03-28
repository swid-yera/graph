public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "D");

        graph.addEdge("B", "C");
        graph.addEdge("B", "D");

        graph.addEdge("C", "D");

        graph.search("A");

    }
}