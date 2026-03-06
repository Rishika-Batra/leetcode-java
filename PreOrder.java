import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    // Helper function for recursive preorder traversal
    private void preorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);              // Visit Root
        preorderHelper(root.left, result); // Visit Left
        preorderHelper(root.right, result); // Visit Right
    }

    public int[] preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        preorderHelper(root, resultList);

        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}