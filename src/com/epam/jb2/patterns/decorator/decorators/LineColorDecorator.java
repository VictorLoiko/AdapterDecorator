package com.epam.jb2.patterns.decorator.decorators;

import com.epam.jb2.patterns.decorator.constants.Color;
import com.epam.jb2.patterns.decorator.entity.FigureShape;

public class LineColorDecorator extends ShapeDecorator {

    protected Color color;

    public LineColorDecorator(FigureShape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Color: " + color);
    }

    // no change in the functionality
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + color + " color.";
    }

    // no change in the functionality
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}