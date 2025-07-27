package Arr_p2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Các thao tác thêm/xóa/sửa
 * a.    Sửa các số nguyên tố có trong mảng thành số 0
 * b.    Chèn số 0 đằng sau các số nguyên tố trong mảng
 * c.    Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
 * d.    Xóa tất cả số nguyên tố có trong mảng
 * e.    Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
 */
public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Phần tử bạn nhập vào không phải là số nguyên. Vuii lòng nhâ lại: ");
            }
        } while (n <= 0);
        int[] arr = new int[n];

        nhapMang(arr);

        System.out.print("Các phần tử của Mảng: ");
        xuatMang(arr);

        System.out.println("\nCâu A:");
        doiSoNT(arr);
        System.out.print("Mảng sau khi đổi: " + Arrays.toString(arr));

        System.out.println("\nCâu B:");
        arr = chenVaoSauSoNT(arr);
        System.out.print("Mảng sau khi chèn: " + Arrays.toString(arr));

        System.out.println("\nCâu C:");
        System.out.println("Nhập phần tử K : ");
        int k = sc.nextInt();
        arr = xoaPhanTu(arr, k);
        System.out.println("Mảng sau khi xóa phần tử: ");

        System.out.println("\nCâu D:");
        arr = xoaTatCaSoNT(arr);
        System.out.print("Mảng sau khi xóa số NT: " + Arrays.toString(arr));

        System.out.println("\n Câu E:");
        System.out.println("Nhập phần ử vào vị trí index: ");
        int index = sc.nextInt();
        System.out.println("Nhập phần tử x: ");
        int x = sc.nextInt();

        arr = chenXoa(arr, index, x);
        System.out.println("Mảng sau khi chèn và xóa: " + Arrays.toString(arr));
    }

    //a. đổi số nguyên tố thành 0
    public static boolean kiemTraSoNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void doiSoNT(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraSoNT(arr[i])) {
                arr[i] = 0;
            }
        }
    }

    public static int[] chenVaoSauSoNT(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraSoNT(arr[i])) {
                arr = add(arr, i + 1, 0);
                i++;
            }
        }
        return arr;
    }

    public static int[] add(int[] arr, int index, int value) {
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }
        brr[index] = value;
        for (int i = 0; i < index; i++) {
            brr[i + 1] = arr[i];
        }
        return brr;
    }

    public static int[] xoa(int[] arr, int index) {
        int[] brr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1; i++) {
            brr[i] = arr[i + 1];
        }
        return brr;
    }

    public static int[] xoaPhanTu(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr = xoa(arr, i);
                i--;
            }
        }
        return arr;
    }

    public static int[] xoaTatCaSoNT(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraSoNT(arr[i])) {
                arr = xoa(arr, i);
                i--;
            }
        }
        return arr;
    }

    public static int[] chenXoa(int[] arr, int index, int x) {
        arr = add(arr, index, x);
        arr = xoa(arr, arr.length - 1);
        return arr;
    }

    public static void nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");

        }
    }

}
