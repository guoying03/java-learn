package day25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName ComputerListener
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/15
 **/
public class ComputerListener implements ActionListener {
    WindowView view;
    String fuhao;
    public void setView(WindowView view){
        this.view = view;
    }
    public void setFuhao(String s){
        fuhao = s;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            double number1 = Double.parseDouble(view.inputNumberOne.getText());
            double number2 = Double.parseDouble(view.inputNumberTwo.getText());
            double result = 0;
            boolean isShow = true;
            if (fuhao.equals("+")) {
                result = number1 + number2;
            }
            else if (fuhao.equals("-")) {
                result = number1 - number2;
            }
            else if (fuhao.equals("*")) {
                result = number1 * number2;
            }
            else if (fuhao.equals("/")) {
                result = number1 / number2;
            } else {
                isShow = false;
            }
            if (isShow) {
                view.textShow.append(number1 + "" + fuhao + "" + number2 + "=" + result + "\n");
            }
            }
        catch (Exception exp){
            view.textShow.append("\n请输入数字字符\n");
        }
    }
}
