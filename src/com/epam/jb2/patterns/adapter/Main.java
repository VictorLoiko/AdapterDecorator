package com.epam.jb2.patterns.adapter;

import com.epam.jb2.patterns.adapter.entity.implementation.Circle;
import com.epam.jb2.patterns.adapter.entity.implementation.Rectangle;
import com.epam.jb2.patterns.adapter.instance.Drawing;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
