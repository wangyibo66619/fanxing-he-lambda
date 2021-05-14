package demo05;

/**
 * @author 王艺博
 * @date 2021/5/13 8:21
 */
interface aaa {
    void print();
}
public class Demo01 {
    public static void main(String[] args) {
        aaa a = ()-> System.out.println("aaa");
        a.print();

    }

}
