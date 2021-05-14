package demo06;

import java.util.Arrays;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/13 9:22
 */
public class Demo01 {
    public static void main(String[] args) {
        Person person1 = new Person("dagen", "Wang", 18);
        Person person2 = new Person("xiaogen", "Li", 18);
        Person person3 = new Person("ergen", "Zhang", 18);
        Person[] persons = {person1,person2,person3};
        List<Person> guiltyPersons = Arrays.asList(persons);
        // 调用检查和执行的方法
        checkAndExecutor(guiltyPersons,
                p -> p.getLastName().startsWith("W"),
                p -> System.out.println(p.getFirstName())
        );
    }

    public static void checkAndExecutor(List<Person> personList,NameChecker nameChecker,Executor executor) {
        for ( Person p : personList ) {
            if ( nameChecker.check(p) ) {
                executor.execute(p);
            }
        }
    }
}
@FunctionalInterface
interface NameChecker {
    boolean check(Person p);
}
@FunctionalInterface
interface Executor {
    void execute(Person p);
}