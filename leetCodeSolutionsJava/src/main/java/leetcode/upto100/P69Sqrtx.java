package leetcode.upto100;

public class P69Sqrtx {
    public int mySqrt(int x) {
        int max = 46340;
        int start = 0;
        int end = Math.min(x/2+1,max);
        int mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            double squaredMid = mid * mid;
            double squaredMidPlus1 = (mid+1) * (mid+1);
            if(squaredMid == x){
                return mid;
            }
            if(squaredMid < x && squaredMidPlus1 > x){
                return mid;
            }
            if(squaredMid < x){
                start = mid +1;
            }else if(squaredMid > x){
                end = mid -1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        P69Sqrtx solution = new P69Sqrtx();
        System.out.println(solution.mySqrt(Integer.MAX_VALUE));
        for (int i = 0; i < 100; i++) {
            System.out.println(i +" " + solution.mySqrt(i));
        }
        System.out.println(Math.sqrt(Integer.MAX_VALUE));
    }
}
