package com.learn;

public class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length,double breadth){
        this.breadth=breadth;
        this.length=length;
    }

    @Override
    public void getArea() {
        System.out.println("The area of the rectangle will be: " + length*breadth);
    }
}
