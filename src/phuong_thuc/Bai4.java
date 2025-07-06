package phuong_thuc;

import java.util.Scanner;

/**
 * 4. Tìm ước số chung lớn nhất (USCLN)
 */
public class Bai4 {
    public static int timUSCLN(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (max % min == 0) return min;

        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();

        System.out.print("Ước chung lớn nhất của " + a + " và " + b + " là : " + timUSCLN(a,b));
    }
}
