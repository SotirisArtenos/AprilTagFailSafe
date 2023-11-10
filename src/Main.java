// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double h4 = 5.5; // value for distance
        double theta = 41; // value for angle


        theta = Math.toRadians(theta);
        double c = h4 * Math.sin(theta);
        double f = 6-c;
        double d = h4 * Math.cos(theta);

        double theta3 = Math.atan(f/d);
        theta3 = Math.toDegrees(theta3); // finds degree from desired AprilTag
        double h5 = Math.sqrt(d*d + f*f); // finds distance of robot to AprilTag


        System.out.println("h5: " + h5 + " theta3: " + theta3);
    }
}