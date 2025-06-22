package vista;

import Controlador.ControladorArbol;
import modelo.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JPanel panelPrincipal;
    private JTextField txtEdad;
    private JTextField txtIngreso;
    private JTextField txtAntiguedad;
    private JButton btnPredecir;
    private JTextArea txtResultado;

    private ControladorArbol controlador;

    public VentanaPrincipal() {
        super("Árbol IA - Predicción");
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        controlador = new ControladorArbol();

        btnPredecir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarPrediccion();
            }
        });
    }

    private void procesarPrediccion() {
        try {
            int edad = Integer.parseInt(txtEdad.getText());
            double ingreso = Double.parseDouble(txtIngreso.getText());
            int antiguedad = Integer.parseInt(txtAntiguedad.getText());

            // Para este ejemplo otros datos se pasan por defecto o se amplía el form si quieres
            Datos datos = new Datos(edad, ingreso, antiguedad, "", false, false, 0);

            String resultado = controlador.procesarPrediccion(datos);
            txtResultado.setText(resultado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}
