package com.mycompany.MyComplex;



public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;
    final double EPS = 0.000001;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return (imag>0) ? "(" + real + "+" + imag + "i)" : "(" + real + imag + "i)";
    }

    public boolean isReal() {
        return (Math.abs(real)<EPS) ? false : true;
    }

    public boolean isImag() {
        return (Math.abs(imag)<EPS) ? false : true;
    }

    public boolean equals (double real, double imag) {
        return ( (Math.abs(this.real - real)<EPS) && (Math.abs(this.imag - imag)<EPS) ) ? true:false;
    }

        public boolean equals (MyComplex another) {
        return ( (Math.abs(real - another.real)<EPS) && (Math.abs(imag - another.imag)<EPS) ) ? true:false;
    }

    public double magnitude () {
        return ( Math.sqrt (Math.pow(real,2)+Math.pow(imag,2)) );
    }

    public double argument () {
        double arg = 0.0;
        if ( (real>0) && (imag>0) )
            arg = Math.atan(imag/real);
        if ( (real>0) && (imag<0) )
            arg = (-1)*Math.atan(imag/real);
        if ( (real<0) && (imag>0) )
            arg = Math.PI -1*Math.atan(imag/real);
        if ( (real<0) && (imag<0) )
            arg = (-1)*Math.PI + Math.atan(imag/real);

        if ( (Math.abs(real)<EPS) && (imag>0) )
            arg = Math.PI/2;
        if ( (Math.abs(real)<EPS) && (imag<0) )
            arg = (-1)*Math.PI/2;

        if ( (real>0) && (Math.abs(imag)<EPS) )
            arg = 0.0;
        if ( (real<0) && (Math.abs(imag)<EPS) )
            arg = Math.PI;

        return arg;
    }

    public MyComplex add(MyComplex right) {
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

        public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

        public MyComplex divide(MyComplex right) {
        double mod = Math.pow(right.real,2) + Math.pow(right.imag, 2);
        this.real = (this.real * right.real + this.imag * right.imag)/mod;
        this.imag = (right.real * this.imag - this.real * right.imag)/mod;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newObject = new MyComplex();
        newObject.real = this.real + right.real;
        newObject.imag = this.imag + right.imag;
        return newObject;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newObject = new MyComplex();
        newObject.real = this.real - right.real;
        newObject.imag = this.imag - right.imag;
        return newObject;
    }

    public MyComplex conjugate() {
        MyComplex newObject = new MyComplex();
        newObject.real = this.real;
        newObject.imag = (-1)*this.imag;
        return newObject;
    }




}
