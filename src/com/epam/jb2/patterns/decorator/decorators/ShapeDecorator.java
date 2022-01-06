package com.epam.jb2.patterns.decorator.decorators;

import com.epam.jb2.patterns.decorator.entity.FigureShape;

public abstract class ShapeDecorator implements FigureShape {
    protected FigureShape decoratedShape;

    public ShapeDecorator(FigureShape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }

}