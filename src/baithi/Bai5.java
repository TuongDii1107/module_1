package baithi;

import java.util.Scanner;

/**
 * tm số lớn nhì
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        System.out.print("Nhập số phần tử n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }


    }

    public static int timSoLonNhat(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}

