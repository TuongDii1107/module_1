package StringBuilder_Date.Bai3;

/**
 * c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
 * double⤍float⤍long⤍int⤍short⤍byte
 */
public class CauC {
    public static void main(String[] args) {
        double d = 123456789.987654321;
        float f = (float) d;
        long l = (long) d;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("double: " + d);
        System.out.println("float (mất chính xác): " + f);
        System.out.println("long (mất phần thập phân): " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
    }
}
