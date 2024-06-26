package f_graph.practice;

import java.util.Arrays;

public class MatrixGraph {
    private int numOfVertices;
    private int[][] matrix;
    public MatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.matrix = new int[numOfVertices][numOfVertices];
    }
    public void addEdge(int src, int dest, int weight) {
        // 행이 시작 꼭짓점, 열이 도착 꼭짓점
        matrix[src][dest] = weight;
    }

    public void removeEdge(int src, int dest) {
        // 행이 시작 꼭짓점, 열이 도착 꼭짓점
        matrix[src][dest] = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= 0) {
                    continue;
                }
                sb.append(
                        String.format("Vertex %d -> Vertex %d (weight : %d)\n", i, j, matrix[i][j])
                );
            }
            System.out.println();
        }
        return sb.toString();
    }
}
