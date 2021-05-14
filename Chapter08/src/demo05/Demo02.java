package demo05;

/**
 * @author 王艺博
 * @date 2021/5/13 9:02
 */
// lambda表达式语法:(参数)-> {};(多行时),(参数)->单行语句
interface IMath{
    int add(int a,int b);
}

public class Demo02 {
    public static void main(String[] args) {
        // 方法体只有一句话时，可以省略return并简写，用()表示
        // IMath math =(p1,p2) -> {return p1+p2; };
        IMath math = (p1,p2) -> (p1+p2);

        System.out.println(math.add(20,30));
    }
}
