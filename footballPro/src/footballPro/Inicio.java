package footballPro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField usuarioTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					Conexion e = new Conexion();
					e.AbrirConexion();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduzca usuario y contraseña:");
		lblNewLabel.setBounds(96, 6, 206, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(173, 27, 52, 16);
		contentPane.add(lblNewLabel_1);
		
		usuarioTxt = new JTextField();
		usuarioTxt.setBounds(99, 55, 201, 26);
		contentPane.add(usuarioTxt);
		usuarioTxt.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(162, 95, 75, 16);
		contentPane.add(lblContrasea);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(99, 123, 201, 26);
		contentPane.add(passwordTxt);
		
		JButton btnIniciar = new JButton("Iniciar Sesión");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = usuarioTxt.getText();
				String password = String.valueOf(passwordTxt.getPassword());
				if (usuario.equals("admin1") && password.equals("admin1")) {
					JOptionPane.showMessageDialog(null, "Datos de usuario correcto");
				}else {
					JOptionPane.showMessageDialog(null, "Datos de usuario incorrectos");
				}
			}
		});
		btnIniciar.setBounds(135, 161, 128, 29);
		contentPane.add(btnIniciar);
	}
}
