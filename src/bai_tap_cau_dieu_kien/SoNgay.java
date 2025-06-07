package bai_tap_cau_dieu_kien;
import java.util.Scanner;

/**
 * Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 */
public class SoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng (1-12): ");
        int thang = sc.nextInt();

        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        int soNgay;

        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            soNgay = 30;
        } else if (thang == 2) {//tinh nam co nhuan hay khong
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                soNgay = 29;
            } else {
                soNgay = 28;
            }
        } else {
            soNgay = 31;
        }
        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
        sc.close();
    }
}

