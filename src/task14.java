import java.util.Scanner;

public class task14 {
    static String transformDigits(long n) {
        String result = "";

        while (n > 0) {
            int digit = (int) (n % 10);

            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }

            result = digit + result;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(transformDigits(n));
    }
}
