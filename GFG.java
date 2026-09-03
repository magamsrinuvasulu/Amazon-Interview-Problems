import java.util.Scanner;

class GFG {
    public static int findSumRec(int num){
        if(num==0)
        return 0;
        int sum=num;
        return sum+findSumRec(num-1);
    }
    public static int findSum(int num){
        return findSumRec(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
        // code here
        
    }
}