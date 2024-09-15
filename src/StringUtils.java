
public class StringUtils {
    public static int containsA(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                ++count;
            }
        }

        return count;
    }
}