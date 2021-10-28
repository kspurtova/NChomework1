package com.mycompany;

import com.mycompany.Ball.Container;
import com.mycompany.MyComplex.MyComplex;
import com.mycompany.MyPolynomial.MyPolynomial;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.mycompany.Ball.Ball;

public class Main {

    public static void main(String[] args) {


        MyComplex myComplex1 = new MyComplex();
        MyComplex myComplex2 = new MyComplex(1.0,2.0);
        MyComplex myComplex3 = new MyComplex(2.0, 1.0);

        System.out.println("myComplex1: " + myComplex1.toString());
        System.out.println("myComplex2: " + myComplex2.toString());
        System.out.println("myComplex3: " + myComplex3.toString());

        System.out.println("Содержит действительную часть myComplex1: " + myComplex1.isReal());
        System.out.println("Содержит мнимую часть myComplex1: " + myComplex1.isImag());

        System.out.println(myComplex1.toString() + "== 0 + 0i? " + myComplex1.equals(0.0, 0.0));
        System.out.println(myComplex1.toString() + " == " + myComplex2.toString() + "? "+ myComplex1.equals(myComplex2));

        System.out.println("Модуль " + myComplex2.toString() + "=" + myComplex2.magnitude());
        System.out.println("Аргумент " + myComplex2.toString() + " = " + myComplex2.argument());

        System.out.println("Аргумент " + myComplex1.toString() + " = " + myComplex1.argument());

        System.out.println("myComplex2=" + myComplex2.toString());

        myComplex2.add(myComplex3);
        System.out.println("After add myComplex2=" + myComplex2.toString());

        myComplex2.subtract(myComplex3);
        System.out.println("After subtract myComplex2=" + myComplex2.toString());

        myComplex2.multiply(myComplex3);
        System.out.println("After multiply myComplex2=" + myComplex2.toString());

        myComplex2.divide(myComplex3);
        System.out.println("After divide myComplex2=" + myComplex2.toString());

        System.out.println("addNew (myComplex2, myComplex3) =" + myComplex2.addNew(myComplex3).toString());
        System.out.println("After addNew myComplex2 =" + myComplex2.toString());

        System.out.println("subtractNew (myComplex2, myComplex3) =" + myComplex2.subtractNew(myComplex3).toString());
        System.out.println("After addNew myComplex2 =" + myComplex2.toString());


        System.out.println("Сопряженное к myComplex2: " + myComplex2.conjugate().toString());







        MyPolynomial myPolynomial = new MyPolynomial(1.0, 2.0, 1.0, 1.0);
        System.out.println(myPolynomial.getDegree());
        System.out.println("myPolynomial: " + myPolynomial.toString());

        System.out.println(myPolynomial.evaluate(1.0));

        MyPolynomial myPolynomial1 = new MyPolynomial(2.0, 1.0, 1.0, 1.0, 1.0);

        System.out.println("myPolynomial1: " + myPolynomial1.toString());

        System.out.println("Add: " + myPolynomial.add(myPolynomial1));
        System.out.println("myPolynomial1: " + myPolynomial1.toString());
        System.out.println("Multiply: " + myPolynomial.multiply(myPolynomial1));







        Ball ball = new Ball(1.0, 1.0, 2, 5, 5);
        System.out.println(ball.toString());
        ball.move();
        System.out.println("After move " + ball.toString());


        Ball ball1 = new Ball(2.0, 2.0, 1, 1, 0);

        Container container = new Container(0,10, 10, 10);
        System.out.println("ball1: " + ball1.toString());
        System.out.println("Мяч в коробке? " + container.collides(ball1));

        ball1.move();
        System.out.println("ball1 after move: " + ball1.toString());

        for (int i=0; i<10; i++)
            ball1.move();

        System.out.println("ball1 after 10 moves: " + ball1.toString());
        System.out.println("Мяч в коробке? " + container.collides(ball1));




    }
}
