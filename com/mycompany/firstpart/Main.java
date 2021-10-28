package com.mycompany.firstpart;

import com.mycompany.firstpart.Book.Author;
import com.mycompany.firstpart.Book.Book;
import com.mycompany.firstpart.Circle.Circle;
import com.mycompany.firstpart.Employee.Employee;
import com.mycompany.firstpart.figures.MyPoint;
import com.mycompany.firstpart.figures.MyTriangle;
import com.mycompany.firstpart.figures.Rectangle;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle1 = new Circle(10.0, "blue");

        System.out.println(circle.toString());
        System.out.println(circle.getArea());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());


        Employee employee = new Employee(1, "Jack", "Smith", 200);
        System.out.println(employee.toString());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.toString());


        Author author1 = new Author("AnnaSmith", "annasmith@gmail.com", 'f');
        Author author2 = new Author("JamesBlack", "jblack@mail,ru", 'm');
        Author [] auth = {author1, author2};
        Book book = new Book("BestBook", auth, 500.00);
        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());

        MyPoint myPoint = new MyPoint(1.0,1.0);
        System.out.println(myPoint.toString());
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(2.0,2.0));
        MyPoint myPoint1 = new MyPoint(2.0,0.0);
        System.out.println(myPoint.distance(myPoint1));

        double d = Math.sqrt(3);
        MyPoint myPoint2 = new MyPoint();
        MyPoint myPoint3 = new MyPoint(1, d);

        System.out.println("sides:");
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance(myPoint3));
        System.out.println(myPoint2.distance(myPoint3));

        MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle.toString());

        System.out.println(myTriangle.getType());


        d=d/2;
        myPoint3.setY(d);
        System.out.println("sides:");
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance(myPoint3));
        System.out.println(myPoint2.distance(myPoint3));
        MyTriangle myTriangle1 = new MyTriangle(myPoint1, myPoint2, myPoint3);

        System.out.println(myTriangle1.toString());

        System.out.println(myTriangle1.getType());



        myPoint2.setX(1.0);
        System.out.println("sides:");
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance(myPoint3));
        System.out.println(myPoint2.distance(myPoint3));
        MyTriangle myTriangle2 = new MyTriangle(myPoint1, myPoint2, myPoint3);

        System.out.println(myTriangle2.toString());

        System.out.println(myTriangle2.getType());

        myPoint1.setXY(1.0, 0.0);
        myPoint2.setXY(0.0, 0.0);
        myPoint3.setXY(18.0, 0.0);

        MyTriangle myTriangle3 = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle3.toString());
    }
}
