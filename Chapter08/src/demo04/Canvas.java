package demo04;

import java.awt.*;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/11 18:14
 */
public class Canvas {
    public void hua(Shape s) {
        s.draw();
    }
    // 有限的泛型使用
    // <? extends 类型>   <? extends Shape>  泛型的上限
    public void huaAll(List<? extends Shape> shapeList) {
        for (Shape s : shapeList) {
            s.draw();
        }
    }
}
