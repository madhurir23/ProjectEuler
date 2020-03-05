public class Problem2 {
    // Considering the terms in the Fibonacci sequence whose values do not exceed four million,
    // find the sum of the even-valued terms.
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        int evenSum = 0;
        while (n2 < 4000000) {
            if (n2 % 2 == 0) {
                evenSum += n2;
            }
            int sum =  n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        System.out.println(evenSum);

        // Better solution :
        // Every third Fibonacci number is even - 1  1  2  3  5  8 13 21 34 55 89 144
        // There is structure hidden beneath the even numbers: 2 8 34 144
        // they obey the following recursive relation F(n)=4*F(n-3)+F(n-6)
    }
}
