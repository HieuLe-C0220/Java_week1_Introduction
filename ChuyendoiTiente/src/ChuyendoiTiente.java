import java.util.Scanner;

public class ChuyendoiTiente {
    public static void main(String[] args) {
        System.out.println("Mời nhập số tiền ($) bạn muốn chuyển đổi: ");
        Scanner scan = new Scanner(System.in);
        int DOLA;
        int VND;
        DOLA = scan.nextInt();
        int rate = 23000;
        VND = DOLA*rate;
        System.out.print("Giá trị số tiền VND chuyển đổi được: "+VND);
    }
}
