package StringBuilder_Date.Bai3;

/**
 * b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
 * double⤍float⤍long⤍int⤍short⤍byte
 */
public class CauB {
    public static void main(String[] args) {
        double d = 123.0;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
    }
}