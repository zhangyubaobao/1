package millionaire;

public class jisuan {
    private float p;
    private float r;
    private float F;

    public jisuan() {}

    public jisuan(float p,float r,float F){
        this.F=F;
        this.r=r;
        this.p=p;
    }

    public int panduan(float p,float r,float F){
        int n;
        float sum=0;
        for(n=1;n!=0; n++){
            sum+=p;
            sum*=1+r;
            if(sum>=F) break;
        }
        return n;
    }
}
