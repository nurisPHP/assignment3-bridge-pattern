package org.example;

import org.example.renderer.RasterRenderer;
import org.example.renderer.Renderer;
import org.example.renderer.VectorRenderer;
import org.example.shape.Circle;
import org.example.shape.Shape;
import org.example.shape.Square;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        System.out.println("=== Vector Rendering ===");
        Shape circle = new Circle(vectorRenderer, 5.0);
        Shape square = new Square(vectorRenderer, 10.0);

        circle.draw();
        square.draw();

        System.out.println("\n=== Dynamic Switching to Raster ===");
        circle.setRenderer(rasterRenderer);
        square.setRenderer(rasterRenderer);

        circle.draw();
        square.draw();

        System.out.println("\n=== Resizing Circle ===");
        circle.resize(2.0);
        circle.draw();
    }
}