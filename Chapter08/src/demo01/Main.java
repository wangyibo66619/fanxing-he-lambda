package demo01;

import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/11 16:59
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(11);
        list.add("大根");
        list.add(true);
        list.add(11.11);
        System.out.println(list);

        ArrayList<String> s = new ArrayList<>();
        s.add("字符串类型");
        System.out.println(s);
        //s.add(11);泛型做类型的约束，使集合中存放相同的数据类型
    }
}
