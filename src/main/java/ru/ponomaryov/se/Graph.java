package ru.ponomaryov.se;

import java.util.Stack;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String endLabel);

    void display();

    int getSize();

    void dfs(String startLabel);

    void bfs(String startLabel);

    Stack<String> findShortPathViaBfs(String startLabel, String finishLabel);
}
