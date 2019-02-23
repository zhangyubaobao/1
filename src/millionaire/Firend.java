package millionaire;

import java.util.Scanner;

public class Firend {
    public static void main(String[] agrs){
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入最终收入：");
        float F=sa.nextFloat();
        System.out.println("请输入年利率：");
        float r=sa.nextFloat();
        System.out.println("请输入本金：");
        float p=sa.nextFloat();
        jisuan one = new jisuan();
        System.out.println("需要"+one.panduan(p,r,F)+"年");
    }
}
