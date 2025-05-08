import java.util.*;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++){
			char[] chs = strs[i].toCharArray();
			Arrays.sort(chs);
			String key = new String(chs);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
		}
        List<List<String>> ans = new ArrayList<>(map.values());
		 for(List<String> group : ans){
            Collections.sort(group);   
        }

        return ans;
		
    }
}