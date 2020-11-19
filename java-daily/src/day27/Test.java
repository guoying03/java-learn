package day27;

/**
 * @ClassName Test
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/19
 **/
public class Test {
    public static void main(String[] args) {
        showColor("red");
    }

    public static void showColor(String color){
        switch (color){
            case "red" :
                System.out.println(color + "是红色");
                break;
            case"blue":

                System.out.println("是蓝色");
                break;
            case"green":

                    System.out.println(color + "绿色的");
                    break;
            default:
                System.out.println( color+ "颜色未知");
        }
    }
}
