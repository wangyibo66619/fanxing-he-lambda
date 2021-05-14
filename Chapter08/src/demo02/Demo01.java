package demo02;

/**
 * @author 王艺博
 * @date 2021/5/11 17:12
 */
public class Demo01 {
    public static void main(String[] args) {
        Pari<String> s = new Pari<>("大根","小根");
        Pari<Integer> i = new Pari<>(1,3);
        Pari<Double> d = new Pari<>(1.1,2.2);

        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
    }
}
