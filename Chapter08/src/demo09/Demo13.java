package demo09;

import java.util.Map;

/**
 * @author 王艺博
 * @date 2021/5/13 11:40
 */
@FunctionalInterface
interface IMyPerson< R ,PX,PN ,PA > {
    R message( PN name ,PX xing, PA age );
}
public class Demo13 {
    public static void main(String[] args) {
        // Person::new;  构造方法
        IMyPerson<Person ,String,String,Integer> shili = Person::new;
        Person str = shili.message("大根", "王", 18);
        System.out.println(str);
    }
}
