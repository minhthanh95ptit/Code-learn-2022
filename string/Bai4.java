package string;

public class Bai4 {
    static String formatString(String input) {
        input = input.trim();
        while(input.contains("  ")){
            input = input.replace("  ", " ");
        }
        return input;
    }

    public static void main(String[] args) {
        String input = " abc   a aa  a a ";
        System.out.println(formatString(input));
    }
}
