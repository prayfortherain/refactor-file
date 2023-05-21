import java.util.Random;

public class Text{
    public static void main(String[] args) {
        /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt(); */
        int a = 5; //ряд
        int b = 3; //столбец
        //целая строка
        int[][] matr = Text.generate(a,b);
        for(int i = 0; i < a; i++){ //вывод матрицы
            for(int j = 0; j < b; j++){
                System.out.print(matr[i][j] + " ");}
            System.out.println(" ");}
        System.out.println("Чётные ряды, у которых первый элемент больше последнего: ");
        for(int i = 1; i < a; i=i+2){ //чётные ряды
            if (matr[i][0]>matr[i][b-1]){
                for(int j = 0; j < b; j++){
                    System.out.print(matr[i][j] + " ");}
                System.out.println(" ");}}}
    public static int[][] generate(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100 - -100 + 1) + -100;}}
        return matrix;}}