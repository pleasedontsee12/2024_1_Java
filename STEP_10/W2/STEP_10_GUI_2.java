import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class STEP_10_GUI_2 {
    public static void main(String[] args) {
        class clickListener implements ActionListener{
            JTextField txt;
            JTextField txt2;
            int nc = 0;

            clickListener(JTextField txt, JTextField txt2){
                this.txt = txt;
                this.txt2 = txt2;
            }

            public void actionPerformed(ActionEvent e){
                txt.setText("Click Count1 : " + ++nc);
                txt2.setText("Click Count2 : " + nc);
            }
        }

        class endListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }


        JFrame frame = new JFrame("Gui_10_2");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400,400));

        JTextField txt = new JTextField("Click Count1 : " + 0);
        txt.setBounds(100,100,200,30);
        JTextField txt2 = new JTextField("Click Count2 : " + 0);
        txt2.setBounds(100,50,200,30);

        JButton btn_click = new JButton("Click");
        btn_click.setBounds(150,200,80,30);
        btn_click.addActionListener(new clickListener(txt,txt2));

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150,300,80,30);
        btn_end.addActionListener(new endListener());

        panel.setLayout(null);
        panel.add(txt);
        panel.add(txt2);
        panel.add(btn_click);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going out!!");

    }
}
