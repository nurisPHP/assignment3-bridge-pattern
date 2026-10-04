package org.example.renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle as vector lines with radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square as vector lines with side length: " + side);
    }
}