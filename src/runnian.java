import java.util.Scanner;

public class runnian {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        int year=sa.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)) System.out.println(year+"是闰年");
        else System.out.println(year+"不是闰年");
    }
}
