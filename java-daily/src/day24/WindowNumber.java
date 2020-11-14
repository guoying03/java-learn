package day24;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName WindowNumber
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/14
 **/
public class WindowNumber extends JFrame {
    JTextField text;
    PoliceListen listener;
    public WindowNumber(){
        init();
        setBounds(100,100,150,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        text = new JTextField(10);
        listener = new PoliceListen();
        text.addActionListener(listener);
        add(text);
    }
}
