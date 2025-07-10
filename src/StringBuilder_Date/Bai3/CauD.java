package StringBuilder_Date.Bai3;

/**
 *  d. Phân biệt ép kiểu tường minh và ép kiểu ngầm định
 */
public class CauD {
    public static void main(String[] args) {

        int a = 100;
        long b = a;

        double x = 123.456;
        int y = (int) x;

        System.out.println("Ép ngầm định (int -> long): " + b);
        System.out.println("Ép tường minh (double -> int): " + y);
    }
}
