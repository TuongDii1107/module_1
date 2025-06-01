/**
 * Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?
 */
package bai_tap;

import java.util.Scanner;

public class TinhNut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biển số xe: ");
        int bs = sc.nextInt();

        int tong = bs % 10;
        bs = bs / 10;

        tong = tong + bs % 10;
        bs = bs / 10;

        tong = tong + bs % 10;
        bs = bs / 10;

        tong = tong + bs % 10;
        bs = bs / 10;

        tong = tong + bs;


        System.out.println("Tổng: " + tong);

        int tongnut = tong % 10;

        System.out.println("Số nút: " + tongnut);

    }
}
