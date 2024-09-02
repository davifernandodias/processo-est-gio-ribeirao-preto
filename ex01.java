import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite n: ");
        int n = sc.nextInt();

        boolean r = isFibonacci(n);
        System.out.println(r ? n + " pertence" : n + "não pertence.");

        sc.close();
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (n == a || n == b) {
            return true;
        }
        while (b < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return (b == n);
    }
}
