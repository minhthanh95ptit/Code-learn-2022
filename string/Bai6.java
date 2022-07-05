package string;

public class Bai6 {
    static String truncateString(String s) {
        StringBuilder string = new StringBuilder(s);

        while(true){
            int firstIndex = 0;
            int lastIndex = string.length() - 1;

            if(lastIndex < 0){
                break;
            }

            int firstNumber = Character.getNumericValue(string.charAt(firstIndex));
            int lastNumber = Character.getNumericValue(string.charAt(lastIndex));

            if(firstNumber % 3 != 0 && lastNumber % 3 != 0 && (firstNumber + lastNumber) % 3 != 0){
                break;
            }
            
            if(firstNumber % 3 == 0){
                string.deleteCharAt(firstIndex);
            }
            else if(lastNumber % 3 == 0){
                string.deleteCharAt(lastIndex);
                }
            else if((firstNumber + lastNumber) % 3 == 0 && string.length() > 1){
                string.deleteCharAt(lastIndex);
                string.deleteCharAt(firstIndex);
            }

        }
        return string.toString();
    }


    public static void main(String[] args) {
        String s = "366936363";
        System.out.println(truncateString(s));
    }
}
