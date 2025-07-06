package phuong_thuc;
import java.util.Scanner;
/**
 * Viết chương trình nhập thông tin của một nhân viên trong công ty.
 * Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính, mức lương cơ bản,
 * điểm trung bình tốt nghiệp đại học (theo thang điểm 10).
 * Sau khi nhập xong thì in thông tin đã nhập ra.
 */
public class Bai6 {

    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double luongCoBan;
    static double diemTB;

    public static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        luongCoBan = sc.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp (thang điểm 10): ");
        diemTB = sc.nextDouble();
    }

    public static void inThongTin() {
        System.out.println("\n--- Thông tin nhân viên ---");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTB);
    }

    public static void main(String[] args) {
        nhapThongTin();
        inThongTin();
    }
}
