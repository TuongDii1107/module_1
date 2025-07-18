package Mang;

import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        do {
            System.out.println("Nhập vào số lượng phần tử: ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Số lượng phần tử phải là số dương, vui lòng nhập lại... ");
            }
        } while (n < 0);

        int[] arr = new int[n];

        inputArr(arr);
        outputArr(arr);

        if (isAllEven(arr)){
            System.out.println("Mảng Toàn Chẵn...");
        }else {
            System.out.println("Mảng Khong Toàn Chẵn...");
        }

        System.out.println("Tổng số dương lẻ: " + calculateSumPositiveOdd(arr));

        int x = 2;
        int index = lastIndexOf(arr, x);
        if(index == -1){
            System.out.println("không tìm thấy phần tử x trong mảng...");
        } else {
            System.out.println("x nằm ở vị trí index: "  + index);
        }
    }

    private static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    private static void outputArr(int[] arr) {
        for (int item : arr) { //foreach
            System.out.println(item + "\t");
        }
    }

    public static boolean isAllEven(int[] arr){
        for(int item : arr){
            if (item % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static int calculateSumPositiveOdd(int[] arr){
        int sum = 0;
        for(int item : arr){
            if (item > 0 && item % 2 != 0){
                sum += item;
            }
        }
        return sum;
    }

    public static  int lastIndexOf ( int [] arr, int x){
        for ( int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == x){
                return  i;
            }
        }
        return -1;
    }
}
