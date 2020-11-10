package day20;

/**
 * @ClassName Test5
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/10
 **/
public class Test5 {
    public static void main(String[] args) {
        int[] salary = {15000, 3000};
        Manager m = new Manager("James", "9527", salary);
        m.intor();
        m.showSalary();
        m.work();

        System.out.println("==============");
        Coder c = new Coder();
        c.setName("Kobe");
        c.setId("0025");
        c.setSalary(10000);
        c.intro();
        c.showSalary();
        c.work();
    }
}
