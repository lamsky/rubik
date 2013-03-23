package ua.kpi.oblamskyiv;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 12:06 PM
 */
public class Rubik {

    public Edge getFront() {
        return new Edge(0);
    }

    public Edge getBack() {
        return new Edge(1);
    }

    public Edge getUp() {
        return new Edge(2);
    }

    public Edge getDown() {
        return new Edge(3);
    }

    public Edge getLeft() {
        return new Edge(4);
    }

    public Edge getRight() {
        return new Edge(5);
    }
}
