import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        String str1= scanner.nextLine();
        System.out.println("Nập vào chuỗi thứ hai: ");
        String str2= scanner.nextLine();
        boolean str3=str1.equals(str2);
        if(str3){
            System.out.println("2 chuỗi giống nhau !");
        }else {
            System.out.println("2 chuỗi khác nhau !");
        }
    }
}
