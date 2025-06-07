package daogt;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
 * Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */
public class DaoGiaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;


        System.out.println("Giá trị mới của a: " + a);
        System.out.println("Giá trị mới của b: " + b);
    }
}
