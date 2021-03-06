package com.epam.jb2.patterns.adapter.adapters;

import com.epam.jb2.patterns.adapter.entity.FigureShape;
import com.epam.jb2.patterns.adapter.entity.implementation.Rhombus;

public class RhombusAdapter extends Rhombus implements FigureShape {

    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}