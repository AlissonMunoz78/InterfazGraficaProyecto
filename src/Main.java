import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        String primerNumero = JOptionPane.showInputDialog("Introduce el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduce el segundo entero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        JOptionPane.showMessageDialog(null, "El resultado es: " + suma, "suma de dos enteros", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog("El resultado es: "+resta);

}}