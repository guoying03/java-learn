package day18;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/7
 **/
public class Circle {
    int r;

    public Circle(){
    }

    public Circle(int r ){
        this.r = r;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }
    public void showArea(){
        System.out.println("半径为:" + r + ",面积为:" + (3.14 * r * r));
    }
    public void showPerimeter(){
        System.out.println("半径为:" + r + ",面积为:" + ( 2 * 3.14 * r));
    }
}
