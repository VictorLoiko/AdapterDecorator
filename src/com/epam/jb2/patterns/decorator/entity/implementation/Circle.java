package com.epam.jb2.patterns.decorator.entity.implementation;

import com.epam.jb2.patterns.decorator.entity.FigureShape;

public class Circle implements FigureShape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }

    @Override
    public String description() {
        return "Circle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}