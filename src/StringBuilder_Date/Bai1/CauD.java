package StringBuilder_Date.Bai1;

/**
 * d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
 * String a = "A";
 * String b = new String("A");
 * String c = "A";
 * b.concat("B").
 * String d = c.concat("C");
 * StringBuffer e = new StringBuffer("E");
 * e.append("F");
 * StringBuilder g = new StringBuilder("G");
 * g.append("H");
 * System.out.println(a + b + c + d + e + g);
 */
public class CauD {
    public static void main(String[] args) {
        String a = "A";
        String b = new String("A");
        String c = "A";
        b.concat("B");
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");

        System.out.println("Kết quả: " + a + b + c + d + e + g);
        System.out.println("Tổng số đối tượng được tạo: 5");
    }
}
