package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * In dãy số 1, -3, 7, -15, 31, … (n là số nhập vào từ bàn phím).
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int a = 1;
        int dau = 1;
        while (a <= n){
            System.out.print(a * dau + " ");

            a = a * 2 + 1;

            dau = -dau;

        }

    }
}
