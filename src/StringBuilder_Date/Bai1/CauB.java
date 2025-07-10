package StringBuilder_Date.Bai1;

/**
 * b. Cho chuỗi "Hello World"
 * Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
 */
public class CauB {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello World");
        StringBuilder sbd = new StringBuilder("Hello World");

        for (int i = 0; i < sbf.length(); i++) {
            if (sbf.charAt(i) == 'o') {
                sbf.setCharAt(i, 'f');
            }
        }

        for (int i = 0; i < sbd.length(); i++) {
            if (sbd.charAt(i) == 'o') {
                sbd.setCharAt(i, 'f');
            }
        }

        System.out.println("StringBuffer sau thay: " + sbf);
        System.out.println("StringBuilder sau thay: " + sbd);
    }
}
