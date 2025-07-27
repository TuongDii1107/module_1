package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Trước đây, chúng ta đã sử dụng mảng một chiều để quản lý thông tin của nhân viên.
 * Trong bài tập này, chúng ta sẽ chuyển sang sử dụng ArrayList - một cấu trúc dữ liệu linh hoạt hơn mảng một chiều.
 */
public class bai2 {

    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> mucLuong = new ArrayList<>();
    static ArrayList<Double> diemTrungBinh = new ArrayList<>();
    static int soLuongNhanVien = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String chon;
        do {
            System.out.println("\n===== MENU QUẢN LÝ NHÂN VIÊN =====");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = scanner.nextLine();

            switch (chon) {
                case "1":
                    nhapThongTin();
                    break;
                case "2":
                    xuatDanhSach();
                    break;
                case "0":
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (!chon.equals("0"));
    }

    // Nhập thông tin nhân viên
    static void nhapThongTin() {
        System.out.print("Nhập vào tên: ");
        hoTen.add(scanner.nextLine());
        System.out.print("Nhập vào tuổi: ");
        tuoi.add(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập vào giới tính: ");
        gioiTinh.add(scanner.nextLine());
        System.out.print("Nhập vào mức lương: ");
        mucLuong.add(Double.parseDouble(scanner.nextLine()));
        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh.add(Double.parseDouble(scanner.nextLine()));

        soLuongNhanVien++;
        System.out.println("Đã thêm nhân viên!");
    }

    // Xuất thông tin 1 nhân viên
    static void xuatThongTin(int i) {
        System.out.println("Tên: " + hoTen.get(i));
        System.out.println("Tuổi: " + tuoi.get(i));
        System.out.println("Giới tính: " + gioiTinh.get(i));
        System.out.println("Mức lương: " + mucLuong.get(i));
        System.out.println("Điểm trung bình: " + diemTrungBinh.get(i));
    }

    // Xuất toàn bộ danh sách
    static void xuatDanhSach() {
        if (soLuongNhanVien == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("\n--- Nhân viên thứ " + (i + 1) + " ---");
            xuatThongTin(i);
        }
    }
}

