package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
 * b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …
 * c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …
 */
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Câu A: ");
        int n;
        int reversed = 0;
        int original;

        System.out.print("nhập số nguyên dương n (n > 0): ");
        n = sc.nextInt();

        original = n;

        while (n != 0) {
            int digit = n % 10; //lấy chữ số cuối cùng
            reversed = reversed * 10 + digit;// Thêm chữ số vào số đảo ngược
            n /= 10;// Bỏ chữ số cuối vừa xử lý

        }

        if (reversed == original) {
            System.out.println(original + " là số đối xứng!!");
        } else {
            System.out.println(original + " không phải là số đối xứng!!");
        }
//#-------------------------------------------------------------------------------------
        System.out.println("Câu B: ");
        System.out.print("Nhập số nguyên dương m: ");
        int m = sc.nextInt();

        boolean isFlag = true;

        if (m < 2) {
            isFlag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    isFlag = false;
                    break;
                }
            }
        }

        if (isFlag) {
            System.out.println(m + " là số nguyên tố.");
        } else {
            System.out.println(m + " không phải là số nguyên tố.");
        }
//#-------------------------------------------------------------------------------------
        System.out.println("Câu C: ");
        System.out.print("Nhập số nguyên dương n: ");
        int h = sc.nextInt();

        String str = Integer.toString(h);

        boolean laTangDan = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                laTangDan = false;
                break;
            }
        }

        if (laTangDan) {
            System.out.println(h + " có các chữ số tăng dần.");
        } else {
            System.out.println(h + " không có các chữ số tăng dần.");
        }
    }
}
