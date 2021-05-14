package demo03;

/**
 * @author 王艺博
 * @date 2021/5/11 17:25
 */
public class Tools {
    // 取数组中间元素
    public static String getMiddle(String [] a) {
        return a [a.length / 2];
    }
    public static <T> T getMiddle(T [] t) {
        return t [t.length / 2];
    }
}
