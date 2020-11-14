package day24;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName WindowNumber1
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/14
 **/
public class WindowNumber1 extends JFrame {
    public JTextField textInput, textShow;
    public JButton button;
    PoliceListen1 listener;
    public WindowNumber1(){
        init();
        setBounds(100,100,320,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        button = new JButton("确定");
        textInput = new JTextField(10);
        textShow = new JTextField(10);
        textShow.setEditable(false);
        listener = new PoliceListen1();
        listener.setView(this);
        textInput.addActionListener(listener);
        button.addActionListener(listener);
        add(textInput);
        add(button);
        add(textShow);
    }
}
