package StringBuilder_Date.Bai2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *  h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy.
 *  Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
 */
public class CauH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nhập ngày 1 (dd/MM/yyyy): ");
        String d1 = sc.nextLine();
        System.out.print("Nhập ngày 2 (dd/MM/yyyy): ");
        String d2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(d1, dtf);
        LocalDate date2 = LocalDate.parse(d2, dtf);

        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Chênh lệch số ngày: " + Math.abs(days));
    }
}
