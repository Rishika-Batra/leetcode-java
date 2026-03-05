class Solution {
    public int lengthOfLastWord(String s) {
        //String[] a= new String[10];
        String str="";
        String last="";
        int lenlas=0;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                 str = "";
            }
            else{
                str = str + s.charAt(i);
                lenlas = str.length(); 
            }
            
        }
        return lenlas;
    }
}
