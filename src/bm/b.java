package bm;

public class b {
    private float height;
    private float weight;

    public b() {}

    public b(float height,float weight){
        this.height=height;
        this.weight=weight;
    }

    public float jisuan(float height,float weight){
        return weight/(height*height);
    }

    public String re(float bim){
        String r="";
        if(bim<18.5) {
            r = "体重过轻"; 
        }else if(bim>=18.5&&bim<24) {
            r = "正常范围";
        }else if(bim>=24&&bim<27) {
            r = "体重过重";
        }else if(bim>=27&&bim<30) {
            r = "轻度肥胖";
        }else if(bim>=30&&bim<35) {
            r = "中度肥胖";
        }else if(bim>=35) {
            r = "重度肥胖";
        }
        return r;
    }
}
