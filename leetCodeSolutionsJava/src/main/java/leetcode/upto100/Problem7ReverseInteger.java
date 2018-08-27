package leetcode.upto100;

public class Problem7ReverseInteger {
    public int reverse(int x) {
       long long_sum = 0;
       int a= Integer.reverse(x);
       int min = Integer.MIN_VALUE;
       while(x != 0){
           long_sum = long_sum * 10 + x %10;
           x = x/10;
       }
       int int_sum = (int) long_sum;
       if(int_sum != long_sum){
           return 0;
       }
       return int_sum;
    }

    public static void main(String[] args) {
        Problem7ReverseInteger solution = new Problem7ReverseInteger();
//        System.out.println(solution.reverse(123));
//        System.out.println(solution.reverse(-123));
//        System.out.println(Integer.MIN_VALUE);
        System.out.println(solution.reverse((Integer.MIN_VALUE)));
//        System.out.println(solution.reverse((int)-112348231748L));
//        System.out.println(solution.reverse((int)-112348231748L));
    }
}
