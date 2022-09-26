import java.util.Scanner;

public class bt2doiTienTe {
    public static void main(String[] args) {
        float vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        vnd = scanner.nextFloat();
        float usd = vnd*(42/1000000);
        System.out.println("Tổng tiền đổi là "+usd);
    }
}