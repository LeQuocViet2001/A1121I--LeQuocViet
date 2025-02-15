package ss08.ThucHanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = getVolume(height, baseArea, perimeter);
        return volume;
    }

    public static double getVolume(int height, double baseArea, double perimeter) {
        return perimeter * height + 2 * baseArea;
    }

    public static double getPerimeter(double radius) {
        return 2 * Math.PI  * radius;
    }

    public static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

}
