package com.learn;

public class Circle implements Shape{
    private double radius;

    public Circle (double radius){
        this.radius= radius;
    }

    @Override
    public void getArea() {
        System.out.println("The area of the circle will be:" +Math.PI*radius*radius);
    }
}
