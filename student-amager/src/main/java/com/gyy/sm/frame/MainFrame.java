package com.gyy.sm.frame;

import com.gyy.sm.entity.Department;
import com.gyy.sm.factory.ServiceFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/17
 **/
public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel centerPanel;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;
    private JButton 新增院系Button;
    private JButton 切换显示Button;
    private JPanel toolBarPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel contentPanel;
    private JPanel addDepPanel;
    private JTextField depNameField;
    private JButton 选择图片Button;
    private JLabel logolable;

    private final CardLayout c;

    public MainFrame() {
        init();
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1", departmentPanel);
        centerPanel.add("2", classPanel);
        centerPanel.add("3", studentPanel);
        centerPanel.add("4", rewardPanel);

        院系管理Button.addActionListener(e -> {
            c.show(centerPanel, "1");
        });
        班级管理Button.addActionListener(e -> {
            c.show(centerPanel, "2");
        });
        学生管理Button.addActionListener(e -> {
            c.show(centerPanel, "3");
        });
        奖惩管理Button.addActionListener(e -> {
            c.show(centerPanel, "4");
        });
        showDepartments();

        //左侧边栏切换效果
        新增院系Button.addActionListener(e -> {
            //获取左侧面板的可见性
            boolean visible = addDepPanel.isVisible();
            //不可见
            if (!visible) {
                //向右开展、背景色变化、可见
                leftPanel.setPreferredSize(new Dimension(180, this.getHeight() - 100));
//                addDepPanel.setBackground(new Color(55, 90, 186));
                addDepPanel.setVisible(true);
            }else {
                //向左侧收起、背景色还原、不可见
                leftPanel.setPreferredSize(new Dimension(60, this.getHeight() - 100));
//                addDepPanel.setBackground(new Color(114, 148, 153));
                addDepPanel.setVisible(false);
            }

            leftPanel.revalidate();
        });
    }

    public void init(){
        this.setTitle("管理员：");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    /**
     * 显示所有院系信息
     */
    private void showDepartments(){
        //移除原有数据
        contentPanel.removeAll();
        //从service层获取到所有院系列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数算出行数（每行放4个）
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网格布局，每行4列，指定水平和垂直间距
        GridLayout gridLayout = new GridLayout(row, 4, 15,15);
        contentPanel.setLayout(gridLayout);

//        departmentPanel.setLayout(gridLayout);

        for (Department department : departmentList){
            //给每个院系对象创建一个面板
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(220, 298));
            depPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));

            //设置合适大小
//            depPanel.setPreferredSize(new Dimension(200,200));
            //将院系名称设置给面板标题
//            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            //新建一个JLabel标签，用来放置院系logo，并指定大小

            JLabel nameLabel = new JLabel(department.getDepartmentName());
            //新建一个JLabel标签，用来放置院系logo，并指定大小
            JLabel logoLabel = new JLabel("<html><img src ='" + department.getLogo() + "' mode='widthFix'/><html>");
            //占位空白标签
            JLabel blankLabel = new JLabel();
            blankLabel.setPreferredSize(new Dimension(200, 30));
            //删除按钮
            JButton delBtn = new JButton("删除");
            //院系名称标签加入院系面板
            depPanel.add(nameLabel);
            //图标标签加入院系面板
            depPanel.add(logoLabel);
            //按钮加入院系面板
            depPanel.add(delBtn);
            //院系面板加入主体内容面板
            departmentPanel.add(depPanel);
            //刷新主体内容面板
            departmentPanel.revalidate();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

