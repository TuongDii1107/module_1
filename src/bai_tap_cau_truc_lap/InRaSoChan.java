package bai_tap_cau_truc_lap;

import java.util.Scanner;

/**
 * 3. (*) In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ
 */
public class InRaSoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if(i % 4 == 0){
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
