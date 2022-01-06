package com.epam.jb2.patterns.decorator.decorators;

import com.epam.jb2.patterns.decorator.constants.LineStyle;
import com.epam.jb2.patterns.decorator.entity.FigureShape;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(FigureShape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Style: " + style);
    }

    // no change in the functionality
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + style + " lines.";
    }

    // no change in the functionality
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}
