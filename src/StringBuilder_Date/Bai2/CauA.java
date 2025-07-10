package StringBuilder_Date.Bai2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
 */
public class CauA {
    public static void main(String[] args) throws Exception {
        String input = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(input);
        System.out.println("java.util.Date: " + date);
    }
}
