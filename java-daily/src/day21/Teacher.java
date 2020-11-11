package day21;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/11
 **/

/**
 * 老师类：teacher
 * 属性：姓名name，年龄age，讲课内容：content
 * 成员方法：吃饭eat方法，讲课teach方法
 * 学生类：Student
 * 属性：姓名name，年龄age，学习内容content
 * 行为：吃饭eat方法，学习study方法
 */
public class Teacher {
    private String name;
    private int age;
    private  String content;
    /**
     * 讲课方法
     */

    public void jiangke(){
        System.out.println("年龄为" + age + "的" + name + "正在亢奋的讲着" + content + "的知识.....");

    }
    public void eat(){
        System.out.println("年龄为" + age + "的" + name + "正在吃饭.....");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Teacher(){
    }

    public Teacher(String name, int age, String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }
}
