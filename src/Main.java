import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Form1 form1 = new Form1();
                form1.setVisible(true);
            }
        });
    }
}
