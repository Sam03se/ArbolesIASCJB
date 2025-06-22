package vista;

import Controlador.ControladorArbolInmueble;
import modelo.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInmueble extends JFrame {
    private JPanel panelInmueble;
    private JLabel lblContexto;
    private JTextField txtMetros;
    private JComboBox<String> cmbUbicacion;
    private JButton btnPredecir;
    private JTextArea txtResultado;

    private ControladorArbolInmueble controlador;

    public VentanaInmueble() {
        super("Árbol IA - Predicción Precio Inmueble");
        setContentPane(panelInmueble);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        controlador = new ControladorArbolInmueble();

        lblContexto.setText("<html>Este árbol predice el precio estimado de un inmueble.<br>" +
                "Los datos que debes ingresar son:<br>" +
                "- <b>Metros cuadrados</b>: Tamaño del inmueble.<br>" +
                "- <b>Ubicación</b>: Zona donde está el inmueble, puede ser urbana o rural.<br>" +
                "El árbol usa estos datos para calcular un precio aproximado según reglas predefinidas.</html>");

        cmbUbicacion.addItem("urbana");
        cmbUbicacion.addItem("rural");

        btnPredecir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarPrediccion();
            }
        });
    }

    private void procesarPrediccion() {
        try {
            int metros = Integer.parseInt(txtMetros.getText());
            String ubicacion = (String) cmbUbicacion.getSelectedItem();

            Datos datos = new Datos(0, metros, 0, ubicacion, false, false, 0);

            String resultado = controlador.procesarPrediccion(datos);
            txtResultado.setText(resultado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa un valor numérico válido para metros cuadrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
