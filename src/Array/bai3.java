package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Dựa vào ArrayList đã được tạo từ bài trước, hãy tiến hành thực hiện các yêu cầu sau:
 * <p>
 * a. Tìm nhân viên có điểm trung bình cao nhất, cao nhì.
 * <p>
 * b. Tìm nhân viên theo họ tên.
 * <p>
 * c. Sắp xếp nhân viên theo độ tuổi tăng dần.
 */
public class bai3 {
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
            System.out.println("3. Tìm nhân viên có điểm trung bình cao nhất & cao nhì");
            System.out.println("4. Tìm nhân viên theo họ tên");
            System.out.println("5. Sắp xếp nhân viên theo độ tuổi tăng dần");
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
                case "3":
                    timDiemCaoNhatVaNhi();
                    break;
                case "4":
                    timTheoTen();
                    break;
                case "5":
                    sapXepTheoTuoi();
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

    // a. Tìm nhân viên có điểm trung bình cao nhất & cao nhì
    static void timDiemCaoNhatVaNhi() {
        if (soLuongNhanVien < 2) {
            System.out.println("Cần ít nhất 2 nhân viên để thực hiện!");
            return;
        }
        ArrayList<Double> cloneDiem = new ArrayList<>(diemTrungBinh);
        Collections.sort(cloneDiem, Collections.reverseOrder());
        double max1 = cloneDiem.get(0);
        double max2 = cloneDiem.get(1);
        System.out.println("\n--- Nhân viên có điểm cao nhất ---");
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (diemTrungBinh.get(i) == max1) xuatThongTin(i);
        }
        System.out.println("\n--- Nhân viên có điểm cao nhì ---");
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (diemTrungBinh.get(i) == max2) xuatThongTin(i);
        }
    }

    // b. Tìm nhân viên theo họ tên
    static void timTheoTen() {
        System.out.print("Nhập tên cần tìm: ");
        String ten = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (hoTen.get(i).toLowerCase().contains(ten.toLowerCase())) {
                System.out.println("\n--- Kết quả tìm thấy ---");
                xuatThongTin(i);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy nhân viên nào!");
    }

    // c. Sắp xếp nhân viên theo độ tuổi tăng dần
    static void sapXepTheoTuoi() {
        for (int i = 0; i < soLuongNhanVien - 1; i++) {
            for (int j = i + 1; j < soLuongNhanVien; j++) {
                if (tuoi.get(i) > tuoi.get(j)) {
                    // Hoán đổi đồng bộ cả 5 danh sách
                    Collections.swap(tuoi, i, j);
                    Collections.swap(hoTen, i, j);
                    Collections.swap(gioiTinh, i, j);
                    Collections.swap(mucLuong, i, j);
                    Collections.swap(diemTrungBinh, i, j);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo tuổi tăng dần!");
    }
}
