import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class H1_Calculator implements ActionListener {
    JTextField txt;
    String exp;

    H1_Calculator() {
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(400, 400));

        txt = new JTextField();
        txt.setBounds(100, 50, 200, 30);

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
        panel.add(txt);
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

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            exp = calculate(exp);
        } 
        else {
            exp += command;
        }
        txt.setText(exp);
    }

    public String calculate(String exp) {
            String[] parts = exp.split("[-+]");

            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            char operator = exp.charAt(parts[0].length());

            int result;
            if (operator == '+') {
                result = num1 + num2;
            } 
            else if (operator == '-') {
                result = num1 - num2;
            }

            return String.valueOf(result);
        } 
    }

    public static void main(String[] args){
        H1_Calculator main_obj = new H1_Calculator();
        System.out.println("Console thread is going out!!");
    }

