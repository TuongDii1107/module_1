
package bai_tap;

import java.util.Scanner;
/**
 * Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
 *
 * Công thức
 * Chu vi: C = 2 * π * r
 * Diện tích: A = π * r²
 */
public class ChuViHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        double C = 2 * (Math.PI) * r;
        System.out.printf("Bán Kính Hình Tròn : %.2f", C);

        double A = (Math.PI) * (r * r); // Math.pow(r, 2)
        System.out.printf("\nDiện tích hình tròn: %.2f", A);

    }
}
