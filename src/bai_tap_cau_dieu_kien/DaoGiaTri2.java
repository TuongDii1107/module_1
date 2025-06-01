package bai_tap_cau_dieu_kien;

import java.util.Scanner;

/*
Không dùng biến phụ
 */
public class DaoGiaTri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);
    }
}
