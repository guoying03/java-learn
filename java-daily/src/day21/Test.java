package day21;

/**
 * @ClassName Test
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/11
 **/
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象");
        t.eat();
        t.jiangke();
        Student stu = new Student("韩同学", 18, "java面向对象");
        stu.eat();
        stu.study();
    }
}
