package hamza.leet.RomanToInteger;
import java.util.HashMap;

public class Solution1 {
    public int romanToInt(String s) {

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = roman.get(s.charAt(i));

            if (value < previousValue) {
                total = total - value;
            }
            else {
                total = total + value;
            }
            previousValue = value;
        }
     return total;
    }

}



