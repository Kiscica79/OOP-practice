public class TestCircle {
    public static void main(String[] args) {

        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();

        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);

        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        //The circle has radius of 2.0 and area of 12.566370614359172

        // TODO 3rd constructor using an instance of Circle
        Circle c3 = new Circle(4, "black");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea());

        // TODO modify the test program for the color
        System.out.println(c3.getColor()+" is the color of the circle.");

        // TODO public vs private
        System.out.println(c1.getRadius());
        // cannot  sout + c1.radius, because radius is private

        // TODO
        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.5);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green");       // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        // You cannot do the following because setRadius() returns void,
        // which cannot be printed System.out.println(c4.setRadius(4.4));

        // TODO Try calling toString() method explicitly, just like any other method
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());
        // explicit call
    }

}
