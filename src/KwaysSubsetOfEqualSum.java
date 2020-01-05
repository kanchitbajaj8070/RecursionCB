import java.util.*;
import java.util.stream.Collectors;

public class KwaysSubsetOfEqualSum {
    public static void main(String[] args) {

        int k =2;
        int[] nums = {5,1,4,2,3,3,2};
        int sum = 0;
        for (int a : nums)
            sum += a;
        if (sum % k != 0) {
            System.out.println("Not possible");
            return;
        }
        int sumPerSet = sum / k;
        System.out.println(sumPerSet);
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        boolean answer = canPartitionKways(nums, visited, k, sumPerSet, 0, 0);
        System.out.println(answer);

    }

    private static boolean canPartitionKways(int[] nums, boolean[] visited, int k, int sumPerSet, int i, int curSetSum) {
        if (k == 1)
            return true;
        if (curSetSum > sumPerSet)
            return false;
        if (curSetSum == sumPerSet)
            return canPartitionKways(nums, visited, k - 1, sumPerSet, 0, 0);

        for (int j = i; j < nums.length; j++) {
            if (!visited[j]) {
                visited[j] = true;
                if (canPartitionKways(nums, visited, k, sumPerSet, j + 1, curSetSum + nums[i]))
                    return true;
                visited[j] = false;
            }
        }

        return false;
    }

}