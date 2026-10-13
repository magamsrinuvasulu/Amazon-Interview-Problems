import java.util.*;
class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        if(n>0)
        arr[0]=0;
        if(n>1)
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("-----Display-----");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}