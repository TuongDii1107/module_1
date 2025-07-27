package Mang;

import java.util.Scanner;

/**
 * Sử dụng các mảng 1 chiều để xử lý bài nhập thông tin cho n nhân viên ở bài trước.
 * <p>
 * Gợi ý: Mỗi thông tin (ví dụ họ tên) sẽ được lưu ở 1 mảng riêng. Thông tin của 1 nhân viên được xác định bằng vị trí của nhân viên đó trong các mảng.
 * <p>
 * Vd: hoTen[1], gioiTinh[1]… sẽ chứa thông tin của nhân viên thứ 2 (vì mảng bắt đầu bằng chỉ số 0).
 * <p>
 * Tương tự, hoTen[n], gioiTinh[k]… sẽ chứa thông tin của nhân viên thứ k+1. (*)
 */
public class Bai2_SQC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {
            try {
                System.out.print("Nhập số lượng nhân viên: ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Số lượng phải > 0. Vui Lòng Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số nguyên. Vui Lòng Nhập lại.");
            }
        }

        String[] hoTen = new String[n];
        int[] tuoi = new int[n];
        String[] gioiTinh = new String[n];
        double[] luongCoBan = new double[n];
        double[] diemTB = new double[n];

        for (int i = 0; i < n; i++) {
            nhapThongTin(sc, i, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        }

        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
        for (int i = 0; i < n; i++) {
            xuatThongTin(i, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        }
    }

    public static void nhapThongTin(Scanner sc, int index, String[] hoTen, int[] tuoi,
                                    String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        System.out.println("\nNhập thông tin cho nhân viên thứ " + (index + 1));

        do {
            System.out.print("Họ tên: ");
            hoTen[index] = sc.nextLine();
            if (hoTen[index].trim().isEmpty()) {
                System.out.println("Họ tên không được để trống!");
            }
        } while (hoTen[index].trim().isEmpty());

        while (true) {
            try {
                System.out.print("Tuổi (>= 18): ");
                tuoi[index] = Integer.parseInt(sc.nextLine());
                if (tuoi[index] < 18) {
                    System.out.println("Tuổi phải >= 18. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tuổi phải là số nguyên. Nhập lại.");
            }
        }

        do {
            System.out.print("Giới tính (Nam/Nữ): ");
            gioiTinh[index] = sc.nextLine();
            if (!(gioiTinh[index].equalsIgnoreCase("Nam") || gioiTinh[index].equalsIgnoreCase("Nữ"))) {
                System.out.println("Chỉ được nhập 'Nam' hoặc 'Nữ'.");
            }
        } while (!(gioiTinh[index].equalsIgnoreCase("Nam") || gioiTinh[index].equalsIgnoreCase("Nữ")));

        while (true) {
            try {
                System.out.print("Lương cơ bản (> 0): ");
                luongCoBan[index] = Double.parseDouble(sc.nextLine());
                if (luongCoBan[index] <= 0) {
                    System.out.println("Lương phải lớn hơn 0. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lương phải là số. Nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Điểm TB tốt nghiệp (0 - 10): ");
                diemTB[index] = Double.parseDouble(sc.nextLine());
                if (diemTB[index] < 0 || diemTB[index] > 10) {
                    System.out.println("Điểm phải từ 0 đến 10. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là số. Nhập lại.");
            }
        }
    }

    public static void xuatThongTin(int index, String[] hoTen, int[] tuoi, String[] gioiTinh,
                                    double[] luongCoBan, double[] diemTB) {
        System.out.println("\nNhân viên " + (index + 1));
        System.out.println("Họ tên      : " + hoTen[index]);
        System.out.println("Tuổi        : " + tuoi[index]);
        System.out.println("Giới tính   : " + gioiTinh[index]);
        System.out.println("Lương cơ bản: " + luongCoBan[index]);
        System.out.println("Điểm TB     : " + diemTB[index]);
    }
}
