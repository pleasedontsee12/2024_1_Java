import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel1 extends JPanel{
    final int Up = 0, Dn = 1, Rt = 2, Lt = 3;
    int i = 0;
    private int x1 = 150, y1 = 150;
    private int x2 = 150, y2 = 150;
    
    MyPanel1(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(400,400));
    }

    public void paintComponent(Graphics g){
        i++;
        super.paintComponent(g);

        g.setColor(Color.red);
        g.drawOval(x1,y1,50,50);
        
        g.setColor(Color.cyan);
        g.drawOval(x2,y2,100,100);
        
        if(i % 2 == 0){
            g.setColor(Color.magenta);
            g.drawRect(5,5,50,50);
            g.drawRect(330,5,50,50);
            g.drawRect(5,330,50,50);
            g.drawRect(330,330,50,50);
            System.out.println("Draw!!!");
        }
        
    }

    public void move_circle() {
        move_single_circle(x1, y1, true); // 첫 번째 원 움직이기
        move_single_circle(x2, y2, false); // 두 번째 원 움직이기
        repaint();
    }

   private void move_single_circle(int x, int y, boolean isFirst){
        int ewsn = (int) (Math.random() * 1000) % 4;
        int disp = (int) (Math.random() * 1000) % 3;

        switch (ewsn) {
            case Up:
                y -= disp;
                if (y < 0) y = 0;
                break;
            case Dn:
                y += disp;
                if (350 - 50 < y) y = 350 - 50;
                break;
            case Rt:
                x += disp;
                if (400 - 50 < x) x = 400 - 50;
                break;
            case Lt:
                x -= disp;
                if (x < 0) x = 0;
                break;
        }

        if (isFirst) {
            x1 = x;
            y1 = y;
        } else {
            x2 = x;
            y2 = y;
        }
    }
}

public class STEP_10_GUI_6_2Circle{
    STEP_10_GUI_6_2Circle() throws InterruptedException{
        JFrame frame = new JFrame();
        MyPanel1 panel = new MyPanel1();
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
        STEP_10_GUI_6_2Circle main_obj = new STEP_10_GUI_6_2Circle();
        System.out.println("Console thread is goint out !!!");
    }
}