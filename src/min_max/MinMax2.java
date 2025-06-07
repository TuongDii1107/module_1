package min_max;

import java.util.Scanner;

/*
Toán tử 3 ngôi
 */
public class MinMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        int min = a < b ? a : b;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
