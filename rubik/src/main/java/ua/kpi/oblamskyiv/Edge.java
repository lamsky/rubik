package ua.kpi.oblamskyiv;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 1:45 PM
 */
public class Edge {
    private int colorID;

    public Edge(int colorID) {
        this.colorID = colorID;
    }

    public int size() {
        return 3;
    }

    public int getColorID() {
        return colorID;
    }
}
