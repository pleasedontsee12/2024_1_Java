import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel{
    final int Up = 0, Dn = 1, Rt = 2, Lt = 3;
    private int x = 150, y = 150;
    int i = 0 ;
    MyPanel(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(400,400));
    }

    public void paintComponent(Graphics g){
        i++;
        super.paintComponent(g);
        if(i % 3 == 0){
            g.setColor(Color.red);
            g.drawOval(x,y,50,50);
        }
        else if(i % 3 == 1){
            g.setColor(Color.cyan);
            g.drawOval(x,y,50,50);
        }
        else if(i % 3 == 2){
            g.setColor(Color.magenta);
            g.drawOval(x,y,50,50);
        }
    }

    public void move_circle(){
        int ewsn = (int)(Math.random() * 1000) % 4;
        int disp = (int)(Math.random() * 1000) % 3;

        switch(ewsn){
            case Up: 
                y -= disp; 
                if(y < 0) y = 0;
                break;
            case Dn:
                y += disp;
                if(350 - 50 < y) y = 350 - 50;
                break;
            case Rt:
                x += disp;
                if(400 - 50 < x) y = 400 - 50;
                break;
            case Lt:
                x -= disp;
                if(x < 0) x = 0;
                break;
        }

        repaint();
    }
}

public class STEP_10_GUI_6{
    STEP_10_GUI_6() throws InterruptedException{
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        JButton btn_end = new JButton("End");

        btn_end.setBounds(165,360,70,30);
        btn_end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        panel.setLayout(null);
        panel.add(btn_end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while(true){
            Thread.sleep(1);
            panel.move_circle();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        STEP_10_GUI_6 main_obj = new STEP_10_GUI_6();
        System.out.println("Console thread is goint out !!!");
    }
}