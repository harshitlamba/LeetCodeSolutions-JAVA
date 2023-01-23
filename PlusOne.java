public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length-1] < 9) {
            digits[digits.length-1] += 1;
            return digits;
        } else {
            int i = digits.length-1;
            while ((i >= 0) && (digits[i] == 9)) {
                digits[i] = 0;
                i--;
            }
            if (i >= 0) {
                digits[i] += 1;
                return digits;
            } else {
                int[] result = new int[digits.length+1];
                result[0] = 1;
                System.arraycopy(digits,0,result,1,digits.length-1);
                return result;
            }
        }
    }

    public static void main(String[] args) {
        int[] result = plusOne(new int[]{9,8,9});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

