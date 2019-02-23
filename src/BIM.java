import java.util.Scanner;

public class BIM {

    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("请输入身高（m）：");
        float height = sa.nextFloat();
        System.out.println("请输入体重（kg）：");
        float weight = sa.nextFloat();
        System.out.println("当前的BIM是：" + weight / (height*height));
    }
}
