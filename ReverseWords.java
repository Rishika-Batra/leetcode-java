class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String news="";
        String[] arr =  s.split("\\s+");
        for (int i = 0; i < arr.length / 2; i++) {
    String temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
for(int i=0;i<arr.length;i++){
    news = news+arr[i]+" ";
}
return news.trim();
    }
}