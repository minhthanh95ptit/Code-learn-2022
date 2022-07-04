package string;

// You have been given a string s, which is supposed to be a sentence. However, someone forgot to put spaces between the different words, and for some reason they capitalized the first letter of every word. Return the sentence after making the following amendments:

// Put a single space between the words.
// Convert the uppercase letters to lowercase.
// Example

// For s = "CodelearnIsAwesome", the output should be
// amendTheSentence(s) = "codelearn is awesome";
// For s = "Hello", the output should be
// amendTheSentence(s) = "hello".

public abstract class Bai2 {
    static String amendTheSentence(String s) {
        String result = "";    
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
            result += (char)(s.charAt(0) + 32);
        } else result += (s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                result += " " + (char)(s.charAt(i) + 32);
            }
            else result += (s.charAt(i));
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "vSKwWDjwIerQKMgVaAniorRJlerbKpDgvyKBLPNwSRWtylqKewNFtERNuUBBHAsGkTSSfdhQHJYvAighAdeG";
        amendTheSentence(s);
    }
}
