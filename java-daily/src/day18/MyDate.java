package day18;

/**
 * @ClassName MyDate
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/7
 **/

/**
 * 定义一个日期MyDate
 * 属性
 * year：年
 * month：月
 * day：日
 * 构造方法：
 * 满参构造方法
 * 成员方法：
 * get/set方法
 * showDate方法：打印日期
 * isBi方法：哦按段当前日期是否闰年
 */
public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }

    public void showDate(){
        System.out.println("日期:" + year + "年" + month + "月" + day + "日");
    }

    public void isBi(){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println(year + "年是闰年");
        }else{
            System.out.println(year + "年不是闰年");
        }
    }
}
