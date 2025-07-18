package Mang;

import java.util.Scanner;

/**
 * Dựa trên chương trình quản lý nhân viên ở bài trước, thực hiện các yêu cầu sau:
 * <p>
 * a. Tìm nhân viên có điểm trung bình cao nhất.
 * <p>
 * b. Tìm nhân viên theo họ tên (tìm chính xác).
 * <p>
 * c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)
 * <p>
 * Ví dụ: Khi nhập một phần của họ tên (ví dụ: "Hoàng"),
 * hệ thống sẽ xuất ra tất cả các nhân viên có chữ "Hoàng" xuất hiện trong họ tên của họ (ví dụ: "Nguyễn Văn Hoàng", "Hoàng Văn Thái", ...).
 */
public class Bai3_SQC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {
            try {
                System.out.print("Nhập số lượng nhân viên: ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Số lượng phải > 0. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số nguyên. Nhập lại.");
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

        System.out.println("\n--- a. Nhân viên có điểm trung bình cao nhất ---");
        timDiemTBCaoNhat(hoTen, tuoi, gioiTinh, luongCoBan, diemTB);

        System.out.println("\n--- b. Tìm nhân viên theo họ tên (chính xác) ---");
        System.out.print("Nhập họ tên cần tìm: ");
        String tenChinhXac = sc.nextLine();
        timTheoTenChinhXac(tenChinhXac, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);

        System.out.println("\n--- c. Tìm nhân viên theo từ khóa tên (gần đúng) ---");
        System.out.print("Nhập từ khóa tìm kiếm: ");
        String tuKhoa = sc.nextLine();
        timTheoTuKhoa(tuKhoa, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
    }

    public static void nhapThongTin(Scanner sc, int index, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
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
                    System.out.println("Tuổi phải >= 18. Nhập lại.");
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

    public static void xuatThongTin(int index, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        System.out.println("\nNhân viên " + (index + 1));
        System.out.println("Họ tên      : " + hoTen[index]);
        System.out.println("Tuổi        : " + tuoi[index]);
        System.out.println("Giới tính   : " + gioiTinh[index]);
        System.out.println("Lương cơ bản: " + luongCoBan[index]);
        System.out.println("Điểm TB     : " + diemTB[index]);
    }

    /*
    a. Tìm nhân viên có điểm trung bình cao nhất.
     */
    public static void timDiemTBCaoNhat(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        double max = diemTB[0];
        for (int i = 1; i < diemTB.length; i++) {
            if (diemTB[i] > max) {
                max = diemTB[i];
            }
        }
        System.out.println("Điểm TB cao nhất: " + max);
        for (int i = 0; i < diemTB.length; i++) {
            if (diemTB[i] == max) {
                xuatThongTin(i, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
            }
        }
    }

    /*
      b. Tìm nhân viên theo họ tên (tìm chính xác).
     */
    public static void timTheoTenChinhXac(String tenCanTim, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        boolean timThay = false;
        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].equalsIgnoreCase(tenCanTim)) {
                xuatThongTin(i, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy nhân viên nào có họ tên: " + tenCanTim);
        }
    }

    /*
        c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)
     */
    public static void timTheoTuKhoa(String tuKhoa, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        boolean timThay = false;
        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].toLowerCase().contains(tuKhoa.toLowerCase())) {
                xuatThongTin(i, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không có nhân viên nào chứa từ khóa: " + tuKhoa);
        }
    }
}
