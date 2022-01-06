package com.epam.jb2.patterns.adapter.adapter;

import com.epam.jb2.patterns.adapter.entity.FigureShape;
import com.epam.jb2.patterns.adapter.entity.implementation.Triangle;

public class TriangleAdapter extends Triangle implements FigureShape {

    public TriangleAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Triangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
