public class Re {
    private double le;
    private double wi;

    Rectangle(double le, double width) {
        this.le = le;
        this.width = width;
    }

    public double ca() {
        return length * width;
    }

    public static void ma(String[] args) {
        Rectangle re = new Rectangle(5.0, 3.0);
        System.out.println("Длина: " + re.length);
        System.out.println("Ширина: " + re.width);
        System.out.println("Площадь: " + re.calculateArea());
    }
}