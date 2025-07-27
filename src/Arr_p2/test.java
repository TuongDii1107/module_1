package Arr_p2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 100, 30, 40, 100, 15};

//        int x = 100;
       // int index = 2;
        int value = 100;
//
//        arr = addIndex(arr, index, x);
        arr = removevalue(arr, value);

        System.out.println(Arrays.toString(arr));
    }

    //private static int[] add(int[] arr, int x) {
    //  b1: tạo vùng nhớ mới = vùng nhớ cũ + 1
    //    int[] brr = new int[arr.length + 1];

    // b2 : copy giá trị vùng nhớ cũ qua vùng nhớ mới
    //for (int i = 0; i < arr.length; i++) {
    //  brr[i] = arr[i];
    //}
    //   System.arraycopy(arr, 0, brr, 0, arr.length);

    // bước 3: gán phần tử muốn thêm vào mảng
    //   brr[arr.length] = x;

    // bước 4: cho biến mảng ban đầu vào mảng mới
    //  return brr;
//    private static int[] addIndex(int[] arr, int index, int x) {
//        //  b1: tạo vùng nhớ mới = vùng nhớ cũ + 1
//        int[] brr = new int[arr.length + 1];
//
//        // b2 : copy giá trị vùng nhớ cũ qua vùng nhớ mới
//        // trước index:
//        for (int i = 0; i < index; i++) {
//            brr[i] = arr[i];
//        }
//        // sau index:
//        for (int i = index; i < arr.length; i++) {
//            brr[i + 1] = arr[i];
//        }
//
//        // bước 3: gán phần tử muốn thêm vào mảng
//        brr[index] = x;
//
//        // bước 4: cho biến mảng ban đầu vào mảng mới
//        return brr;
//    }
    public static int[] remove(int[] arr, int index) {
        //  b1: tạo vùng nhớ mới = vùng nhớ cũ + 1
        int[] brr = new int[arr.length - 1];

        // b2 : copy giá trị vùng nhớ cũ qua vùng nhớ mới
        // trước index:
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }
        // sau index:
        for (int i = index; i < arr.length - 1; i++) {
            brr[i] = arr[i + 1];
        }
        // bước 3: cho biến mảng ban đầu vào mảng mới
        return brr;
    }

        private static int[] removevalue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr = remove(arr, i);
                i--;
            }
        }
        return arr;
    }
}

