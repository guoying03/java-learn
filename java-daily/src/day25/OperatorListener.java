package day25;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @ClassName OperatorListener
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/15
 **/
public class OperatorListener implements ItemListener {
    WindowView view;
    public void setView(WindowView view){
        this.view = view;
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        String fuhao = view.choiceFuhao.getSelectedItem().toString();
        view.computer.setFuhao(fuhao);
    }
}
