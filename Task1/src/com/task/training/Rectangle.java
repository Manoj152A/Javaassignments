package com.task.training;

public class Rectangle extends Shape{
    int length;
    int width;

    @Override
    int getArea(int l,int w) {
        return l+w;
    }
}
