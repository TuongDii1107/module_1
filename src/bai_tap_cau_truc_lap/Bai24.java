package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Hệ thống tiền Việt Nam có các mệnh giá sau:
 * 1000đ
 * 2000đ
 * 5000đ
 * 10000đ
 * 20000đ
 * 50000đ
 * 100000đ
 * 200000đ
 * 500000đ
 * Người mua hàng phải trả tiền cho sản phẩm mà họ đã mua.
 * Hãy nhập vào giá tiền của món đồ và tiền khách hàng  trả,
 * viết chươngtrình hỗ trợ nhân viên cửa hàng thối tiền lại cho khách hàng
 * sao cho số tờ tiền phải thối lại là ít nhất.
 */
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá tiền món đồ khách mua: ");
        int giaTien = sc.nextInt();

        System.out.print("Nhập số tiền khách trả: ");
        int tienKhachTra = sc.nextInt();

        int tienThoi = tienKhachTra - giaTien;

        if (tienThoi < 0) {
            System.out.println("Khách trả chưa đủ tiền.");
            return;
        } else if (tienThoi == 0) {
            System.out.println("Khách đã trả đủ, không cần thối.");
            return;
        }

        System.out.println("Cần thối lại: " + tienThoi + "đ");

        int soTo;

        if (tienThoi >= 500000) {
            soTo = tienThoi / 500000;
            System.out.println(soTo + " tờ 500000đ");
            tienThoi %= 500000;
        }

        if (tienThoi >= 200000) {
            soTo = tienThoi / 200000;
            System.out.println(soTo + " tờ 200000đ");
            tienThoi %= 200000;
        }

        if (tienThoi >= 100000) {
            soTo = tienThoi / 100000;
            System.out.println(soTo + " tờ 100000đ");
            tienThoi %= 100000;
        }

        if (tienThoi >= 50000) {
            soTo = tienThoi / 50000;
            System.out.println(soTo + " tờ 50000đ");
            tienThoi %= 50000;
        }

        if (tienThoi >= 20000) {
            soTo = tienThoi / 20000;
            System.out.println(soTo + " tờ 20000đ");
            tienThoi %= 20000;
        }

        if (tienThoi >= 10000) {
            soTo = tienThoi / 10000;
            System.out.println(soTo + " tờ 10000đ");
            tienThoi %= 10000;
        }

        if (tienThoi >= 5000) {
            soTo = tienThoi / 5000;
            System.out.println(soTo + " tờ 5000đ");
            tienThoi %= 5000;
        }

        if (tienThoi >= 2000) {
            soTo = tienThoi / 2000;
            System.out.println(soTo + " tờ 2000đ");
            tienThoi %= 2000;
        }

        if (tienThoi >= 1000) {
            soTo = tienThoi / 1000;
            System.out.println(soTo + " tờ 1000đ");
            tienThoi %= 1000;
        }
    }
}
