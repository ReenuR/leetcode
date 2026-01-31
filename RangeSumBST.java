import java.util.ArrayList;

public class RangeSumBST {

    public static void main(String[] args) {
        // Test using the examples provided
        TreeNode example1 = new TreeNode(10);
        example1.left = new TreeNode(5);
        example1.left.left = new TreeNode(3);
        example1.left.right = new TreeNode(7);
        example1.right = new TreeNode(15);
        example1.right.right = new TreeNode(18);

        RangeSumBST solution = new RangeSumBST();
        System.out.println(solution.rangeSumBST(example1, 7, 15));  // Expected output: 32
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        ArrayList<Integer> list = range(root);
        for(int num : list){
            if(num >= L && num <= R)
                sum = sum + num;
        }


        return sum;
    }

    public ArrayList<Integer>  range(TreeNode current){

        ArrayList<Integer> list = new ArrayList<>();
        if (current == null)
            return list;
        list.add(current.val);
        range(current.left);
        range(current.right);
        return list;

    }

}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

