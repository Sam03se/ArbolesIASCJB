package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {
    private JPanel panelMenu;
    private JLabel lblTitulo;
    private JButton btnCredito;
    private JButton btnMedico;
    private JButton btnInmueble;
    private JButton btnFrutas;

    public VentanaMenu() {
        super("Árbol de IA - Menú Principal");
        setContentPane(panelMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Acción del botón de crédito
        btnCredito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaCredito ventana = new VentanaCredito();
                ventana.setVisible(true);
            }
        });

        // Acción del botón de diagnóstico médico
        btnMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMedico ventana = new VentanaMedico();
                ventana.setVisible(true);
            }
        });

        // Acción del botón de predicción inmobiliaria
        btnInmueble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaInmueble ventana = new VentanaInmueble();
                ventana.setVisible(true);
            }
        });

        btnFrutas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormFrutas ventana = new FormFrutas();
                ventana.setVisible(true);
            }
        });
    }
}
