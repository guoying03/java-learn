package day20;

/**
 * @ClassName Manger
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/10
 **/
public class Manager {
    private String name;
    private String id;
//    基本工资 + 奖金

    private int[] salary;

    public Manager(){
    }

    public Manager(String name, String id, int[] salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int[] getSalary(){
        return salary;
    }

    public void setSalary(int[] salary){
        this.salary = salary;
    }

    public void showSalary(){
        System.out.println("基本工资为" + salary[0] + ",奖金为" + salary[1]);
    }

    public void intor(){
        System.out.println("经理姓名:" + name);
        System.out.println("工号为:" + id);
    }

    public void work(){
        System.out.println("正在努力的作者管理工作，分配任务，检查员工提交上来的代码.......");
    }
}
