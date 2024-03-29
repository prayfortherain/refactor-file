import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\acer\\IdeaProjects\\laba14\\src\\Rectangle.java"));
            StringBuilder optimized = new StringBuilder();
            String line;
            ArrayList<String> identifiers = new ArrayList<>();
            String temp_line;
            String final_line = "";
            String[] dataTypes = new String[]{"int", "void", "String", "double", "Rectangle"}; //типы данных для инициализации
            while ((line = r.readLine()) != null) {
                temp_line = line.replaceAll("//.*", "");
                for (String type : dataTypes) {
                    Matcher matcher1 = Pattern.compile(type + "\\s\\b\\w+\\b").matcher(temp_line); //ищем идентификаторы вместе с их типом
                    if (matcher1.find()) identifiers.add(matcher1.group().substring(matcher1.group().indexOf(" ") + 1)); //добавляем идентификаторы в массив
                }
                optimized.append(temp_line);
            }
            r.close();
            BufferedWriter w = new BufferedWriter(new FileWriter("C:\\Users\\acer\\IdeaProjects\\laba14\\src\\Rewrite.java"));
            StringBuilder renamed = new StringBuilder(optimized.toString());
            for (String name : identifiers) {
                renamed = new StringBuilder(renamed.toString().replaceAll(name, name.substring(0, 2))); //уменьшаем названия переменных до пеивых двух букв
            }
            w.write(renamed.toString()
                    .replaceAll("/\\*(.|\\n)*?\\*/", "") //убираем многострочные комментарии
                    .replaceAll("Rectangle", "Rewrite")
                    .replaceAll("\\s+", " ")); //убираем пробелы и абзацы
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}