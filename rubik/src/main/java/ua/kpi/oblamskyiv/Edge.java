package ua.kpi.oblamskyiv;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 1:45 PM
 */
public class Edge {
    private final static int EDGE_SIZE = 3;

    private int[][] edge;

    public Edge(int colorID) {
        edge = new int[EDGE_SIZE][EDGE_SIZE];
        for (int[] row : edge) {
            Arrays.fill(row, colorID);
        }
    }

    public int size() {
        return EDGE_SIZE;
    }

    public int[][] toArray() {
        return edge;
    }
}
