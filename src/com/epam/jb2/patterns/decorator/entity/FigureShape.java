package com.epam.jb2.patterns.decorator.entity;

public interface FigureShape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}