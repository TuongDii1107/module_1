package bai_tap_cau_dieu_kien;

import java.util.Scanner;

/*
Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.
 */
public class TimMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        int max;
        int min;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
