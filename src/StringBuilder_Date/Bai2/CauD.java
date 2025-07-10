package StringBuilder_Date.Bai2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  d. Chuyển ngày hiện tại (của hệ thống)
 *  đang ở kiểu LocalDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
 */
public class CauD {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = today.format(dtf);
        System.out.println("LocalDate hiện tại: " + formatted);
    }
}
