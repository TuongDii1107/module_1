package baitap;

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
