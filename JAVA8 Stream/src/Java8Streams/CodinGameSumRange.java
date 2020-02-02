package Java8Streams;

public class CodinGameSumRange {

    public static void main(String[] args) {

        int[] ints = {1,20,3,10,-2,100};
        int result =Solution.sumRange(ints);
        System.out.println("result " +result);
        System.out.println("expected result 130 ");
    }
}

class Solution {
    static int sumRange (int [] ints) {
        int sum = 0;
        for (int i = 1; i < ints.length; i++) {
            int n = ints[i];
            if (n >= 10 && n<= 100) sum +=n;

        }
        return sum;
    }
}
