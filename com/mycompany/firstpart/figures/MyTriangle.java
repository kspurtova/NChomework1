package com.mycompany.firstpart.figures;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        MyPoint v11 = new MyPoint(x1,y1);
        MyPoint v22 = new MyPoint(x2,y2);
        MyPoint v33 = new MyPoint(x3,y3);
        double side1 = v11.distance(v22);
        double side2 = v11.distance(v33);
        double side3 = v22.distance(v33);
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            v1.setXY(x1, y1);
            v2.setXY(x2, y2);
            v3.setXY(x3, y3);
        }
        else System.out.println("Такого треугольника не существует, измените значения точек");

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {

        double side1 = v1.distance(v2);
        double side2 = v1.distance(v3);
        double side3 = v2.distance(v3);
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
        else System.out.println("Такого треугольника не существует, измените значения точек");
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v1.distance(v3);
        double side3 = v2.distance(v3);
        return side1+side2+side3;
    }

    enum Type {
        EQUILATERAL,
        ISOSCELES,
        SCALENE
    }

    public String getType() {
        // Equilateral, Isosceles, Scalene
        double side1 = v1.distance(v2);
        double side2 = v1.distance(v3);
        double side3 = v2.distance(v3);

        final double eps = 0.00001;
        // возвращает тип треугольника в зависимости от соотношения длин сторон

        if ( (Math.abs(side1 - side2)<eps) && (Math.abs(side2 - side3)<eps) && (Math.abs(side1-side3)<eps))
            return String.valueOf(Type.EQUILATERAL);
        if ( (Math.abs(side1 - side2)<eps)  || (Math.abs(side2 - side3)<eps) || (Math.abs(side1-side3)<eps))
            return String.valueOf(Type.ISOSCELES);
        else
            return String.valueOf(Type.SCALENE);
    }


}
