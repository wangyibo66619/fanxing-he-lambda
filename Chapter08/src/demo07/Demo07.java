package demo07;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author 王艺博
 * @date 2021/5/13 9:22
 */
public class Demo07 {
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

    public static void checkAndExecutor(List<Person> personList,
                                        Predicate<Person> predicate,
                                        Consumer<Person> consumer
                                        ) {
        /*for ( Person p : personList ) {
            if ( predicate.test(p) ) {
                consumer.accept(p);
            }
        }*/
        /*personList.forEach(
                p -> {
                    if (predicate.test(p))
                        consumer.accept(p);
                }
        );*/
        /*personList.stream()
                .filter( p -> p.getLastName().startsWith("W") )
                .forEach(person -> System.out.println(person.getFirstName()));*/
        personList.stream()
                .filter(person -> person.getLastName().startsWith("W"))
                .forEach(System.out::println);
    }
}
