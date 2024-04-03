public class Solution {
    public static int romanToInt(String s) {
        int len = s.length();
        if (len < 1 || len > 15) {
            return -1;
        }

        char[] charArray = s.toCharArray();
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {

            switch (charArray[i]) {
                case 'I':
                    intArray[i] = 1;
                    break;
                case 'V':
                    intArray[i] = 5;
                    break;
                case 'X':
                    intArray[i] = 10;
                    break;
                case 'L':
                    intArray[i] = 50;
                    break;
                case 'C':
                    intArray[i] = 100;
                    break;
                case 'D':
                    intArray[i] = 500;
                    break;
                case 'M':
                    intArray[i] = 1000;
                    break;
                default:
                    return -1;
            }

        }

        int intOutput = 0;
        int prevVal = 0;

        for (int i = len - 1; i >= 0; i-- ){
            int curVal = intArray[i];
            if (i != len - 1){
                prevVal = intArray[i+1];
            }

            if (prevVal > curVal){
                intOutput -= curVal;
            } else {
                intOutput += curVal;
            }

        }

        return intOutput;

    }
}
