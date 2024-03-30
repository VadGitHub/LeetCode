import java.util.Arrays;

public class Solution {
    public static boolean isPalindrome(int x){

        String fwStr = String.valueOf(x);
        char[] charArray = fwStr.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++){
            if (charArray[i] != charArray[charArray.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
