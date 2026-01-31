package Stack;

import java.util.Arrays;
import java.util.Stack;

//Input: [4, 5, 2, 25]
// Output: [5, 25, 25, -1]
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));

    }
    public static int[] nextGreaterElement(int[] nums){
        Stack<Integer> stack =  new Stack<>();

        for(int i=nums.length-1; i>0; i--){
            stack.push(nums[i]);
        }
        int[] nxtGrtrElemntArray = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            int top = stack.peek();
            if(nums[i] < top){
                nxtGrtrElemntArray[i] = top;
            }else {
                stack.pop();
                i--;
            }
        }
        nxtGrtrElemntArray[nums.length-1] = -1;


        return nxtGrtrElemntArray;
    }

}
