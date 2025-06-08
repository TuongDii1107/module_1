package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * 2. In dãy số lẻ từ 1 đến n
 */
public class InRaSoLeTu1DenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
