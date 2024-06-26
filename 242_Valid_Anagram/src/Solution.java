import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return false;
        if (s.length() != t.length()) return false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);

    }
}
