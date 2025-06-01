package baitap;

import java.time.Year;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số năm sinh của bạn: ");
        int namSinh = sc.nextInt();

        int tinhtuoi = Year.now().getValue() - namSinh ;
        System.out.println("Số tuoi của bạn là: "+tinhtuoi);
    }
}
