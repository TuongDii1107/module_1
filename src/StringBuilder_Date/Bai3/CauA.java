package StringBuilder_Date.Bai3;

/**
 * a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
 * byte⤍short⤍int⤍long⤍float⤍double
 */
public class CauA {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}
