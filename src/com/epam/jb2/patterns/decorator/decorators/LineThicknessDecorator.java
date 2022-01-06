package com.epam.jb2.patterns.decorator.decorators;

import com.epam.jb2.patterns.decorator.entity.FigureShape;

public class LineThicknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThicknessDecorator(FigureShape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line thickness: " + thickness);
    }

    // no change in the functionality
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with line thickness " + thickness + ".";
    }

    // no change in the functionality
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}
