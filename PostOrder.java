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

    // Helper function for recursive postorder traversal
    private void postorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;

        postorderHelper(root.left, result);   // Left
        postorderHelper(root.right, result);  // Right
        result.add(root.val);                 // Root
    }

    public int[] postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        postorderHelper(root, resultList);

        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}