package Dsa;

public class ReverseVowelsInString {
    static boolean isVowel(char c)
    {
        return  (c == 'a' || c =='e' || c =='i' || c =='o' || c =='u' || c == 'A' || c =='E' || c=='I' || c=='O' || c =='U');
    }
    public static String reverseVowels(String s) {
        int l = s.length();
        char strArr[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start< end){
            if(!isVowel(strArr[start])){
                start++;
                continue;
            }
            if(!isVowel(strArr[end])){
                end--;
                continue;
            }

            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }

        s = s.copyValueOf(strArr);
        return s;


    }
}