package StringBuilder_Date.Bai2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy.
 * Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.
 */
public class CauI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nhập ngày (dd/MM/yyyy): ");
        String input = sc.nextLine();
        System.out.print("Nhập số ngày n: ");
        int n = sc.nextInt();

        LocalDate date = LocalDate.parse(input, dtf);
        LocalDate future = date.plusDays(n);

        System.out.println("Ngày sau " + n + " ngày là: " + future.format(dtf));
    }
}