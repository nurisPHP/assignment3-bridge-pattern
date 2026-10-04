package org.example.renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle as pixels with radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square as pixels with side length: " + side);
    }
}