package com.mycompany.MyPolynomial;

import java.util.Arrays;

public class MyPolynomial {

    private double coeffs[];

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Коэффициенты вводятся от последнего с0 к первому сN

    public int getDegree () {
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        int clen = coeffs.length;
        String s = String.valueOf(coeffs[clen-1]) + "* x^" + (clen-1) + " + ";
        for (int i = clen-2; i>0; i--)
        {
            s+= String.valueOf(coeffs[i]) + "* x^" + i + " + ";
        }
        s+= String.valueOf(coeffs[0]);
        return s;
    }

    public double evaluate (double x) {
        double result = 0;
        int clen = coeffs.length;
        for (int i=clen-1; i>=0; i--)
        {
            result += coeffs[i] * Math.pow(x,i);
        }
        return result;
    }


    public MyPolynomial add(MyPolynomial right) {

        int clenMin = 0;
        int clenMax = 0;

        if (getDegree() < right.getDegree()) {
            clenMin = getDegree();
            clenMax = right.getDegree();

        }
        else {
            clenMin = right.getDegree();
            clenMax = getDegree();
        }

        double [] coef = new double [clenMax+1];

        int i=0;
        for (i=0; i<=clenMin; i++)
            coef[i] = this.coeffs[i] + right.coeffs[i];

        if (getDegree() < right.getDegree()) {
            for (int j=i; i<=clenMax; i++)
                coef[j] = right.coeffs[j];
        }
        else {
            for (int j=i; i<=clenMax; i++)
                coef[j] =coeffs[j];
        }


        MyPolynomial result = new MyPolynomial(coef);

        return result;
    }



    public MyPolynomial multiply (MyPolynomial right) {

        int index = getDegree() + right.getDegree();
        double [] resCoeffs = new double [index+1];


        for (int i = 0; i <= getDegree(); i++)
            for (int j = 0; j <= right.getDegree(); j++) {
                index=i+j;
                resCoeffs[index] += coeffs[i] * right.coeffs[j];
            }
        return new MyPolynomial(resCoeffs);
    }
}
