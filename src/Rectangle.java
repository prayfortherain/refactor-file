public class Rectangle {
    // Поля класса (переменные экземпляра)
    private double length; // Длина прямоугольника
    private double width;  // Ширина прямоугольника

    // Конструктор класса
    Rectangle (double length, double width) {
        this.length = length; // Инициализируем длину
        this.width = width;   // Инициализируем ширину
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return length * width; // Умножаем длину на ширину и возвращаем результат
    }

    public static void main(String[] args) {
        // Создаем объект прямоугольника
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Выводим информацию о прямоугольнике
        System.out.println("Длина: " + rectangle.length);
        System.out.println("Ширина: " + rectangle.width);
        System.out.println("Площадь: " + rectangle.calculateArea());

    }
}