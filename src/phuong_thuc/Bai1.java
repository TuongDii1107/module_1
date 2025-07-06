package phuong_thuc;

import java.util.Scanner;

/**
 * Bài tập chương câu lệnh điều kiện và rẽ nhánh
 * a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
 * b.    Viết phương thức giải phương trình bậc nhất.
 * c.    Viết phương thức giải phương trình bậc hai.
 * d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.
 */
public class Bai1 {
    public static char toLowerCase(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

    /* ---------------------------------------------------------- */
    public static void levelOne(double a, double b) {
        if (a == 0 && b != 0) {
            System.out.print("Phương trình vô nghiệm...");
        } else if (a == 0 && b == 0) {
            System.out.print("Phương trình có vô số nghiệm...");
        } else {
            double x = -b / a;
            System.out.print("Phương trình có một nghiệm suy nhất: " + x);
        }
    }

    /* ---------------------------------------------------------- */
    public static void levelTwo(double a1, double b1, double c1) {
        if (a1 == 0) {
            System.out.println("Phương trình bậc nhất:");
            levelOne(b1, c1);
        } else {
            double delta = (b1 * b1) - 4 * a1 * c1;

            if (delta > 0) {
                double x1 = (-b1 + Math.sqrt(delta)) / (2 * a1);
                double x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b1 / (2 * a1);
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
    /* ---------------------------------------------------------- */
    public static int min(int a2, int b2, int c2, int d2) {
        int min = a2;
        if (b2 < min) min = b2;
        if (c2 < min) min = c2;
        if (d2 < min) min = d2;
        return min;
    }

    /* ---------------------------------------------------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Câu a: ");

        System.out.print("Nhập kí tự Hoa: ");
        char ch = sc.next().charAt(0);

        char Lower = toLowerCase(ch);
        System.out.print("Kết quả: " + Lower);

        System.out.println("\nCâu b: ");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        levelOne(a, b);

        System.out.println("\nCâu c: ");
        System.out.println("Nhập a: ");
        double a1 = sc.nextDouble();

        System.out.println("Nhập b: ");
        double b1 = sc.nextDouble();

        System.out.println("Nhập c: ");
        double c1 = sc.nextDouble();

        levelTwo(a1, b1, c1);

        System.out.println("\nCâu d: ");
        System.out.print("Nhập 4 số nguyên: ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();

        int minimum = min(a2, b2, c2, d2);
        System.out.println("Giá trị nhỏ nhất là: " + minimum);
    }
}
