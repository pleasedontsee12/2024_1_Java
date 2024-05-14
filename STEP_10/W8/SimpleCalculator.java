import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField displayField;  // 텍스트 필드로 사용자 입력 및 결과 출력
    private JButton addButton, subtractButton;  // 연산 버튼

    public SimpleCalculator() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setTitle("Simple Calculator");
        setLayout(new FlowLayout());
        setSize(240, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField = new JTextField(10);
        displayField.setEditable(false);

        // 버튼 생성
        addButton = new JButton("+");
        subtractButton = new JButton("-");

        // 이벤트 리스너 연결
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(displayField.getText(), '+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(displayField.getText(), '-');
            }
        });

        add(displayField);
        add(addButton);
        add(subtractButton);

        setVisible(true);
    }

    private void performOperation(String expression, char operation) {
        String[] parts = expression.split("\\s");
        if (parts.length == 2) {
            String ns1 = parts[0];
            String ns2 = parts[1];
            String resultExpression = ns1 + operation + ns2;
            displayField.setText(resultExpression);
            calculateAndDisplay(resultExpression);
        }
    }

    private void calculateAndDisplay(String exp) {
        char op = exp.charAt(1);
        int n1 = exp.charAt(0) - '0';
        int n2 = exp.charAt(2) - '0';
        int result;

        if (op == '+') {
            result = n1 + n2;
        } else {
            result = n1 - n2;
        }
        displayField.setText(exp + " = " + result);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}