package baithi;

import java.util.Scanner;

/**
 * Câu 2: Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20).
 * Hiển thị ra màn hình hiệu của Tổng các số chẵn và Tổng các số lẻ có trong mảng.
 * <p>
 * Ví dụ: [1,2,3,4,5,6]. Kết quả sau khi thực hiện là: (2+4+6) - (1+3+5) = 3
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        System.out.print("Nhập vào mảng số nguyên n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int tongLe = 0;
        int tongChan = 0;

        for (int i = 0; i <= n; i++) {
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }
        int hieu = tongChan - tongLe;

        System.out.println("Kết Quả: " + hieu);


    }
}
