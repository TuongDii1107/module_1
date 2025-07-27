package baithi;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        System.out.print("Nhập vào mảng số nguyên n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (kiemTraSoNT(arr[i])) {
                System.out.print(arr[i] + " \t ");
            }
        }
    }

    public static boolean kiemTraSoNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

