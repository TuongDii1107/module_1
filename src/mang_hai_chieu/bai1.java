package mang_hai_chieu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Viết chương trình thực hiện công việc sau:
 * a. Nhập/Xuất ma trận A (n dòng, n cột) gồm các phần tử kiểu int.
 * b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
 * c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
 * d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
 * e. Tìm số lớn nhất trên đường chéo chính của ma trận.
 * f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
 * g. Đếm số lượng số nguyên tố trong ma trận.
 * h. Hoán đổi 2 dòng của ma trận
 * i. Hoán đổi 2 cột của ma trận
 */
public class bai1 {
    public static void main(String[] args) {
        int soDong;
        int soCot;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng: ");
        soDong = sc.nextInt();
        System.out.print("Nhập vào số cột của mảng: ");
        soCot = sc.nextInt();

        int[][] A = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + " , " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        outputArray(A);

        System.out.println("Tích các bội số của 3 nằm trên dòng đầu tiên: " + boiSoCuaBa(A));
        System.out.println("Giá trị lớn nhất trên từng dòng: " + Arrays.toString(maxMoiDong(A)));
        System.out.println("Tổng bội số của 5 ở hàng cuối cùng: " + tongBo5HangCuoi(A));
        System.out.println("Số lớn nhất trên đường chéo chính: " + maxCheoChinh(A));
        System.out.println("Số nhỏ nhất trên đường chéo phụ: " + minCheoPhu(A));
        System.out.println("Số lượng số nguyên tố: " + demNguyenTo(A));

        System.out.println("===== Hoán đổi 2 dòng =====");
        System.out.print("Nhập vào dòng 1: ");
        int dong1 = sc.nextInt();
        System.out.print("Nhập vào dòng 2: ");
        int dong2 = sc.nextInt();
        hoanDoiDong(A, dong1, dong2);
        outputArray(A);

        System.out.println("===== Hoán đổi 2 cột =====");
        System.out.print("Nhập vào cột 1: ");
        int cot1 = sc.nextInt();
        System.out.print("Nhập vào cột 2: ");
        int cot2 = sc.nextInt();
        hoanDoiCot(A, cot1, cot2);
        outputArray(A);
    }

    static void outputArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int boiSoCuaBa(int[][] arr) {
        int tich = 1;
        boolean coBoiSo = false;
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] % 3 == 0) {
                tich = tich * arr[0][j];
                coBoiSo = true;
            }
        }
        if (coBoiSo) {
            return tich;
        } else {
            return 0;
        }
    }

    static int[] maxMoiDong(int[][] a) {
        int[] X = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max) max = a[i][j];
            }
            X[i] = max;
        }
        return X;
    }

    static int tongBo5HangCuoi(int[][] a) {
        int tong = 0;
        int n = a.length;
        for (int x : a[n - 1]) {
            if (x % 5 == 0) {
                tong += x;
            }
        }
        return tong;
    }

    static int maxCheoChinh(int[][] a) {
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > max) max = a[i][i];
        }
        return max;
    }

    static int minCheoPhu(int[][] a) {
        int min = a[0][a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i][a.length - 1 - i] < min) {
                min = a[i][a.length - 1 - i];
            }
        }
        return min;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int demNguyenTo(int[][] a) {
        int count = 0;
        for (int[] hang : a) {
            for (int x : hang) {
                if (isPrime(x)) count++;
            }
        }
        return count;
    }

    static void hoanDoiDong(int[][] a, int d1, int d2) {
        int[] temp = a[d1];
        a[d1] = a[d2];
        a[d2] = temp;
    }

    static void hoanDoiCot(int[][] a, int c1, int c2) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i][c1];
            a[i][c1] = a[i][c2];
            a[i][c2] = temp;
        }
    }
}
