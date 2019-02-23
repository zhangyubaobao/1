import java.util.Scanner;

public class guanx1 {

    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        System.out.println("第一个整数："+a);
        int b = sa.nextInt();
        System.out.println("第二个整数："+b);
        System.out.println("比较"+a+">"+b+":"+(a>b));
        System.out.println("比较"+a+">="+b+":"+(a>=b));
        System.out.println("比较"+a+"<"+b+":"+(a<b));
        System.out.println("比较"+a+"<="+b+":"+(a<=b));
        System.out.println("比较"+a+"="+b+":"+(a==b));
        System.out.println("比较"+a+"≠"+b+":"+(a!=b));
    }
}
