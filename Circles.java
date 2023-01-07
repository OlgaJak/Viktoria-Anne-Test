public class Circles {
    public double r1;
    public double r2;
    public Circles(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public double circleArea1() {
        return 3.14*r1*r1;
    }
    public double circleArea2() {
        return 3.14*r2*r2;
    }

    public void countAreaDifference() {
        if (circleArea1() > circleArea2()) {
            double y = circleArea1() - circleArea2();
            System.out.println(y);
        } else {
            double x = circleArea2() - circleArea1();
            System.out.println(x);
        }
    }
}
