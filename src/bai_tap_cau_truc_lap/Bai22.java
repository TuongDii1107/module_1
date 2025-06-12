package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên dương a & b với điều kiện là b > a.
 * Hãy thực hiện đếm và tính tổng trong đoạn[a, b] có bao nhiêu số đối xứng, chính phương, nguyên tố
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Nhập số nguyên dương a: ");
            a = sc.nextInt();
            System.out.print("Nhập số nguyên dương b: ");
            b = sc.nextInt();
        } while (a <= 0 || b <= 0 || b <= a);

        int demDoiXung = 0, tongDoiXung = 0;
        int demChinhPhuong = 0, tongChinhPhuong = 0;
        int demNguyenTo = 0, tongNguyenTo = 0;

        for (int i = a; i <= b; i++) {
            String str = Integer.toString(i);

            boolean laDoiXung = true;
            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    laDoiXung = false;
                    break;
                }
            }
            if (laDoiXung) {
                demDoiXung++;
                tongDoiXung += i;
            }

            boolean laChinhPhuong = false;
            int can = (int) Math.sqrt(i);
            if (can * can == i) laChinhPhuong = true;
            if (laChinhPhuong) {
                demChinhPhuong++;
                tongChinhPhuong += i;
            }

            boolean laNguyenTo = true;
            if (i < 2) {
                laNguyenTo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        laNguyenTo = false;
                        break;
                    }
                }
            }
            if (laNguyenTo) {
                demNguyenTo++;
                tongNguyenTo += i;
            }
        }

        System.out.println("Số đối xứng: " + demDoiXung + " | Tổng: " + tongDoiXung);
        System.out.println("Số chính phương: " + demChinhPhuong + " | Tổng: " + tongChinhPhuong);
        System.out.println("Số nguyên tố: " + demNguyenTo + " | Tổng: " + tongNguyenTo);
    }
}
