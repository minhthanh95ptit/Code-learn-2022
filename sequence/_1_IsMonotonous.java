package sequence;

// Given an array of integers, check if it represents either a strictly increasing or a strictly decreasing sequence.

// Example

// For sequence = [1, 4, 5, 7, 9], the output should be
// isMonotonous(sequence) = true;
// For sequence = [0], the output should be
// isMonotonous(sequence) = true;
// For sequence = [3, 3], the output should be
// isMonotonous(sequence) = false.

public class _1_IsMonotonous {
    static boolean isTangDan(int[] sequence){
        for(int i = 1; i < sequence.length - 1; i++){
            if(sequence[i] > sequence[i + 1]){
                return false;
            }
        }
        return true;
    }

    static boolean isGiamDan(int[] sequence){
        for(int i = 1; i < sequence.length - 1; i++){
            if(sequence[i] < sequence[i + 1]){
                return false;
            }
        }
        return true;
    }

    static boolean isBangNhau(int[] sequence){
        for(int i = 1; i < sequence.length - 1; i++){
            if(sequence[i] != sequence[i + 1]){
                return false;
            }
        }
        return true;
    }

    static boolean isMonotonous(int[] sequence) {
        if(sequence.length == 1) return true;
        if(isBangNhau(sequence)) return false;
        if(!isTangDan(sequence) && !isGiamDan(sequence)) return false;
        return true;
    }

    public static void main(String[] args) {
        // int[] sequence = {1, 4, 5, 7, 9};
        // int[] sequence = {5, 3, -2};
        int[] sequence = {0};

        System.out.println(isMonotonous(sequence));
    }
}
