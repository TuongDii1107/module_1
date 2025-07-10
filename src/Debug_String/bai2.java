package Debug_String;

import java.util.Scanner;

/**
 * Thực hiện các việc chuyển đổi sau:
 * a. Chuyển đổi String thành int
 * b. Chuyển đổi int thành String
 * c. Chuyển đổi String thành long
 * d. Chuyển đổi long thành String
 * e. Chuyển đổi String thành float
 * f. Chuyển đổi float thành String
 * g. Chuyển đổi String thành double
 * h. Chuyển đổi double thành String
 * i. Chuyển đổi String thành short
 * k. Chuyển đổi short thành String
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // a. String -> int
            System.out.print("Nhập số nguyên (int): ");
            String strInt = scanner.nextLine().trim();
            int intValue = Integer.parseInt(strInt);
            System.out.println("String -> int: " + intValue);

            // b. int -> String
            String strFromInt = String.valueOf(intValue);
            System.out.println("int -> String: " + strFromInt);

            // c. String -> long
            System.out.print("Nhập số nguyên : ");
            String strLong = scanner.nextLine().trim();
            long longValue = Long.parseLong(strLong);
            System.out.println("String -> long: " + longValue);

            // d. long -> String
            String strFromLong = String.valueOf(longValue);
            System.out.println("long -> String: " + strFromLong);

            // e. String -> float
            System.out.print("Nhập số thực: ");
            String strFloat = scanner.nextLine().trim();
            float floatValue = Float.parseFloat(strFloat);
            System.out.println("String -> float: " + floatValue);

            // f. float -> String
            String strFromFloat = String.valueOf(floatValue);
            System.out.println("float -> String: " + strFromFloat);

            // g. String -> double
            System.out.print("Nhập số thực: ");
            String strDouble = scanner.nextLine().trim();
            double doubleValue = Double.parseDouble(strDouble);
            System.out.println("String -> double: " + doubleValue);

            // h. double -> String
            String strFromDouble = String.valueOf(doubleValue);
            System.out.println("double -> String: " + strFromDouble);

            // i. String -> short
            System.out.print("Nhập số nguyên nhỏ : ");
            String strShort = scanner.nextLine().trim();
            short shortValue = Short.parseShort(strShort);
            System.out.println("String -> short: " + shortValue);

            // k. short -> String
            String strFromShort = String.valueOf(shortValue);
            System.out.println("short -> String: " + strFromShort);

        } catch (NumberFormatException e) {
            System.out.println("Nhập số không hợp lệ!");
        }
    }
}
