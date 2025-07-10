package Debug_String;

import java.util.Scanner;

/**
 * Cho chuỗi "Hello World"
 *     a. Lấy ra chữ World
 *     b. Thay o thành f
 *     c. Đếm xem có bao nhiêu chữ l
 *     d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
 *     e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
 *     f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
 *     g. Đảo chuỗi thành dlroW olleH
 *     h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
 *     i. Đổi toàn bộ kí tự của S sang chữ Hoa
 *     k. Đổi toàn bộ kí tự của S sang chữ thường
 *     l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello World";

        //Câu a. Lấy Ra chữ World
        String sub = str.substring(6);
        System.out.println("Chữ sau khi xửa lý: " + sub);

        //Câu b. Thay o thành f
        String replace = str.replace('o', 'f');
        System.out.println("Chữ sau khi xửa lý: " + replace);

        //Câu c. Đếm xem có bao nhiêu chữ l
        int dem = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                dem++;
            }
        }
        System.out.println("Đếm có bao nhiêu chữ L: " + dem);

        //Câu d. Cho biết vị trí xuât phát đầu và cuối của chữ l
        System.out.println("Vị trí bắt đầu của L : " + str.indexOf('l'));
        System.out.println("Vị trí cuối của L: " + str.lastIndexOf('l'));

        //e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("chuỗi sau khi xóa space: " + str.replace("", ""));

        //f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println("chuỗi sau khi xóa space: " + str.trim());

        //g. Đảo ngược chuỗi
        String str2 = " ";
        for (int i = str.length() - 1; i >= 0; i--){
            str2 +=  str.charAt(i);
        }
        System.out.println("Chuỗi sau khi đảo ngược: "+ str2);

        //h.Tạo thành chuỗi "SQC Hello World"
        String str3 = "SQC";
        String str4 =  str.concat(str3);
        System.out.println("Chuỗi sau khi tạo thành: " + str4);

        //k. Đổi S sang Hoa
        System.out.println("Chuỗi sau khi đổi: " + str.toUpperCase() );

        //i. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        System.out.println("Nhập n: " ); int n = sc.nextInt();
        System.out.println("Nhập m: " ); int m = sc.nextInt();
        System.out.printf("Chuỗi con được trích từ m và n: ", n, m, str.substring(n,m));
    }
}
