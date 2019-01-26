package ru.ponomaryov.se;

public class Main7 {

    public static void main(String[] args) {
//        testGraph();
//        testDfs();
        testBfs();


    }

    private static void testBfs() {
        Graph graph = new GraphImpl(10);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");
        graph.addEdge("E", "H");

        graph.addEdge("C", "F");

        graph.addEdge("D", "G");

        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new GraphImpl(10);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.display();

        graph.dfs("A");
    }

    private static void testGraph() {
        Graph graph = new GraphImpl(4);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.addEdge("B", "A");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");

        graph.addEdge("C", "A");
        graph.addEdge("C", "B");
        graph.addEdge("C", "D");

        graph.addEdge("D", "B");
        graph.addEdge("D", "C");

        System.out.println("Graph size = " + graph.getSize());
        graph.display();
    }
}
