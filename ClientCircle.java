// Define the Circlearea class
class Circlearea {
    // Method to calculate area of a circle
    public double calAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class to run the program
public class ClientCircle {
    
    public static void main(String[] args) {
        Circlearea x = new Circlearea(); // Creating an instance of Circlearea
        double radius = 5;
        double r = x.calAreaCircle(radius); // Calling calAreaCircle method
        System.out.println(r); // Outputting the calculated area
    }
}
