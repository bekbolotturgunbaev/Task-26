package com.company;

public class Box <T,S> {
    private T weight;
    private S color;

    public Box(T weight, S color) {
        this.weight = weight;
        this.color = color;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public S getColor() {
        return color;
    }

    public void setColor(S color) {
        this.color = color;
    }

    public static <T> T method(T t) {
        return t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
