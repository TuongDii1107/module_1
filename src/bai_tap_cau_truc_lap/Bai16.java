package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * *
 * **
 * ***
 * ****
 * *****
 * <p>
 * Hình b
 * *****
 * ****
 * ***
 * **
 * *
 * <p>
 * Hình c
 * *
 * **
 * ***
 * ****
 * *****
 * <p>
 * Hình d
 * *****
 * ****
 * ***
 * **
 * *
 * <p>
 * Hình e
 * *****
 * *    *
 * *  *
 * **
 * *
 * <p>
 * Hình f
 * *
 * ***
 * *****
 * *******
 * <p>
 * Hình g
 * *******
 * *****
 * ***
 * *
 */
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào cạnh của tam giác: ");
        int canh = sc.nextInt();

        System.out.println("hình 1: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("hình 2: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("hình 3: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("hình 4: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= canh - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("hình 5: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i + 1; j++) {
                if (i == 1 || j == canh - i + 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("hình 6: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("hình 7: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (canh - i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
