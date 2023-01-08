public class Circles {
    public double r1;
    public double r2;
    public double x;
    public double y;
    public double d;
    public Circles(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
}

    public double circleArea1() {
        return x = 3.14*r1*r1;
    }
    public double circleArea2() {

        return y = 3.14*r2*r2;
    }

    public void countAreaDifference() {
        if (x > y) {
             d = x - y;
            System.out.println(d);
        } else {
             d = y - x;
            System.out.println(d);
        }
    }
}
