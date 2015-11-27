import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mattische on 2015-11-26.
 */
public class GUI {
    private JPanel topLevelPanel;
    private JButton btn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().topLevelPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField textField1;
    private JLabel label1;

    public GUI() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label1.setText(textField1.getText());
            }
        });
    }
}
