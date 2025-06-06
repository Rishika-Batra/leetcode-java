class Solution {
    public boolean isPalindrome(int x) {
       int d=x;
       int f=0;
       int sum=0;
       while(d>0){
        f=d%10;
        sum=sum*10+f;
        d=d/10;
        f=0;
       }
       if(sum==x){
        return true;
       }
       else{
        return false;
       }
    }
}