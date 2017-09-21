import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yriaven on 12.03.17.
 */
public class Srednia {
    private JPanel abc;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;

    public Srednia() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oceny = textField1.getText();
                String [] ocenki = oceny.split(",");

                int liczbaOcen = ocenki.length;
                double sumaOcen = 0;

                for (int i = 0; i <ocenki.length ; i++) {

                    sumaOcen += Double.valueOf(ocenki[i]);

                }

                double SredniaOcen = sumaOcen/liczbaOcen;

                textField2.setText(String.valueOf(SredniaOcen));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Srednia");
        frame.setContentPane(new Srednia().abc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //test
    }
}
