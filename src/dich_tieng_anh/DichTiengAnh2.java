package dich_tieng_anh;

import java.util.Scanner;

/* Cách 2: Swith - case
 */
public class DichTiengAnh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số đếm từ 1 đến 10: ");
        int number = sc.nextInt();

        String numberEnglish;

        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Night");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Không hợp lệ");
        }
    }
}
