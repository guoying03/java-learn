package com.gyy.study.week6;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LogineFrame
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/9
 **/
public class LogineFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JPanel logoPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton 登录Button;

    public static void main(String[] args) {
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().width);
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().height);
        JFrame frame = new JFrame("LogoFrame");
        frame.setContentPane(new LogineFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
