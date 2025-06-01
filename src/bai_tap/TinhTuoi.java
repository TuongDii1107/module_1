/**
 * Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
 * a. tiền = số lượng * đơn giá
 * b. thuế giá trị gia tăng = 10%
 */
package bai_tap;

import java.time.Year;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số năm sinh của bạn: ");
        int namSinh = sc.nextInt();

        int tinhTuoi = Year.now().getValue() - namSinh;
        System.out.println("Số tuoi của bạn là: " + tinhTuoi);
    }
}
