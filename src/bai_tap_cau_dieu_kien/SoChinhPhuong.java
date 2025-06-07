package bai_tap_cau_dieu_kien;

import java.util.Scanner;

/**
 * Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không? Định nghĩa số chính phương
 * : Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ...
 */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương x: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            double squareRoot = Math.sqrt(x);

            if (squareRoot % 1 == 0) {
                System.out.println(x + " là số chính phương.");
            } else {
                System.out.println(x + " không phải là số chính phương.");
            }
        }
        sc.close();
    }
}
