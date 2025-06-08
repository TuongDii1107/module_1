package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
 */
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên M: ");
        int m = sc.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0){
            int digit = m % 10;

            s += digit;
            p *= digit;

            m = m / 10;
        }
        System.out.println("Giá trị của s: " +s);
        System.out.println("Giá trị của p: " +p);
    }
}
