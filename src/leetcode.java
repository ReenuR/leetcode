import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int [][] acc ={{0,0,1},{1,1,1},{1,0,1}};
        int[] result1 = findMaxOnesRow(acc);
        System.out.println(result1[0] + ", " + result1[1]);  // Output: 1, 2

      //  System.out.println(findMaxOnesRow(acc));
    }

    public static int[] findMaxOnesRow(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        int totalCount;
        int m = mat.length;
        for(int i = 0 ; i < m; i++){
            totalCount = 0;
            for(int j = 0; j < mat[i].length; j++){
                totalCount += mat[i][j];
            }
            if(totalCount > maxOnesIdx){
                maxOnesCount = totalCount;
                maxOnesIdx = i;
            }
        }

        return new int[]{maxOnesIdx, maxOnesCount};
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize maxWealth to 0
        int m = accounts.length;

        int totalWealth =0;
        for(int i =0 ; i < m; i++){
            totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++){
                totalWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth,totalWealth);
        }
        return maxWealth;
    }
    public static int findClosestNumber(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++)
            result[i] = nums[i] < 0 ? 0 - nums[i]:  0+nums[i];

        Arrays.sort(result);
        return result[0];
    }
}
