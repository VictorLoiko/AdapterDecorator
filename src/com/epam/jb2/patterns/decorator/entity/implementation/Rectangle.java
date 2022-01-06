package com.epam.jb2.patterns.decorator.entity.implementation;

import com.epam.jb2.patterns.decorator.entity.FigureShape;

public class Rectangle implements FigureShape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }

    @Override
    public String description() {
        return "Rectangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}