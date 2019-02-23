package bm;

import java.util.Scanner;

public class a {

    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入身高（m）：");
        float height = sa.nextFloat();
        System.out.println("请输入体重（kg）：");
        float weight = sa.nextFloat();

        b bi = new b();
        System.out.println("当前BMI指数为:"+ bi.jisuan(height,weight) +",为"+ bi.re(bi.jisuan(height,weight)));
    }
}
