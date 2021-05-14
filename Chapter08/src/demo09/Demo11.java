package demo09;

/**
 * @author 王艺博
 * @date 2021/5/13 11:34
 */
@FunctionalInterface
interface IMyMessage6<R,P> {
    R compare(P p1,P p2);
}
public class Demo11 {
    public static void main(String[] args) {
        // String::compareTo  lambda表达式引用普通方法
        IMyMessage6<Integer,String> message6 = String::compareTo;
        System.out.println(message6.compare("b","a"));
    }
}
