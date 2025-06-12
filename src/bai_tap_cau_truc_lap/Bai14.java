package bai_tap_cau_truc_lap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * * * * * * *
 * *           *
 * *           *
 * *           *
 * *           *
 * * * * * * *
 */
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài của hình vuông: ");
        int cd = sc.nextInt();

        for (int i = 1; i <= cd; i++) {
            for (int j = 1; j <= cd; j++) {
                if (i == 1 || i == cd || j == 1 || j == cd) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
