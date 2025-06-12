package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 * <p>
 * Hình b
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 * <p>
 * Hình c
 * *            *
 * *            *
 * *            *
 * *            *
 * *            *
 * * * * * * *
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài của hình vuông: ");
        int cd = sc.nextInt();

        System.out.println("Hình 1");
        for (int i = 1; i <= cd; i++) {
            for (int j = 1; j <= cd; j++) {
                if (i == 1 || i == cd || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("Hình 2");
        for (int i = 1; i <= cd; i++) {
            for (int j = 1; j <= cd; j++) {
                if (i == 1 || i == cd || j == cd) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("Hình 3");
        for (int i = 1; i <= cd; i++) {
            for (int j = 1; j <= cd; j++) {
                if (i == cd || j == 1 || j == cd) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
