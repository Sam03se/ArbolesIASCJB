package vista;

import Controlador.ControladorArbolFrutaColorForma;
import modelo.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormFrutas extends JFrame {
    private JPanel panelPrincipal;
    private JComboBox<String> comboForma;
    private JComboBox<String> comboColor;
    private JButton btnEvaluar;
    private JTextArea areaResultado;

    public FormFrutas() {
        setTitle("Clasificador de Frutas");
        setContentPane(panelPrincipal);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        comboForma.setModel(new DefaultComboBoxModel<>(new String[]{"redonda", "alargada", "otra"}));
        comboColor.setModel(new DefaultComboBoxModel<>(new String[]{"rojo", "naranja", "verde", "amarillo", "otro"}));

        btnEvaluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String forma = comboForma.getSelectedItem().toString();
                String color = comboColor.getSelectedItem().toString();

                Datos fruta = new Datos(0, 0, 0, "", false, false, 0,
                        false, false, false, color, forma);

                ControladorArbolFrutaColorForma controlador = new ControladorArbolFrutaColorForma();
                String resultado = controlador.procesarPrediccion(fruta);

                areaResultado.setText(resultado);
            }
        });
    }
}
