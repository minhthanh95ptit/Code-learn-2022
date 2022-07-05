package sequence;

// Given a sequence determine if it's an arithmetic progression or not.

// Example

// For sequence = [1, 4, 7], the output should be
// isArithmeticProgression(sequence) = true;
// For sequence = [2, 4, 7], the output should be
// isArithmeticProgression(sequence) = false.



public class _2_isArithmeticProgression {
    static boolean isArithmeticProgression(int[] sequence) {
        int k = sequence[1] - sequence[0];
        for(int i = 1; i < sequence.length - 1; i++) {
            if(sequence[i + 1] - sequence[i] != k) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sequence = {-7, -5, -3, -1};

        System.out.println(isArithmeticProgression(sequence));
    }
}
