package string;

// Determine whether the given string can be obtained by one concatenation of some string to itself.

// Example

// For inputString = "tandemtandem", the output should be
// isTandemRepeat(inputString) = true;
// For inputString = "qqq", the output should be
// isTandemRepeat(inputString) = false;
// For inputString = "2w2ww", the output should be
// isTandemRepeat(inputString) = false.

public class Bai5 {
    static boolean isTandemRepeat(String inputString) {
        int len = inputString.length();

        String firstString = inputString.substring(0, len/2);
        String lastString = inputString.substring(len/2, len);

        if(!firstString.equals(lastString)){
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "tandemtandem";
        System.out.println(isTandemRepeat(s));
    }    
}
