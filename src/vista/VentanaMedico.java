package vista;

import Controlador.ControladorArbolMedico;
import modelo.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMedico extends JFrame {
    private JPanel panelMedico;
    private JLabel lblContexto;
    private JCheckBox chkFiebre;
    private JCheckBox chkTos;
    private JTextField txtSaturacion;
    private JButton btnPredecir;
    private JTextArea txtResultado;

    private ControladorArbolMedico controlador;

    public VentanaMedico() {
        super("Árbol IA - Diagnóstico Médico");
        setContentPane(panelMedico);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        controlador = new ControladorArbolMedico();

        lblContexto.setText("<html>Este árbol predice un diagnóstico médico básico.<br>" +
                "Los datos que debes ingresar son:<br>" +
                "- <b>Fiebre</b>: Marca la casilla si tienes fiebre.<br>" +
                "- <b>Tos</b>: Marca la casilla si tienes tos.<br>" +
                "- <b>Saturación</b>: Porcentaje de oxígeno en sangre. Un valor menor a 90% es una emergencia.<br>" +
                "El árbol analiza estos síntomas para determinar el nivel de gravedad.</html>");

        btnPredecir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarPrediccion();
            }
        });
    }

    private void procesarPrediccion() {
        try {
            boolean fiebre = chkFiebre.isSelected();
            boolean tos = chkTos.isSelected();
            int saturacion = Integer.parseInt(txtSaturacion.getText());

            Datos datos = new Datos(0, 0, 0, "", fiebre, tos, saturacion);

            String resultado = controlador.procesarPrediccion(datos);
            txtResultado.setText(resultado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa un valor numérico válido para saturación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
