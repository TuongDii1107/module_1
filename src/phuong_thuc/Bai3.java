package phuong_thuc;

import java.util.Scanner;

/**
 * Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện:
 * a.    S = 1 + 2 + … + n
 * b.    S = 1^2 + 2^2 + … + n^2
 * c.    S = 1 + 1/2 + … + 1/n
 * d.    S = 1 * 2 * … * n
 * e.    S = 1! + 2! + … + n!
 */
public class Bai3 {
    public static int cauA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int cauB(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double cauC(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static long cauD(int n) {
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static long cauE(int n) {
        long sum = 0;
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            sum += giaiThua;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.println("Câu A:");
        System.out.printf("S = 1 + 2 + ... + %d = %d", n, cauA(n));

        System.out.println("\nCâu B:");
        System.out.printf("S = 1^2 + 2^2 + ... + %d^2 = %d", n, cauB(n));

        System.out.println("\nCâu C:");
        System.out.printf("S = 1 + 1/2 + ... + 1/%d = %.2f", n, cauC(n));

        System.out.println("\nCâu D:");
        System.out.printf("S = 1 * 2 * ... + %d = %d", n, cauD(n));

        System.out.println("\nCâu E:");
        System.out.printf("S = 1! + 2! + … + %d! = %d", n, cauE(n));
    }
}
