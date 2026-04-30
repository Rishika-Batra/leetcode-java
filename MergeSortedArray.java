import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        int[] mix=new int[m+n];
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }
            else{
                mix[k]=nums2[j];
                j++;
            }
            k++;
        }
         while(i<m){
            mix[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            mix[k]=nums2[j];
            k++;
            j++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = mix[x];
        }
        System.out.println(Arrays.toString(nums1));
    }
}