package bai_tap_cau_dieu_kien;

/**Tính giá trị của biến c và biến d:
 boolean a = true && false;
 boolean b = (3 > 100) || (25 % 5 == 0)
 boolean c = a && b;
 boolean d = !a || b;
 */

public class TinhGiaTriBoolean {
    public static void main(String[] args) {
        Boolean a = true && false; // suy ra a = fasle
        Boolean b = false || true; // suy ra b = true
        Boolean c = false && true;
        Boolean d = !false || true;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
