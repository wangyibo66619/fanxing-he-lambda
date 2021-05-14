package demo09;

import java.util.Locale;

/**
 * @author 王艺博
 * @date 2021/5/13 11:28
 */
interface IMyConv<String> {
    String zhuanhuandaxie();
}
public class Demo10 {
    public static void main(String[] args) {
        // 对象方法
        IMyConv<String> shili = "hello"::toUpperCase;
        System.out.println(shili.zhuanhuandaxie());
    }
}
