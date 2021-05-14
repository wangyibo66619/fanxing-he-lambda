package demo05;

/**
 * @author 王艺博
 * @date 2021/5/13 9:12
 */
interface Imessage{
    void print();
}
public class Demo03 {

    public static void main(String[] args) {
        Imessage imessage = () -> {
            System.out.println("hello");
            System.out.println("world");
            System.out.println("hello world");
        };
        imessage.print();
    }
}
