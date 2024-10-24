import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder();
        String name = null;
        Stack<String> stk = new Stack<>();
        for (char c : String.valueOf(x).toCharArray()) {
            stk.push(String.valueOf(c));
        }
        while (!stk.isEmpty()){
            str.append(stk.pop());
        }
        return (String.valueOf(str).compareTo(String.valueOf(x)) == 0);

    }
    public static int romanToInt(String s) {
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (i > 0 && map.get(c) > map.get(s.charAt(i - 1))) {
                num += map.get(c) - 2 * map.get(s.charAt(i - 1));
            } else {
                num += map.get(c);
            }
        }

        return num;
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int numOfVal = 0;
        for (int i = 0; i < len; i++){
            if (nums[i] == val){
                numOfVal++;
                nums[i] = -1;
            }
        }
        int[] newNums = new int[len-numOfVal];
        int numm = 0;
        for (int i = 0; i < len; i++){
            if (nums[i] != val) {
                newNums[numm] = nums[i];
                numm++;
            }
        }
        return len-numOfVal;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(151));
        System.out.println(romanToInt("MCMXCIV"));
    }

}