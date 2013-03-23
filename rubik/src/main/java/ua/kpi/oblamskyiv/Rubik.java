package ua.kpi.oblamskyiv;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 12:06 PM
 */
public class Rubik {
    static final int FRONT_COLOR_ID = 0;
    static final int BACK_COLOR_ID = 1;
    static final int UP_COLOR_ID = 2;
    static final int DOWN_COLOR_ID = 3;
    static final int LEFT_COLOR_ID = 4;
    static final int RIGHT_COLOR_ID = 5;

    private Edge front;
    private Edge back;
    private Edge up;
    private Edge down;
    private Edge left;
    private Edge right;

    public Rubik() {
        front = new Edge(FRONT_COLOR_ID);
        back = new Edge(BACK_COLOR_ID);
        up = new Edge(UP_COLOR_ID);
        down = new Edge(DOWN_COLOR_ID);
        left = new Edge(LEFT_COLOR_ID);
        right =  new Edge(RIGHT_COLOR_ID);
    }

    public Edge getFront() {
        return  front;
    }

    public Edge getBack() {
        return back;
    }

    public Edge getUp() {
        return up;
    }

    public Edge getDown() {
        return down;
    }

    public Edge getLeft() {
        return left;
    }

    public Edge getRight() {
        return right;
    }
}
