package org.example.factory.baddesign;

public class ShapeFactory {
    public Object createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Unknown shape type: " + shapeType);
    }
}

