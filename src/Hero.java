public class Hero {
    String name;//姓名
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移动
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
    //超神
    void  legendary(){
        System.out.println("超神");
    }
    //获取当前血量
    float getHp(){
        return hp;
    }
    //获取护甲值
    float getArmor(){
        return armor;
    }
    //回血
    void recovery(float blood)
    {
        hp=hp+blood;
    }
    //增加移动速度
    void addSpeed(int speed){
        //在原有基础上增加移速
        moveSpeed=moveSpeed+speed;
    }

    public static void main(String[] args){
        Hero garen =new Hero();
        garen.name="盖伦";
        garen.hp=500;
        garen.armor=60;
        garen.moveSpeed=20;
        System.out.println(garen.name+"当前血量"+garen.hp);
        System.out.println("进行操作回血");
        garen.recovery(100);
        System.out.println(garen.name+"当前血量"+garen.hp);
    }
}
