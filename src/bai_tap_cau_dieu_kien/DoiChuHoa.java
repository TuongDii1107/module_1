package bai_tap_cau_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo đã nhập sai.
 * Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái thường thì biến nó thành chữ cái hoa,
 * nếu nó là chữ cái hoa thì biến nó thành chữ cái thường.
 * Gợi ý: Ký tự chữ cái thường và hoa có mã ASCII cách nhau 32 đơn vị. Vd: ‘a’ là 97, ‘A’ là 65
 */
public class DoiChuHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một kí tự chữ cái: ");
        char kt = sc.next().charAt(0);

        if ((kt >= 'A' && kt <= 'Z') || (kt >= 'a' && kt <= 'z')) {
            if (kt >= 'a' && kt <= 'z') {
                kt -= 32;
            } else {
                kt += 32;
            }
            System.out.println("Ký tự sau khi đã đổi: " + kt);
        } else {
            System.out.println("Nhập sai. Hãy nhập một ký tự chữ cái.");
        }
        sc.close();
    }
}

