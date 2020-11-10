package day20;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/10
 **/

/**
 * 定义两个类，经理类Manager，程序员类Coder
 * Coder类：属性：姓名、工号、薪资
 * 构造方法：无参构造方法，满参构造方法
 * 成员方法：
 * get/set方法
 * intro方法：打印姓名、工号信息
 * showSalary方法：打印薪资信息
 * work方法：打印工作信息
 *
 * Manager类：
 * 属性：姓名、工号、薪资
 * 经理的薪资有两部分组成：基本工资+奖金
 * 构造方法：无参构造方法，满参构造方法
 * 成员方法：
 * get/set方法
 *   intro方法：打印姓名、工号信息
 *   showSalary方法：打印薪资信息
 *   work方法：打印工作信息
 *   定义测试类，创建Manager对象，创建Coder对象，并测试
 *
 */
public class Coder {
    private String name;
    private String id;
    //基本工资
    private int salary;

    public Coder(){

    }

    public Coder (String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("基本工资为" + salary + ",奖金无");
    }

    public void intro() {
        System.out.println("程序员姓名:" + name);
        System.out.println("工号:" + id);
    }

    public void work() {
        System.out.println("正在努力写代码.......");
    }
}
