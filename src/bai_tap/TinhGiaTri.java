/**
 * Tìm a, i, j biết:
 * a.    int i = 1, j = 1;
 * int a = i++ + j++;
 * b.    int i = 1, j = 1;
 * int a = i++ + ++j;
 * c.    int i = 1, j = 1;
 * int a = ++i + j++;
 * d.    int i = 1, j = 1;
 * a = ++i + ++j;
 * e.    int i = 1, j = 1;
 * int a = i++ + j++ + i++ + j++;
 * f.    int i = 1, j = 1;
 * int a = ++i + ++j + i++ + j++;
 * g.    int i = 1;
 * int a = i++ + ++i - i-- - --i;
 * h.    int a = 10;
 * a += a++ + ++a;
 */
package bai_tap;

public class TinhGiaTri {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i++ + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);

        int b = i++ + ++j;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("b = " + b);

        int c = ++i + j++;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("c = " + c);

        int d = ++i + ++j;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);

        int e = i++ + j++ + i++ + j++;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("e = " + e);

        int f = ++i + ++j + i++ + j++;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("f = " + f);





    }
}
