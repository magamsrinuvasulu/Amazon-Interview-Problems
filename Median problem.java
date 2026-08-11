import java.util.*;
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==1){
            return arr[n/2];
        }else{
            return (arr[n/2-1]+arr[n/2])/2.0;
        }
    }
    public static void main(String[] args){
        int[] arr={90, 100, 78, 89, 67};
        Solution s=new Solution();
        System.out.println(s.findMedian(arr));
    }
}
