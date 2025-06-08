package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Viết chương trình tính :
 *
 * S=1+1/2+1/3+....+1/n
 *
 * Số n được nhập từ bàn phím
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        double S = 0.0;

        for (int i = 1; i <= n; i++) {
            S += 1.0/i;
        }
        System.out.print(S + " ");
    }
}
