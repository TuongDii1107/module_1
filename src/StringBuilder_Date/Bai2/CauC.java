package StringBuilder_Date.Bai2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
 */
public class CauC {
    public static void main(String[] args) {
        String input = "02/28/2023";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(input, dtf);
        System.out.println("LocalDate: " + date);
    }
}
