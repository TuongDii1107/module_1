package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Viết chương trình tính S = a! + b! + c! với a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        do {
            System.out.print("Nhập vào số nguyên dương a : ");
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập vào số nguyên dương b : ");
            b = sc.nextInt();
            if (b <= 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (b <= 0);

        do {
            System.out.print("Nhập vào số nguyên dương c : ");
            c = sc.nextInt();
            if (c <= 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (c <= 0);

        int giaiThuaA = 1;
        int giaiThuaB = 1;
        int giaiThuaC = 1;


        for (int i = 1; i <= a; i++) {
            giaiThuaA *= i;
        }
        for (int i = 1; i <= b; i++) {
            giaiThuaB *= i;
        }
        for (int i = 1; i <= b; i++) {
            giaiThuaC *= i;
        }

        int sum = giaiThuaA * giaiThuaB * giaiThuaC;
        System.out.print("Kết quả: " + sum);
    }
}
