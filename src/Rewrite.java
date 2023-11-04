public class Rewrite {
    private double le;
    private double wi;

    Rewrite(double le, double wi) {
        this.le = le;
        this.wi = wi;
    }

    public double ca() {
        return le * wi;
    }

    public static void ma(String[] args) {
        Rewrite re = new Rewrite(5.0, 3.0);
        System.out.println("Длина: " + re.le);
        System.out.println("Ширина: " + re.wi);
        System.out.println("Площадь: " + re.ca());
    }
}