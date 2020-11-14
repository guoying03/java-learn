package day24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName PoliceListen1
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/14
 **/
public class PoliceListen1 implements ActionListener {
    WindowNumber1 view;
    public void setView(WindowNumber1 view){
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int n = 0, m = 0;
        String str = view.textInput.getText();
        if (!str.isEmpty()){
            try{
                n = Integer.parseInt(str);
                m = n * n;
                view.textShow.setText("" + m);
            }
            catch (Exception exp){
                view.textInput.setText("请输入数字");
            }
        }
    }
}
