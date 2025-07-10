package StringBuilder_Date.Bai1;

/**
 * c. Cho chuỗi "Hello" và chuỗi “World”
 * Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
 */
public class CauC {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append("World");

        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append("World");

        System.out.println("String: " + s3);
        System.out.println("StringBuffer: " + sbf);
        System.out.println("StringBuilder: " + sbd);
    }
}
