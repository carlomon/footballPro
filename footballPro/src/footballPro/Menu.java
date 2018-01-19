package footballPro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.setForeground(Color.DARK_GRAY);
		menuBar.setBounds(0, 0, 432, 68);
		contentPane.add(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmEquipos = new JMenuItem("Equipos");
		mnMantenimiento.add(mntmEquipos);
		
		JMenu mnGestin = new JMenu("Gesti\u00F3n");
		mnGestin.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnGestin);
		
		JMenuItem mntmTraspasos = new JMenuItem("Traspasos");
		mnGestin.add(mntmTraspasos);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrarSesion.setBounds(299, 215, 121, 25);
		contentPane.add(btnCerrarSesion);
	}
}
