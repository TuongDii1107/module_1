package StringBuilder_Date.Bai2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
 * Gợi ý: nếu ngày hiện tại là ngày 26/6 thì 1 tháng sau được hiểu là ngày 26/7 (giữ nguyên ngày, tăng 1 tháng)
 */
public class CauF {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate oneMonthLater = today.plusMonths(1);

        System.out.println("Một tháng sau là: " + oneMonthLater);
        System.out.println("Thứ trong tuần: " + oneMonthLater.getDayOfWeek());
        System.out.println("Số ngày cách nhau: " + ChronoUnit.DAYS.between(today, oneMonthLater));
    }
}
