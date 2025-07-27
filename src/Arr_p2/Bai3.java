package Arr_p2;

import java.util.Scanner;

/**
 * Sử dụng các mảng 1 chiều để bổ sung xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 * Sắp xếp nhân viên theo độ tuổi tăng dần. (*)
 */
public class Bai3 {
    public static String[] hoTen = new String[5];
    public static int[] tuoi = new int[5];
    public static String[] gioiTinh = new String[5];
    public static double[] mucLuong = new double[5];
    public static double[] diemTrungBinh = new double[5];
    public static int soLuongNhanVien = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chon;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Sắp xếp theo tuổi tăng dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextLine();

            switch (chon) {
                case "1":
                    nhapThongTin(sc);
                    break;
                case "2":
                    xuatDanhSach();
                    break;
                case "3":
                    sapXepTheoTuoi(hoTen, tuoi, gioiTinh, mucLuong, diemTrungBinh);
                    System.out.println("Đã sắp xếp theo tuổi tăng dần!");
                    break;
                case "0":
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ!");
            }
        } while (!chon.equals("0"));
    }

    // Nhập thông tin nhân viên
    public static void nhapThongTin(Scanner sc) {
        if (soLuongNhanVien >= hoTen.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }
        System.out.println("\nNhập thông tin nhân viên thứ " + (soLuongNhanVien + 1));
        System.out.print("Họ tên: ");
        hoTen[soLuongNhanVien] = sc.nextLine();

        while (true) {
            try {
                System.out.print("Tuổi: ");
                tuoi[soLuongNhanVien] = Integer.parseInt(sc.nextLine());
                if (tuoi[soLuongNhanVien] < 18) {
                    System.out.println("Tuổi phải >= 18!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!");
            }
        }

        System.out.print("Giới tính (Nam/Nữ): ");
        gioiTinh[soLuongNhanVien] = sc.nextLine();

        while (true) {
            try {
                System.out.print("Mức lương: ");
                mucLuong[soLuongNhanVien] = Double.parseDouble(sc.nextLine());
                if (mucLuong[soLuongNhanVien] <= 0) {
                    System.out.println("Lương phải > 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!");
            }
        }

        while (true) {
            try {
                System.out.print("Điểm trung bình (0-10): ");
                diemTrungBinh[soLuongNhanVien] = Double.parseDouble(sc.nextLine());
                if (diemTrungBinh[soLuongNhanVien] < 0 || diemTrungBinh[soLuongNhanVien] > 10) {
                    System.out.println("Điểm phải từ 0-10!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!");
            }
        }

        soLuongNhanVien++;
        System.out.println("Đã thêm nhân viên!");
    }

    // Xuất danh sách
    public static void xuatDanhSach() {
        if (soLuongNhanVien == 0) {
            System.out.println("Chưa có nhân viên nào!");
            return;
        }
        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("\nNhân viên " + (i + 1));
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Tuổi: " + tuoi[i]);
            System.out.println("Giới tính: " + gioiTinh[i]);
            System.out.println("Lương: " + mucLuong[i]);
            System.out.println("Điểm TB: " + diemTrungBinh[i]);
        }
    }

    // Sắp xếp theo tuổi tăng dần
    public static void sapXepTheoTuoi(String[] hoTen, int[] tuoi, String[] gioiTinh,
                                      double[] luongCoBan, double[] diemTB) {
        for (int i = 0; i < soLuongNhanVien - 1; i++) {
            for (int j = i + 1; j < soLuongNhanVien; j++) {
                if (tuoi[i] > tuoi[j]) {
                    // Hoán đổi tuổi
                    int tempTuoi = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tempTuoi;

                    // Hoán đổi họ tên
                    String tempTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempTen;

                    // Hoán đổi giới tính
                    String tempGT = gioiTinh[i];
                    gioiTinh[i] = gioiTinh[j];
                    gioiTinh[j] = tempGT;

                    // Hoán đổi lương
                    double tempLuong = luongCoBan[i];
                    luongCoBan[i] = luongCoBan[j];
                    luongCoBan[j] = tempLuong;

                    // Hoán đổi điểm
                    double tempDiem = diemTB[i];
                    diemTB[i] = diemTB[j];
                    diemTB[j] = tempDiem;
                }
            }
        }
    }
}
