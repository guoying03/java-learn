package day22;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Example10_1
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/12
 **/
public class Example10_1 {
    public static void main(String[] args) {
        JFrame window1 = new JFrame("第一个窗口");
        JFrame window2 = new JFrame("第二个窗口");
        Container con = window1.getContentPane();
        //设置窗口的背景色
        con.setBackground(Color.yellow);
        //设置窗口在屏幕上的位置及大小
        window1.setBounds(60,100,188,108);
        window2.setBounds(260,100,188,108);
        window1.setVisible(true);
        //释放当前窗口
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window2.setVisible(true);
        //推出程序
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
