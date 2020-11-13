package day23;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ShowLayout
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/13
 **/
public class ShowLayout extends JFrame {
    PanelGridLayout pannelGrid;
    PanelNullLayout panelNull;
    JTabbedPane tabbedPane;
    ShowLayout(){
        pannelGrid = new PanelGridLayout();
        panelNull = new PanelNullLayout();
        tabbedPane = new JTabbedPane();
        tabbedPane.add("网格布局的面板", pannelGrid);
        tabbedPane.add("空布局的面板", panelNull);
        add(tabbedPane, BorderLayout.CENTER);
        add(new JButton("窗体是BorderLayout布局"), BorderLayout.NORTH);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("西"), BorderLayout.WEST);
        add(new JButton("东"), BorderLayout.EAST);
        setBounds(10,10,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
}
