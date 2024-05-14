import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class H1_Calc_renew implements ActionListener{
    JTextField txt_exp;
    JTextField txt_result;
    JButton btn_1;
    JButton btn_2;
    JButton btn_3;
    JButton btn_plus;
    JButton btn_minus;
    JButton btn_result;
    String exp = "";

    H1_Calc_renew(){
        JFrame frame = new JFrame("Renew Calculator");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(400,400));

        txt_exp = new JTextField();
        txt_exp.setBounds(100,50,200,30);
        txt_result = new JTextField();
        txt_result.setBounds(100,100,200,30);

        JButton btn_1 = new JButton("1");
        btn_1.setBounds(100, 150, 50, 50);
        JButton btn_2 = new JButton("2");
        btn_2.setBounds(200, 150, 50, 50);
        JButton btn_3 = new JButton("3");
        btn_3.setBounds(300, 150, 50, 50);
        JButton btn_plus = new JButton("+");
        btn_plus.setBounds(100, 250, 50, 50);
        JButton btn_minus = new JButton("-");
        btn_minus.setBounds(200, 250, 50, 50);
        JButton btn_result = new JButton("=");
        btn_result.setBounds(300, 250, 50, 50);

        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_plus.addActionListener(this);
        btn_minus.addActionListener(this);
        btn_result.addActionListener(this);

        panel.setLayout(null);
        panel.add(txt_exp);
        panel.add(txt_result);
        panel.add(btn_1);
        panel.add(btn_2);
        panel.add(btn_3);
        panel.add(btn_plus);
        panel.add(btn_minus);
        panel.add(btn_result);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String txt = e.getActionCommand();
        if(txt.equals("=")){
            Calculation(exp);
            exp = "";
        }
        else {
            exp += txt;
            txt_exp.setText(exp);
        }
    }

    public void Calculation(String exp){
        int num1 = Integer.parseInt(exp.substring(0,1));
        int num2 = Integer.parseInt(exp.substring(2,3));
        String operator = exp.substring(1,2);

        if(operator.equals("+")){
            txt_result.setText(Integer.toString(num1 + num2));
        }
        else{
            txt_result.setText(Integer.toString(num1 - num2));
        }
    }

    public static void main(String[] args) {
        H1_Calc_renew main_obj = new H1_Calc_renew();
        System.out.println("Console thread is going out !!");
    }
}
