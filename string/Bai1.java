package string;

// The website considers a password to be strong if it satisfies the following criteria:

// Its length is at least 6
// It contains at least one digit (1234567890)
// It contains at least one lowercase English character. (abc...z)
// It contains at least one uppercase English character (ABC...Z)
// It contains at least one special character. The special characters are: !@#$%^&*()-+
// Given the password as a string, write the function to check the password is strong?

// Example:

// For password = "abc", the output should be
// checkStrongPassword(password ) = false;
// For password = "Aa1!", the output should be
// checkStrongPassword(password ) = false;
// For password = "Aabc1!", the output should be
// checkStrongPassword(password ) = true;

public class Bai1 {
    static boolean checkStrongPassword(String password) {
        if(password.length() < 6)
            return false;

        boolean kt1 = false;
        boolean kt2 = false;
        boolean kt3 = false;

        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                kt1 = true;
            }
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                kt2 = true;
            }
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                kt3 = true;
            }
        }


        if(kt1 == true && kt2 == true && kt3 == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String password = "Hell";
        System.out.println(checkStrongPassword(password));
    }
}   