package baitapcaudieukien;

public class TinhGiaTriBoolean {
    public static void main(String[] args) {
        Boolean a = true && false; // suy ra a = fasle
        Boolean b = false || true; // suy ra b = true
        Boolean c = false && true;
        Boolean d = ! false || true;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
    }
}
