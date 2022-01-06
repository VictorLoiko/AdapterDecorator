package com.epam.jb2.patterns.adapter.adapter;

import com.epam.jb2.patterns.adapter.entity.FigureShape;
import com.epam.jb2.patterns.adapter.entity.GeometricShape;
import com.epam.jb2.patterns.adapter.entity.implementation.Rhombus;
import com.epam.jb2.patterns.adapter.entity.implementation.Triangle;

public class GeometricShapeObjectAdapter implements FigureShape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }

}