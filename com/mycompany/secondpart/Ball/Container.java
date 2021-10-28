package com.mycompany.Ball;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2-x1;
    }

    public int getHeight() {
        return y1-y2;
    }

    public boolean collides(Ball ball) {
        boolean condition1 = (ball.getX()-ball.getRadius() > x1) && (ball.getY()+ball.getRadius() < y1);
        boolean condition2 = (ball.getX()+ball.getRadius() < x2) && (ball.getY()-ball.getRadius() > y2);
        if ( condition1 && condition2 )
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")]";
    }

}
