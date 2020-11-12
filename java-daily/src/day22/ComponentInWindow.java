package day22;

import javax.swing.*;
import java.awt.*;
import java.nio.file.attribute.GroupPrincipal;

/**
 * @ClassName ComponentInWindow
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/12
 **/
public class ComponentInWindow extends JFrame {
    JTextField text;
    JButton button;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radio1, radio2;
    ButtonGroup group;
    JComboBox<String> comBox;
    JTextArea area;
    public ComponentInWindow(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        JLabel biaoqian = new JLabel("文本框");
        add(biaoqian);
        text = new JTextField(10);
        add(text);
        button = new JButton("确定");
        add(button);
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        checkBox3 = new JCheckBox("喜欢篮球");
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        group = new ButtonGroup();
        radio1 = new JRadioButton("帅哥");
        radio2 = new JRadioButton("美女");
        group.add(radio1);
        group.add(radio2);
        add(radio1);
        add(radio2);
        comBox.addItem("音乐天地");
        comBox.addItem("武术天地");
        comBox.addItem("象棋乐园");
        add(comBox);
        area = new JTextArea(6,12);
        add(new JScrollPane(area));
    }
}
