package org.example.factory.gooddesign;

public class RectangleShape extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
