package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * Nhập 2 số nguyên dương a và b.
 * Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        //Tìm UCLN
        int UCLN = 1;
        for ( int i = a; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                UCLN = i;
                break;
            }
        }
        //Tìm BCNN
        int bcnn;
        for ( int i = a; true; i++){
            if(i % a == 0 && i % b == 0){
                bcnn =i;
                break;
            }
        }
        System.out.println("Ước chung lớn nhất của " + a + "và" + b + "là: "+ UCLN);
        System.out.println("Bội chung nhỏ nhất của " + a + "và" + b + "là: "+ bcnn);
    }
}
