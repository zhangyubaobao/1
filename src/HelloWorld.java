public class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        //i值            2           3
        //表达式           false       true
        //              true    ^   true
        //                      false

        System.out.println(b);
        System.out.println(i);
    }
}