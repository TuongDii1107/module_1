package baitap;

import java.util.Scanner;

public class CacPhepToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = sc.nextInt();

        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        int Tong = a + b;
        int Hieu = a - b;
        int Tich = a * b;
        double Thuong = a / b;
        double ld = a%b;

        System.out.println("Tổng: "+Tong);
        System.out.println("Hiệu: "+Hieu);
        System.out.println("Tích: "+Tich);
        System.out.println("Thương: "+Thuong);
        System.out.println("Lấy dư: "+ld);
    }
}
