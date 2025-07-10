package StringBuilder_Date.Bai2;
import java.time.LocalDate;

/**
 * g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
 */
public class CauG {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate before1000 = today.minusDays(1000);
        System.out.println("Cách đây 1000 ngày là: " + before1000);
    }
}
