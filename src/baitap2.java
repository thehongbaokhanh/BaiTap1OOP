import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy nhập số tền bạn muốn đổi sang VNĐ vào đây: ");
        int usd = infor.nextInt();
        int vnd = usd * 23000;
        System.out.println("Vậy số tiền sau khi đổi là: " + vnd + " VNĐ");
    }
}
