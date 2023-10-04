import java.util.Scanner;

public class isEmpty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi từ bàn phím: ");
        String str= scanner.nextLine();
        System.out.println("Kiểm tra chuỗi rỗng : "+ str.isEmpty());
    }
}
