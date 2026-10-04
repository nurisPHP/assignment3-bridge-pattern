package org.example.shape;

import org.example.renderer.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer cannot be null.");
        }
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException("Renderer cannot be null.");
        }
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(double factor);
}