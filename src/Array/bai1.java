package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Nhập ArrayList
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Bạn cần nhập vào số nguyên dương!");
            }
        } while (n <= 0);

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            a.add(scanner.nextInt());
        }

        // b. In các phần tử
        System.out.println("Các phần tử trong danh sách: " + a);

        // c. Đếm số lượng phần tử lẻ
        System.out.println("Số lượng phần tử lẻ: " + demSoLe(a));

        // d. Tính tổng số dương lẻ
        System.out.println("Tổng các số dương lẻ: " + tinhTongSoDuongLe(a));

        // e. Nhập k và tìm vị trí xuất hiện
        System.out.print("Nhập vào giá trị k cần tìm: ");
        int k = scanner.nextInt();
        ArrayList<Integer> viTri = cacViTriXuatHienK(a, k);
        if (viTri.isEmpty()) {
            System.out.println(k + " không xuất hiện trong danh sách.");
        } else {
            System.out.println(k + " xuất hiện tại các vị trí: " + viTri);
        }

        // f. Sắp xếp tăng dần
        Collections.sort(a);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + a);

        // g. Đảo ngược danh sách
        Collections.reverse(a);
        System.out.println("Danh sách sau khi đảo ngược: " + a);

        // h. Xóa phần tử có giá trị x
        System.out.print("Nhập giá trị x cần xóa: ");
        int x = scanner.nextInt();
        a.removeAll(Collections.singleton(x));
        System.out.println("Danh sách sau khi xóa " + x + ": " + a);

        // i. Chèn 1 phần tử vào vị trí index (xóa phần tử cuối)
        System.out.print("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (0 - " + (a.size() - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < a.size()) {
            a.add(index, value);
            a.remove(a.size() - 1);
        }
        System.out.println("Danh sách sau khi chèn: " + a);

        // j. Tìm max và min
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);

        // k. Tìm giá trị lớn nhì
        int secondMax = timSoLonNhi(a);
        System.out.println("Giá trị lớn nhì: " + secondMax);

        scanner.close();
    }

    // c. Đếm số lượng phần tử lẻ
    public static int demSoLe(ArrayList<Integer> a) {
        int count = 0;
        for (int item : a) {
            if (item % 2 != 0) count++;
        }
        return count;
    }

    // d. Tính tổng số dương lẻ
    public static int tinhTongSoDuongLe(ArrayList<Integer> a) {
        int total = 0;
        for (int item : a) {
            if (item > 0 && item % 2 != 0) {
                total += item;
            }
        }
        return total;
    }

    // e. Tìm vị trí xuất hiện k
    public static ArrayList<Integer> cacViTriXuatHienK(ArrayList<Integer> a, int k) {
        ArrayList<Integer> viTri = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                viTri.add(i);
            }
        }
        return viTri;
    }

    // k. Tìm số lớn nhì
    public static int timSoLonNhi(ArrayList<Integer> a) {
        ArrayList<Integer> temp = new ArrayList<>(a);
        Collections.sort(temp);
        Collections.reverse(temp);
        int max = temp.get(0);
        for (int num : temp) {
            if (num < max) {
                return num;
            }
        }
        return max; // nếu tất cả bằng nhau thì trả về max
    }
}
