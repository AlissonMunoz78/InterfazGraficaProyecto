import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraMejorada {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        JFrame frame = new JFrame("Calculadora Mejorada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panelEntrada = new JPanel(new GridLayout(2, 2, 5, 5));
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        JLabel label1 = new JLabel("Número 1:");
        JLabel label2 = new JLabel("Número 2:");

        panelEntrada.add(label1);
        panelEntrada.add(campo1);
        panelEntrada.add(label2);
        panelEntrada.add(campo2);

        JPanel panelBotones = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton botonSuma = new JButton("Suma");
        JButton botonResta = new JButton("Resta");
        JButton botonMultiplicacion = new JButton("Multiplicación");
        JButton botonDivision = new JButton("División");

        panelBotones.add(botonSuma);
        panelBotones.add(botonResta);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(botonDivision);

        JLabel etiquetaResultado = new JLabel("Resultado: ");
        JLabel resultado = new JLabel();

        JPanel panelResultado = new JPanel();
        panelResultado.add(etiquetaResultado);
        panelResultado.add(resultado);

        frame.add(panelEntrada, BorderLayout.NORTH);
        frame.add(panelBotones, BorderLayout.CENTER);
        frame.add(panelResultado, BorderLayout.SOUTH);

        // Añadir ActionListeners para los botones
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = num1 + num2;
                resultado.setText(String.valueOf(res));
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = num1 - num2;
                resultado.setText(String.valueOf(res));
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = num1 * num2;
                resultado.setText(String.valueOf(res));
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = num1 / num2;
                resultado.setText(String.valueOf(res));
            }
        });

        frame.setVisible(true);
    }
}

