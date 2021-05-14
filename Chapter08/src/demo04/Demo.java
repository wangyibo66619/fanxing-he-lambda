package demo04;

import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/5/11 18:17
 */
public class Demo {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Circle circle = new Circle();
        canvas.hua(circle);
        // 要画的各种图形
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        // 准备一个列表，一次传入多个对象
        ArrayList<Shape> list = new ArrayList<>();
        // 加入到要执行的列表中
        list.add(circle1);
        list.add(circle2);
        list.add(rectangle1);
        list.add(rectangle2);
        // 执行批量批量操作
        canvas.huaAll(list);
    }
}
