import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class STEP_10_GUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui_10_1");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400,400));

        JTextField txt = new JTextField("Click Count : ");
        txt.setBounds(100,100,200,30);

        JTextField name = new JTextField("채형주");
        name.setBounds(100,50,200,30);

        JButton btn_click = new JButton("Click");
        btn_click.setBounds(150,200,80,30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150,300,80,30);

        panel.setLayout(null);
        panel.add(txt);
        panel.add(name);
        panel.add(btn_click);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going down!!");

    }
}
