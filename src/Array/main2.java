package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn nhập sai, vui lòng nhập lại.");
            }
        } while (n <= 0);

        ArrayList<Integer> arrayList = new ArrayList<>();
        inputArr(arrayList, n);
        System.out.println("Mảng vừa nhập: " + arrayList);
    }

    public static void inputArr(ArrayList<Integer> arrayList, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i);
            arrayList.add(sc.nextInt());
        }
    }
    private static boolean isAllEven(ArrayList<Integer> arrayList){
        for(int item : arrayList){
            if(item % 2 != 0){
                return false;
            }
        }
        return true;
    }


    private static int totalLe(ArrayList<Integer> arrayList){
        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) > 0 && arrayList.get(i) != 0){
                sum += arrayList.get(i);
            }
        }
        return sum;
    }
}
