package com.epam.jb2.patterns;

import com.epam.jb2.patterns.adapter.adapter.RhombusAdapter;
import com.epam.jb2.patterns.adapter.adapter.TriangleAdapter;
import com.epam.jb2.patterns.adapter.entity.implementation.Circle;
import com.epam.jb2.patterns.adapter.entity.implementation.Rectangle;
import com.epam.jb2.patterns.adapter.instance.Drawing;

public class ClassAdapterMain {
    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new TriangleAdapter());
        drawing.addShape(new RhombusAdapter());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
