import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(numbers, 6)));
    }

    public static int[] twoSum(int[] nums, int target){
        int sum;
        int[] sumindex = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if (sum == target){
                    sumindex[0] = i;
                    sumindex[1] = j;
                    return sumindex;
                }
            }
        }
        sumindex[0] = 0;
        sumindex[1] = 0;
        return sumindex;
    }
}