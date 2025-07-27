//package mang_hai_chieu;
//
//import  java.util.Scanner;
//
//public class test {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int rowNumber = inputPossitive("Hàng");
//        int columnNumber = inputPossitive("Cột");
//
//        int[][] arr = new int[rowNumber][columnNumber];
//        nhapMang(arr);
//        xuatMang(arr);
//
//    }
//
//    static int inputPossitive(String target) {
//        int n;
//        do {
//            System.out.printf("Nhap so nguyen duong %s: ", target);
//            n = sc.nextInt();
//
//            if (n < 0) {
//                System.out.printf("Phai nhap so nguyen duong, nhap lai!!!\n", target);
//            }
//        } while (n < 0);
//        return n;
//    }
//
//    private static boolean isAllven(int[][] arr) {
//        for (int[] row : arr) {
//            for (int item : row) {
//                if (item % 2 != 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    static void nhapMang(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhap phan tu arr[%d][%d]: ", i, j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//    }
//
//    static void xuatMang(int[][] arr) {
//        for (int[] row : arr) {
//            for (int item : row) {
//                System.out.print(item + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//    static int max(int[] arr) {
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    static int[] findMaxInrow(int[][] arr) {
//        int[] max = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            max[i] = max(arr[i]);
//        }
//        return max;
//    }
//
//    static int[] hoaDoi(int[][] arr, int row1, int row2) {
//        int[] temp = arr[row1];
//        arr[row1] = arr[row2];
//        arr[row2] = temp;
//    }
//}
