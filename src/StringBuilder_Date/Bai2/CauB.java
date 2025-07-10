package StringBuilder_Date.Bai2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  b. Chuyển ngày hiện tại (của hệ thống)
 *  đang ở kiểu java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
 */
public class CauB {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formatted = sdf.format(now);
        System.out.println("Ngày hiện tại: " + formatted);
    }
}
