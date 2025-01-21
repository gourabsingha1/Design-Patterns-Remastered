package org.example.factory.gooddesign;

public class CircleShape extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
