package itemtest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: yuguo
 * @Date: 2022/1/28 - 01 - 28 - 16:35
 * @Description: itemtest
 * @version: 1.0
 */
public class Demo04Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("张三",20),
                new Person("李四",40),
                new Person("王五",39)
        };
        /*Arrays.sort(arr, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        */
        for(Person p : arr){
            System.out.println(p);
        }
        //使用lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        //优化省略Lambda
        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());
        for(Person p : arr){
            System.out.println(p);
        }
    }
}
