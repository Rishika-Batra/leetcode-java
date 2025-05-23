class Solution {
    public int strStr(String haystack, String needle) {
        int l1= haystack.length();
        int l2= needle.length();
        if(l2>l1) return -1;
        for(int i=0;i<=l1-l2;i++){
            String str="";
            for(int j=0;j<l2;j++){
                str=str+haystack.charAt(i+j);
            }
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}