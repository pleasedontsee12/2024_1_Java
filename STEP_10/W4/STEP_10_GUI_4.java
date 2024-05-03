import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STEP_10_GUI_4 implements ActionListener{
    JButton btn_yes;
    JButton btn_no;
    JTextField txt;
    JTextField txt2;
    
    STEP_10_GUI_4(){
        JFrame frame = new JFrame("GUI_10_4");
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(300, 300));

        txt = new JTextField("Yes Count : " + 0);
        txt.setBounds(50,60,200,30);

        txt2 = new JTextField("No Count : " + 0);
        txt2.setBounds(50,20,200,30);

        btn_yes = new JButton("Yes");
        btn_yes.setBounds(100,100,80,30);

        btn_no = new JButton("No");
        btn_no.setBounds(100,150,80,30);

        btn_yes.addActionListener(this);
        btn_no.addActionListener(this);

        JButton btn_end = new JButton("End");
        btn_end.setBounds(100,250,80,30);
        btn_end.addActionListener(new ActionListener() {
            int i = 0;
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        panel.setLayout(null);
        panel.add(txt);
        panel.add(txt2);
        panel.add(btn_end);
        panel.add(btn_yes);
        panel.add(btn_no);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    int nc1 = 0;
    int nc2 = 0;

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Yes")) {
            txt.setText("Yes Count : " + ++nc1);
            txt2.setText("No Count : " + nc2);
        }
        else if(e.getActionCommand().equals("No")){
            txt.setText("Yes Count : " + nc1);
            txt2.setText("No Count : " + ++nc2);
        }
        else if(e.getActionCommand().equals("End")){
            System.exit(0);
        }

    }
    
    public static void main(String[] args) {
        STEP_10_GUI_4 main_obj = new STEP_10_GUI_4();
        System.out.println("Console thread is goint out !!!");
    }
}