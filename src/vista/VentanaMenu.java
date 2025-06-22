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

    public VentanaMenu() {
        super("Árbol de IA - Menú Principal");
        setContentPane(panelMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        btnCredito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaCredito ventana = new VentanaCredito();
                ventana.setVisible(true);
            }
        });

        btnMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMedico ventana = new VentanaMedico();
                ventana.setVisible(true);
            }
        });

        btnInmueble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaInmueble ventana = new VentanaInmueble();
                ventana.setVisible(true);
            }
        });
    }
}
