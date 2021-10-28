package com.mycompany.firstpart.figures;

public class MyPoint {

    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double array [] =  {x,y};
        return array;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance (double x, double y) {
        double powX = (this.x-x)*(this.x-x);
        double powY = (this.y-y)*(this.y-y);
        return Math.sqrt(powX+powY);
    }

    public double distance (MyPoint another) {
        double powX = (this.x-another.getX())*(this.x-another.getX());
        double powY = (this.y-another.getY())*(this.y-another.getY());
        return Math.sqrt(powX+powY);
    }

    public double distance () {
        return Math.sqrt(x*x + y*y);
    }
}
