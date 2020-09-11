package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ConsultaUsuario extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaUsuario frame = new ConsultaUsuario();
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
	public ConsultaUsuario() {
		setTitle("Consulta de usuario");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 461, 471);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 20, 400, 40);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Usuarios");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(20, 60, 400, 100);
		getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNickname);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblApellido);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(20, 171, 400, 200);
		getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lblCursos = new JLabel("Cursos");
		lblCursos.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblCursos);
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		for(String curso:listaCursos()) {
			JButton btnCurso = new JButton(curso);
			btnCurso.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ConsultaCurso cc = new ConsultaCurso();
					cc.setCurso(curso);
					VentanaPrincipal.desktopPane.add(cc);
					cc.setVisible(true);
				}
			});
			panel_5.add(btnCurso);
		}
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lblProgramasDeFormacion = new JLabel("Programas de formacion");
		lblProgramasDeFormacion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblProgramasDeFormacion);
		
		JPanel panel_10 = new JPanel();
		panel_6.add(panel_10);
		
		for(String curso:listaProgramas()) {
			JButton btnCurso = new JButton(curso);
			btnCurso.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ConsultaProgramaFormacion cc = new ConsultaProgramaFormacion();
					cc.setPrograma(curso);
					VentanaPrincipal.desktopPane.add(cc);
					cc.setVisible(true);
				}
			});
			panel_6.add(btnCurso);
		}
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lblEdicionesDeCursos = new JLabel("Ediciones de cursos");
		lblEdicionesDeCursos.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblEdicionesDeCursos);
		
		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11);
		
		for(String curso:listaEdiciones()) {
			JButton btnCurso = new JButton(curso);
			btnCurso.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ConsultaEdicionCurso cc = new ConsultaEdicionCurso();
					cc.setEdicion(curso);
					VentanaPrincipal.desktopPane.add(cc);
					cc.setVisible(true);
				}
			});
			panel_7.add(btnCurso);
		}
		
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		
		JButton btnAceptar = new JButton("Cerrar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAceptar.setBounds(259, 383, 117, 25);
		getContentPane().add(btnAceptar);

	}
	
	private ArrayList<String> listaCursos(){
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add("Calculo 1");
		cursos.add("Calculo 2");
		cursos.add("Calculo 3");
		return cursos;
	}
	
	private ArrayList<String> listaEdiciones(){
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add("ediion 1");
		cursos.add("edicion 2");
		cursos.add("edicion 3");
		cursos.add("edicion 4");
		cursos.add("edicion 5");
		return cursos;
	}
	
	private ArrayList<String> listaProgramas(){
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add("programa 1");
		cursos.add("programa 2");
		cursos.add("programa 3");
		cursos.add("programa 3");
		return cursos;
	}
}
