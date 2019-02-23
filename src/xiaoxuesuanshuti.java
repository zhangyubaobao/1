public class xiaoxuesuanshuti {

    public static void main(String[] args){
        int a;
        int b;
        int c;
        int d;
        for(a=-100;a<=100;a++){
            for(b=-100;b<=100;b++){
                for(c=-100;c<=100;c++){
                    for(d=-100;d<=100;d++){
                        if((a+b==8)&&(b+d==10)&&(c-d==6)&&(a+c==14)) System.out.println(a+" "+b+" "+c+" "+d);
                    }
                }
            }
        }
    }
}
