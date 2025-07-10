package StringBuilder_Date.Bai1;

/**
 * a. Cho chuỗi "Hello World"
 * Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
 */
public class CauA {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello World");
        StringBuilder sbd = new StringBuilder("Hello World");

        String world1 = sbf.substring(6);
        String world2 = sbd.substring(6);

        System.out.println("StringBuffer: " + world1);
        System.out.println("StringBuilder: " + world2);
    }
}
