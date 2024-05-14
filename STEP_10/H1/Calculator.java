import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(10, 20, 80, 25);
        panel.add(label1);

        textField1 = new JTextField(20);
        textField1.setBounds(100, 20, 165, 25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Operator:");
        label2.setBounds(10, 50, 80, 25);
        panel.add(label2);

        String[] operators = {"+", "-"};
        JComboBox<String> comboBox = new JComboBox<>(operators);
        comboBox.setBounds(100, 50, 165, 25);
        panel.add(comboBox);

        JLabel label3 = new JLabel("Number 2:");
        label3.setBounds(10, 80, 80, 25);
        panel.add(label3);

        textField2 = new JTextField(20);
        textField2.setBounds(100, 80, 165, 25);
        panel.add(textField2);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 110, 150, 25);
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 140, 80, 25);
        panel.add(resultLabel);

        textField3 = new JTextField(20);
        textField3.setBounds(100, 140, 165, 25);
        textField3.setEditable(false);
        panel.add(textField3);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String operator = (String) comboBox.getSelectedItem();
                String num2 = textField2.getText();

                int result = calculate(num1, operator, num2);
                textField3.setText(Integer.toString(result));
            }
        });
    }

    private static int calculate(String num1, String operator, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = 0;

        if (operator.equals("+")) {
            sum = n1 + n2;
        } else if (operator.equals("-")) {
            sum = n1 - n2;
        }

        return sum;
    }
}