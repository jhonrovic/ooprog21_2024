public class Circle {
    
    private static double radius;
    private static double diameter;
    private static double area;
    private static final double PI = Math.PI;

    
    public Circle() {
        setRadius(1); 
    }

  
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius; 
        area = PI * radius * radius; 
    }

   
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
