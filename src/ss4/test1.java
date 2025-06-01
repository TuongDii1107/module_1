package ss4;

public class test1 {
    public static void main(String[] args) {
        double score = 5;

        if (score < 4) {
            System.out.println("Rớt môn");
        } else if (score >= 4 && score < 6) {
            System.out.println("Trung Bình");
        } else if (score >= 6 && score <= 10) {
            System.out.println("Khá");
        } else if (score >= 8 && score <= 10) {
            System.out.println("Giỏi");
        }
    }
}
