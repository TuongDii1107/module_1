
package bai_tap;

import java.util.Scanner;
/**
 * Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh. Tính điểm trung bình của học sinh đó.
 */
public class TinhTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm Toán: ");
        double Toan = sc.nextDouble();

        System.out.println("Hệ Số môn Toán: ");

        int hst = sc.nextInt();

        System.out.println("Nhập điểm Lý: ");
        double Ly = sc.nextDouble();

        System.out.println("Hệ Số môn Lý: ");
        int hsl = sc.nextInt();

        System.out.println("Nhập điểm Hóa: ");
        double Hoa = sc.nextDouble();

        System.out.println("Hệ Số môn Hóa: ");
        int hsh = sc.nextInt();

        double diemTB = (Toan * hst + Ly * hsl + Hoa * hsh) / (hst + hsl + hsh);
        System.out.printf("Điểm Trung bình : " + diemTB);

    }
}
