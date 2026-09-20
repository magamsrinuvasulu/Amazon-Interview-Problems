class Kadane'sAlgorithm
{
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum=0;
        int max=arr[0];
        for(int x:arr){
            sum+=x;
            max=Math.max(max,sum);
            if(sum<0)
            sum=0;;
        }
        return max;
    }
}
