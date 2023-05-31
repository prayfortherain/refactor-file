import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("C://Users//acer//IdeaProjects//laba14//src//Text.txt");
            FileWriter writer = new FileWriter("C://Users//acer//IdeaProjects//laba14//src//Math.txt", true);
            Pattern pattern = Pattern.compile("(/{2}[^\n]*\n)|(/\\*.*?\\*/)", Pattern.DOTALL);
            int c;
            StringBuilder input = new StringBuilder();
            while ((c = reader.read()) != -1) {
                switch ((char) c) {
                    case '{', ';' -> {
                        input.append((char) c);
                        input.append("\n");
                    }
                    default -> input.append((char) c);
                }
            }
            Matcher matcher = pattern.matcher(input.toString());
            input = new StringBuilder(matcher.replaceAll(""));
            writer.write(input.toString());
            reader.close();
            writer.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        /*try(FileReader fr = new FileReader("C://Users//acer//IdeaProjects//laba14//src//Text.txt");
            FileWriter fw = new FileWriter("C://Users//acer//IdeaProjects//laba14//src//Math.txt", true);
            BufferedReader br=new BufferedReader(fr)){
            String string="";
            String m = "";
            while ((string=br.readLine())!=null){
                Matcher matcher = Pattern.compile("\\/{2}.*").matcher(string);
                Matcher matcher1 = Pattern.compile("\\b" + "Text" + "\\b").matcher(string);
                    if(matcher.find()){
                        System.out.println(m = matcher.group());
                        fw.write(string, 0, string.length()-m.length());
                        fw.append("\n");
                    } else if (matcher1.find()) {
                        String newString = string.replace("Text", "Math");
                        fw.write(newString);
                        fw.append("\n");
                    } else {
                        fw.write(string, 0, string.length());
                        fw.append("\n");}
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
    }}