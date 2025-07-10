package Debug_String;

import java.util.Scanner;

/**
 * Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.println("Nhập chuỗi b: ");
        String b = sc.nextLine();

        int ketQua = a.compareTo(b);

        if (ketQua == 0) {
            System.out.println("Hai chuỗi giống nhau.");
        } else if (ketQua < 0) {
            System.out.println("Chuỗi a đứng trước chuỗi b trong thứ tự từ điển.");
        } else {
            System.out.println("Chuỗi a đứng sau chuỗi b trong thứ tự từ điển.");
        }
    }
}
