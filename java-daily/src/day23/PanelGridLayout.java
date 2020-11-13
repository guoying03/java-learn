package day23;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName PanelGridLayout
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/13
 **/
public class PanelGridLayout extends JPanel {
    PanelGridLayout(){
        GridLayout grid = new GridLayout(12,12);
        setLayout(grid);
        Label label[][] = new Label[12][12];
        for (int i = 0; i < 12 ; i++){
            for (int j = 0; j < 12; j++){
                label[i][j] = new Label();
                if ( (i + j) % 2 == 0) {
                    label[i][j].setBackground(Color.black);
                } else {
                    label[i][j].setBackground(Color.white);
                }
                add(label[i][j]);
            }
        }
    }

}
