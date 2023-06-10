/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // TODO add a 3rd constructor to construct a new instance of Circle
    // with the given radius and color public Circle (double r, String c)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Constructors (overloaded)
    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double radius) {  // 2nd constructor
        this.radius = radius;
        color = "red";
    }

    // TODO Return a self-descriptive string of this instance
    //  in the form of Circle[radius=?,color=?]
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    /**
     * Returns the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of this Circle instance
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // TODO new getter for instance variable color
    public String getColor() {
        return color;
    }

    // TODO add setters for instance variable radius and color
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
