
package bai_tap;

import java.util.Scanner;
/**
 * Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng.
 * Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.
 */
public class CacPhepToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = sc.nextInt();

        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;
        double ld = a % b;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);
        System.out.println("Lấy dư: " + ld);
    }
}
