import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouseListener implements MouseListener, MouseMotionListener{
    public void mouseClicked(MouseEvent e){ } 
    public void mouseEntered(MouseEvent e){ } 
    public void mouseExited(MouseEvent e){ }
    public void mousePressed(MouseEvent e){ }
    public void mouseReleased(MouseEvent e){ }
    public void mouseMoved(MouseEvent e){ }
    public void mouseDragged(MouseEvent e){
        int x = e.getX();
        int y = e.getY();

        Component cp = (Component)e.getSource();
        cp.setLocation(x + cp.getX() - 25, y + cp.getY() - 25);
    }
}

public class STEP_10_GUI_8{ 
    STEP_10_GUI_8() throws InterruptedException{
        MyMouseListener mymlsnr = new MyMouseListener();
        JFrame frame = new JFrame("GUI_10_8");
        JPanel panel = new JPanel();

        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(400,400));

        JButton btn_end = new JButton("End");
        btn_end.setBounds(165,360,70,30);
        btn_end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        ImageIcon img = new ImageIcon("Img.jpg");
        if(img == null){
            System.out.println("Image not found");
            System.exit(1);
        }

        JLabel label = new JLabel(img);
        label.setBounds(150,150,70,70);
        label.addMouseListener(mymlsnr);
        label.addMouseMotionListener(mymlsnr);

        panel.setLayout(null);
        panel.add(btn_end);
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        STEP_10_GUI_8 main_obj = new STEP_10_GUI_8();
        System.out.println("Console thread is goint out !!!");
    }
}