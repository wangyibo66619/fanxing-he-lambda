package demo02;

/**
 * @author 王艺博
 * @date 2021/5/11 17:06
 */
public class Pari<T> {  // type 类型
    private T first;
    private T second;
    // 构造方法
    public Pari() {
    }

    public Pari(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pari{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
