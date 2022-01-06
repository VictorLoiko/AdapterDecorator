package com.epam.jb2.patterns.adapter.instance;

import com.epam.jb2.patterns.adapter.entity.FigureShape;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    List<FigureShape> shapes = new ArrayList<FigureShape>();

    public Drawing() {
        super();
    }

    public void addShape(FigureShape shape) {
        shapes.add(shape);
    }

    public List<FigureShape> getShapes() {
        return new ArrayList<FigureShape>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}
