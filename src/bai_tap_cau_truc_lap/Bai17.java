package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * In các hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * ******
 * *
 * *
 * *
 * *
 * ******
 * <p>
 * Hình b
 * ******
 * *
 * *
 * *
 * *
 * ******
 */
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào cạnh : ");
        int canh = sc.nextInt();

        System.out.println("Hình A");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Hình B");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || j == canh - i + 1 || i == canh) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
