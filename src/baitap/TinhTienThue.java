package baitap;

import java.util.Scanner;

public class TinhTienThue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String ten = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double gia = sc.nextDouble();

        System.out.print("Nhập số lượng sản phẩm: ");
        int sl = sc.nextInt();

        double tien = gia * sl;
        System.out.println("Giá tiền phải trả: "+tien);

        double thue = tien * 0.1;
        System.out.print("Giá Thuế gia tăng: "+thue);
    }
}
