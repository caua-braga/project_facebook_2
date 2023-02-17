package gui;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame
{
    public MainWindow()
    {
        this.setSize(600, 300);
        this.setTitle("Project Facebook 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getPanel();
        this.setVisible(true);
        
    }

    private void getPanel() 
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.add(panel);
        panel.add(new InitButton().getButton("COMEÇAR!"), BorderLayout.CENTER);
    }


}
