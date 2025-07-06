package phuong_thuc;

import java.util.Scanner;

public class Bai5 {

    public static void Fibonacci(int n){
        int f1 = 0;
        int f2 = 1;
        int fn   = 1;

        for ( int i = 0; i <= n; i++){
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        Fibonacci(n);
    }
}
