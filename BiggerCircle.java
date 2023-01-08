import java.util.Scanner;

public class BiggerCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter circle one radius:");
        double radius1 = scn.nextDouble();
        System.out.println("Enter circle two radius:");
        double radius2 = scn.nextDouble();

        Circles circle = new Circles(radius1, radius2);

        circle.circleArea1();
        circle.circleArea2();
        System.out.println("The difference in circles area is:");
        circle.countAreaDifference();
//Comment
    }
}
