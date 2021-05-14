package demo08;

import java.util.Locale;
import java.util.Optional;

/**
 * @author 王艺博
 * @date 2021/5/13 10:59
 */
public class Demo08 {
    public static void main(String[] args) {
        Person person = new Person("大根","王",18);
        Optional<Person> personOpt = Optional.ofNullable(person);
        personOpt.ifPresent(System.out::println);
        personOpt.orElse(null);

        // map 切分任务
        personOpt.map( p -> p.getLastName() )
                .map( name -> name.toUpperCase())
                .orElse(null);

    }

    private static Person qushujuku() {
        System.out.println("从数据库中查询");
        return null;
    }
}
@FunctionalInterface
interface shujuku {
    Person qushujuku();
}