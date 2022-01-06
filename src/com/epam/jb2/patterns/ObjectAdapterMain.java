package com.epam.jb2.patterns;

import com.epam.jb2.patterns.adapter.adapter.GeometricShapeObjectAdapter;
import com.epam.jb2.patterns.adapter.entity.implementation.Circle;
import com.epam.jb2.patterns.adapter.entity.implementation.Rectangle;
import com.epam.jb2.patterns.adapter.entity.implementation.Rhombus;
import com.epam.jb2.patterns.adapter.entity.implementation.Triangle;
import com.epam.jb2.patterns.adapter.instance.Drawing;

public class ObjectAdapterMain {
    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
