package StringBuilder_Date.Bai2;

import java.time.LocalDateTime;

/**
 * e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
 */
public class CauE {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Ngày: " + now.getDayOfMonth());
        System.out.println("Tháng: " + now.getMonthValue());
        System.out.println("Năm: " + now.getYear());
        System.out.println("Giờ: " + now.getHour());
        System.out.println("Phút: " + now.getMinute());
        System.out.println("Giây: " + now.getSecond());
    }
}
