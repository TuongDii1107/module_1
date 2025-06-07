package bai_tap_cau_dieu_kien;

import java.util.Scanner;

public class KiemTraNgayKeTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập vào ngày, tháng, năm
        System.out.print("Nhập ngày: ");
        int ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();
        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        int maxNgay = 31;

        if (thang < 1 || thang > 12 || nam < 1) {
            System.out.println("Ngày không hợp lệ.");
            return;
        }

        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            maxNgay = 30;
        } else if (thang == 2) {
            // Kiểm tra năm nhuận
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                maxNgay = 29;
            } else {
                maxNgay = 28;
            }
        }

        if (ngay < 1 || ngay > maxNgay) {
            System.out.println("Ngày không hợp lệ.");
            return;
        }

        int ngaySau = ngay + 1;
        int thangSau = thang;
        int namSau = nam;

        if (ngaySau > maxNgay) {
            ngaySau = 1;
            thangSau++;
            if (thangSau > 12) {
                thangSau = 1;
                namSau++;
            }
        }

        int ngayTruoc = ngay - 1;
        int thangTruoc = thang;
        int namTruoc = nam;

        if (ngayTruoc < 1) {
            thangTruoc--;
            if (thangTruoc < 1) {
                thangTruoc = 12;
                namTruoc--;
            }

            if (thangTruoc == 4 || thangTruoc == 6 || thangTruoc == 9 || thangTruoc == 11) {
                ngayTruoc = 30;
            } else if (thangTruoc == 2) {
                if ((namTruoc % 4 == 0 && namTruoc % 100 != 0) || (namTruoc % 400 == 0)) {
                    ngayTruoc = 29;
                } else {
                    ngayTruoc = 28;
                }
            } else {
                ngayTruoc = 31;
            }
        }

        System.out.println("Ngày trước đó: " + ngayTruoc + "/" + thangTruoc + "/" + namTruoc);
        System.out.println("Ngày kế tiếp: " + ngaySau + "/" + thangSau + "/" + namSau);

        sc.close();
    }
}
