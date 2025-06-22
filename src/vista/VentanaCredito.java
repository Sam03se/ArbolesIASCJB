package vista;

import Controlador.ControladorArbolCredito;
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
        setSize(500, 400);
        setLocationRelativeTo(null);

        controlador = new ControladorArbolCredito();

        lblContexto.setText("<html>Este árbol predice si un crédito es concedido o no.<br>" +
                "Los datos que debes ingresar son:<br>" +
                "- <b>Edad</b>: Tu edad en años. Si es menor a 30, el árbol te considera un perfil joven.<br>" +
                "- <b>Ingreso</b>: Tus ingresos mensuales en dólares. Si son mayores a 50,000, el árbol lo considera un ingreso alto.<br>" +
                "- <b>Antigüedad laboral</b>: Años que llevas trabajando en el mismo lugar. Más de 5 años indica estabilidad.<br>" +
                "El árbol combina estos datos para decidir si el crédito es aprobado o no.</html>");

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
