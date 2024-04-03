import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy nhập điểm chuyên cần của bạn vào đây:");
        int diemcc = infor.nextInt();
        System.out.println("Hãy nhập điểm kiểm tra của bạn vào đây:");
        int diemkt = infor.nextInt();
        System.out.println("Hãy nhập điểm thi học kỳ của bạn vào đây:");
        int diemhk = infor.nextInt();
        int diemtb = (diemhk + diemcc + diemkt) / 3;
        System.out.println("Vậy số điểm trung bình của bạn là: " + diemtb);
        if (diemtb < 4){
            System.out.println("Vậy bạn thuộc hạng F");
        }
        if (diemtb >= 4 && diemtb < 5.5){
            System.out.println("Vậy bạn thuộc hạng D");
        }
        if (diemtb >= 5.5 && diemtb < 7){
            System.out.println("Vậy bạn thuộc hạng C");
        }
        if (diemtb >= 7 && diemtb < 8.5){
            System.out.println("Vậy bạn thuộc hạng B");
        }
        if (diemtb >= 8.5){
            System.out.println("Vậy bạn thuộc hạng A");
        }
    }
}
