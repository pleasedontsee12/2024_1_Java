import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class STEP_10_GUI_3 {
    public static void main(String[] args) {
        class btnListener implements ActionListener{
            JTextField txt;
            int nc1, nc2 = 0;

            btnListener(JTextField txt){
                this.txt = txt;
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Yes")) {
                    txt.setText("Yes Count : " + ++nc1);
                }
                else if(e.getActionCommand().equals("No")){
                    txt.setText("No Count : " + ++nc2);
                }
                else if(e.getActionCommand().equals("End")){
                    System.exit(0);
                }

            }
        }



        JFrame frame = new JFrame("Gui_10_3");

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400,400));

        JTextField txt = new JTextField("Yes Count : " + 0);
        txt.setBounds(100,100,200,30);

        JTextField txt2 = new JTextField("No Count : " + 0);
        txt2.setBounds(100,50,200,30);

        JButton btn_yes = new JButton("Yes");
        btn_yes.setBounds(150,150,80,30);

        JButton btn_no = new JButton("No");
        btn_no.setBounds(150,200,80,30);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(150,350,80,30);

        btnListener lsnr_yn = new btnListener(txt);
        btn_yes.addActionListener(lsnr_yn);
        btn_no.addActionListener(lsnr_yn);
        btn_end.addActionListener(lsnr_yn);

        panel.setLayout(null);
        panel.add(txt);
        panel.add(btn_yes);
        panel.add(btn_no);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("Console thread is going out!!");

    }
}
