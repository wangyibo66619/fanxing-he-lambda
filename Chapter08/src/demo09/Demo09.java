package demo09;

/**
 * @author 王艺博
 * @date 2021/5/13 11:17
 */
interface int2String<P,R> {
    R zhuanhuan(P zhengshu);
}
public class Demo09 {
    public static void main(String[] args) {
        // zhengshu -> zhengshu+""         直接引用jdk中写好的代码  String::valueOf
        // int2String< Integer , String > shili = zhengshu -> zhengshu+"" ;
        int2String<Integer ,String> shili = String::valueOf;
        String str = shili.zhuanhuan(999);
        System.out.println(str.length());
    }
}
