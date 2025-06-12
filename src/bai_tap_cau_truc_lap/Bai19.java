package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương : ");
        int n = sc.nextInt();

        String soNguyenDuong = "";

        while (n > 0) {
            int thapphan = n % 2;
            soNguyenDuong = thapphan + soNguyenDuong;
            n = n / 2;

        }
        System.out.println("Số nhị phân: " + soNguyenDuong);
    }
}
