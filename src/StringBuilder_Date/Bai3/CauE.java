package StringBuilder_Date.Bai3;

/**
 *  e. Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java?
 *  Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?
 */
public class CauE {
    public static void main(String[] args) {

        int a = 100;
        double d = 3.14;

        long l = 100L;

        float f = 3.14F;

        double d2 = 3.14D;

        System.out.println("int: " + a);
        System.out.println("double: " + d);
        System.out.println("long (L): " + l);
        System.out.println("float (F): " + f);
        System.out.println("double (D): " + d2);
    }
}

