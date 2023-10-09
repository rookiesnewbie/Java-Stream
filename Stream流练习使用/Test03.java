import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 19:59
 * Version 1.0
 * @Description 练习三
 */
public class Test03 {

    /**
     * 需求：
     *      现在有两个ArrayList集合，
     *      第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
     *      姓名和年龄中间用逗号隔开。比如:张三,23
     *      要求完成如下的操作:
     *          1，男演员只要名字为3个字的前两人
     *          2，女演员只要姓杨的，并且不要第一个
     *          3，把过滤后的男演员姓名和女演员姓名合并到一起
     *          4，将上一步的演员信息封装成Actor对象。
     *          5，将所有的演员对象都保存到List集合中。
     *          备注:演员类Actor，属性只有一个: name,age
     *
     */

    public static void main(String[] args) {
        List<String> actors1 = new ArrayList<>();
        List<String> actors2 = new ArrayList<>();
        Collections.addAll(actors1,"白眉鹰王,40","张无忌,23","张翠山,45","张三丰,69","谢逊,46","杨逍,43");
        Collections.addAll(actors2,"赵敏,23","周芷若,23","杨不悔,25","杨颖,22","杨超越,26","杨幂,26");

        List<String> actor1 = actors1.stream().filter(actor -> actor.split(",")[0].length() >= 3).limit(2).collect(Collectors.toList());

        List<String> actor2 = actors2.stream().filter(actor -> actor.split(",")[0].startsWith("杨")).skip(1).collect(Collectors.toList());
        List<Actor> actors = Stream.concat(actor1.stream(), actor2.stream()).map(actor -> {
            Actor actor3 = new Actor();
            String name = actor.split(",")[0];
            Integer age = Integer.parseInt(actor.split(",")[1]);
            actor3.setName(name);
            actor3.setAge(age);

            return actor3;
        }).collect(Collectors.toList());

        System.out.println(actors.toString());

    }

    static class Actor{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Actor{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
