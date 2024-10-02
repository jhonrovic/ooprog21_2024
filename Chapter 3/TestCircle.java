public class TestCircle {
    public static void main(String[] args) {
        
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        a.setRadius(3);
        System.out.println("Radius of the first circle: " + Circle.getRadius());
        System.out.println("Diameter of the circle: " + Circle.getDiameter());
        System.out.println("Area of the first circle: " + Circle.getArea());

        b.setRadius(20);
        System.out.println("\nRadius of the second circle: " + Circle.getRadius());
        System.out.println("Diameter of the second circle: " + Circle.getDiameter());
        System.out.println("Area of the second circle: " + Circle.getArea());
    }
}