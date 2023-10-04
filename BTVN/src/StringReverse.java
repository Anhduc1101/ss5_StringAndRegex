import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str= sc.nextLine();
        StringBuffer str1=new StringBuffer(str);
        System.out.println("Chuỗi " +str+ " sau khi bị đảo ngược là: "+ str1.reverse() );
    }
}
