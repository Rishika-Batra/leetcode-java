import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new LinkedList<>();
        perms.add(new ArrayList<>());
        for (int num : nums) {
            int size = perms.size();
            for (int i = 0; i < size; i++) {
                List<Integer> p = perms.removeFirst();
                for (int j = 0; j <= p.size(); j++) {
                    List<Integer> p_copy = new ArrayList<>(p);
                    p_copy.add(j, num);
                    perms.add(p_copy);
                }
            }
        }
        return perms;
    }
}