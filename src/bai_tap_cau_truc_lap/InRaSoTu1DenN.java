package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * 1. In dãy số 1, 2, 3, 4, 5,..., n
 */
public class InRaSoTu1DenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
