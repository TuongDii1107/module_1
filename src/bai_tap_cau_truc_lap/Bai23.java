package bai_tap_cau_truc_lap;

/**
 * Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99
 * sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó. Ví dụ: Số 44
 */
public class Bai23 {
    public static void main(String[] args) {
        System.out.println("Các số thỏa mãn điều kiện:");

        for (int i = 10; i <= 99; i++) {
            int hangChuc = i / 10;//lấy chữ số hàng chục
            int hangDonVi = i % 10;// lấy chữ số hàng đơn vị

            int tong = hangChuc + hangDonVi;
            int tich = hangChuc * hangDonVi;

            if (tich == 2 * tong) {
                System.out.println(i);
            }
        }
    }
}
