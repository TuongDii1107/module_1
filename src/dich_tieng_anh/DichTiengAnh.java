
package dich_tieng_anh;

import java.util.Scanner;

/**
 * Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó
 * Cách 1: if - else
 */
public class DichTiengAnh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số đếm từ 1 đến 10: ");
        int number = sc.nextInt();

        String numberEnglish;

        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else if (number == 10) {
            System.out.println("Ten");
        } else {
            System.out.println("Ngoài vùng từ 1 đến 10 ");
        }
    }
}
