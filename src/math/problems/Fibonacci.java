package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int first = 0;
        int second = 1;
        int n = 10;
        for (int i = 1; i <= 40; i++) {
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
