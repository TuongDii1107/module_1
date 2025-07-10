package StringBuilder_Date.Bai1;

/**
 * e. Viết chương trình phân biệt sự khác nhau giữa
 * so sánh bằng method equals và so sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.
 */
public class CauE {
    public static void main(String[] args) {
        // String
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("String equals (str1, str2): " + str1.equals(str2));
        System.out.println("String == (str1, str2): " + (str1 == str2));
        System.out.println("String equals (str1, str3): " + str1.equals(str3));
        System.out.println("String == (str1, str3): " + (str1 == str3));

        // StringBuffer
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("StringBuffer equals: " + sb1.equals(sb2));
        System.out.println("StringBuffer ==: " + (sb1 == sb2));

        // StringBuilder
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println("StringBuilder equals: " + sb3.equals(sb4));
        System.out.println("StringBuilder ==: " + (sb3 == sb4));
    }
}
