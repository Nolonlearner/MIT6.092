package Oct09Practice1;

//Shape.java
public abstract class Shape implements Comparable<Shape> {
    public abstract double getArea();
    public abstract String getDescription();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.getArea(), other.getArea());
    }
}
