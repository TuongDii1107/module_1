package baithi;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi ký tự: ");
        String chuoi = sc.nextLine();

        int soChuHoa = demChuHoa(chuoi);
        if (soChuHoa > 0) {
            System.out.print("Số ký tự in hoa trong chuỗi: " + soChuHoa);
        } else {
            System.out.print("Chuỗi không chứa ký tự in hoa.");
        }
    }

    public static int demChuHoa(String s) {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            char kt = s.charAt(i);
            if (kt >= 'A' && kt <= 'Z') {
                dem++;
            }
        }
        return dem;
    }
}
