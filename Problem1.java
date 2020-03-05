public class Problem1 {
    //sum of all the multiples of 3 or 5 below 1000.
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        // Better approach : use AP to find 1 -> sum of 3, 6, 9 ...., 990 ; 2 -> sum of 5, 10, 15 ... 990
        // 3 -> sum of 15, 30, 45 ... 990 (15 is LCM of 3 and 5)
        // Final result is (1) + (2) - (3) + 993 + 995 + 996 + 999
    }
}
