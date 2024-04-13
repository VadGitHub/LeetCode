public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        String output = "";
        int inputArrayLen = strs.length;
        int minLen = 200;
        boolean flagToExit = false;

        //Determine min item (word) length of input array
        for (String str : strs) {
            int strLen = str.length();
            if (strLen < minLen)
                minLen = strLen;

        }
        //Main loop by min word length
        for (int i = 0; i < minLen; i++) {
            int indexOfInput = 0;
            char letter = 0;
            if (flagToExit)
                break;
            //loop by words
            for (String str : strs) {
                char[] charArray = str.toCharArray();

                if (indexOfInput == 0) { // 1st word
                    letter = charArray[i];
                } else {

                    if (charArray[i] != letter) {
                        flagToExit = true;
                        break;
                    }

                }

                if (indexOfInput == (inputArrayLen - 1)) {// last word
                    output += letter;
                }

                indexOfInput++;
            }

        }
        return output;

//        if(strs.length==0) return "";
//        String prefix=strs[0];
//
//        for(int i=1;i<strs.length;i++){
//            while(strs[i].indexOf(prefix) != 0){
//                prefix=prefix.substring(0, prefix.length()-1);
//            }
//
//        }
//
//        return prefix;

    }
}


