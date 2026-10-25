import java.util.Scanner;

public class task3 {
    static void printInvertedPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printInvertedPyramid(n);
    }
}