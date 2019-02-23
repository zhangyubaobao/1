import java.util.Scanner;

public class lianxiScanner {

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int b = one.nextInt();
        System.out.println("第一个整数：" + b);
        int a = one.nextInt();
        System.out.println("第二个整数：" + a);
        System.out.println("两个数的和是:"+(a+b));
    }
}