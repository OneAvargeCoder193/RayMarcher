package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import shape.Scene;

public class Display
{
    private JFrame frame;
    private JPanel rtc;

    public Display(String title, Scene scene)
    {
        this.frame = new JFrame(title);
        this.rtc = new RayMarching(800, 600, scene);
        this.frame.add(this.rtc);
        this.frame.setSize(800, 600);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run()
    {
        this.frame.setVisible(true);
    }
}
