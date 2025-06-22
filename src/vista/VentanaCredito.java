package vista;

import controlador.ControladorArbolCredito;
import modelo.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCredito extends JFrame {
    private JPanel panelCredito;
    private JLabel lblContexto;
    private JTextField txtEdad;
    private JTextField txtIngreso;
    private JTextField txtAntiguedad;
    private JButton btnPredecir;
    private JTextArea txtResultado;

    private ControladorArbolCredito controlador;

    public VentanaCredito() {
        super("Árbol IA - Concesión de Crédito");
        setContentPane(panelCredito);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        controlador = new ControladorArbolCredito();

        lblContexto.setText("<html>Este árbol predice la concesión de un crédito.<br>" +
                "Ingrese los datos requeridos y pulse 'Predecir'.</html>");

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

            Datos datos = new Datos(edad, ingreso, antiguedad, "", false, false, 0);

            String resultado = controlador.procesarPrediccion(datos);
            txtResultado.setText(resultado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
