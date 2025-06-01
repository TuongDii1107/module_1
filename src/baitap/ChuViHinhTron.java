package baitap;

import java.util.Scanner;

public class ChuViHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        double C = 2 * (Math.PI) * r;
        System.out.printf("Bán Kính Hình Tròn : %.2f",C);

        double A = (Math.PI) * (r * r);
        System.out.printf("\nDiện tích hình tròn: %.2f",A);

    }
}
