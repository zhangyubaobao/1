public class se {
    public static void income() {
        int a=12000;//一年存入的钱
        int n=1;//年数
        int sum=0;//总金额
        for(int i=0;i<n;i++) {
            sum=a*=(1+0.2);
            n++;
            System.out.println(sum);
            a=a+12000;
            if((sum)>1000000) {
                break;
            }
        }
        System.out.println("第"+n+"年达到了100万");
    }
}
