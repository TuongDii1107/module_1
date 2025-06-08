package bai_tap_cau_truc_lap;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        double S = 0.0;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            S += 1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.print(S + " ");
    }
}
