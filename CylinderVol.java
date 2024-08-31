import java.util.Scanner;

class Volume {
    // Method to calculate the volume of a cylinder
    double computeVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}

class Cylinder extends Volume {
    double radius;
    double height;

    // Constructor to initialize radius and height
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the area of a cylinder
    double computeArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class CylinderVol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create a Cylinder object
        Cylinder cylinder = new Cylinder(radius, height);

        // Calculate area and volume
        double area = cylinder.computeArea();
        double volume = cylinder.computeVolume(radius, height);

        // Display results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
