package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
 */
public class AmDuongXenKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        int n = sc.nextInt();

        int count = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == 2 || count == 5 || count == 9 || count == 13 || count == 17) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
            count++;
        }
    }
}
