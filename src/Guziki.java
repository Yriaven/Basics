import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yriaven on 04.03.17.
 */
public class Guziki {
    private JPanel abc;
    private JButton loadButton;
    private JButton saveButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton zmianaButton;
    private JButton button1;

    public Guziki() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = textField1.getText();
                comboBox1.addItem(text);

            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String x = String.valueOf(comboBox1.getSelectedItem());

              if (x=="HANA")
              {
                  textField1.setText("172.16.0.53");
              }
            }
        });
        zmianaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = String.valueOf(comboBox1.getSelectedItem());
                comboBox1.removeItem(x);
            }
        });
       ;
        button1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String x = String.valueOf(comboBox1.getSelectedItem());
                String text = textField1.getText();

                if (x!=null)
                {
               //     comboBox1.
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Guziki");
        frame.setContentPane(new Guziki().abc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
