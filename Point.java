package gr.aueb.cf.ch14;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Static factory method
     * @return new Point , invoking default Constructor
     */
    public static Point getInstance() {
        return new Point();
    }

    /**
     * static factory method
     * @return (0,0) point
     */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * static factory method
     * @return point (x,y) with random numbers from 0 - 100
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101) , rnd.nextInt(101));

    }




}
