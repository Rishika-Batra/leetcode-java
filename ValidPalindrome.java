class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
             if (Character.isLetterOrDigit(s.charAt(i))) { 
                str = str + Character.toLowerCase(s.charAt(i));
            }
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    
    }
}