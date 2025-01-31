package vista;
import API.*;
import logica.*;
import API.datatypes.*;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ConsultaProgramaFormacion extends JInternalFrame {
	private DTFormacion programaElegido;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String programa;
	private ILogica Interfaz = new BizcochoEnARG().getInterface();
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProgramaFormacion frame = new ConsultaProgramaFormacion();
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
	public ConsultaProgramaFormacion() {
		setTitle("Consulta de programa de formacion");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 619, 469);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 12, 400, 20);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblProgramasDeFormacion = new JLabel("Programas de formacion");
		lblProgramasDeFormacion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblProgramasDeFormacion);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JComboBox comboBox = new JComboBox();
//		comboBox.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				programa = e.getItem().toString();
//				List<DTFormacion> formaciones = Interfaz.consultaFormacion();
//				for(DTFormacion programa: formaciones) {
//					comboBox.addItem(programa.nombreFormacion);
//				}
//				for(DTFormacion form : formaciones) {
//					if(form.nombreFormacion.equals(programa)) {
//						programaElegido = form;
//					}
//				}
//				//Nombre
//					textField.setText(programaElegido.nombreFormacion);
//					//Fecha inicio
//					textField_1.setText(programaElegido.fechaInicio.toString());
//					//Fecha fin
//					textField_2.setText(programaElegido.fechaFin.toString());
//					//Descripcion
//					textArea.setText(programaElegido.descFormacion);
//			}
//		});
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(35, 59, 400, 100);
		getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNombre);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descripcion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		panel_3.add(textArea);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblFechaInicio);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFechaFin = new JLabel("Fecha fin");
		lblFechaFin.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblFechaFin);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(460, 388, 117, 25);
		getContentPane().add(btnCerrar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(35, 171, 400, 140);
		getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{195, 200, 0};
		gbl_panel_4.rowHeights = new int[]{140, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Cursos");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_4.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 0;
		panel_4.add(panel_5, gbc_panel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		panel_5.setLayout(gl_panel_5);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				List<DTFormacion> formaciones = Interfaz.consultaFormacion();
				for(DTFormacion formacion : formaciones)
				{
					comboBox.addItem(formacion.nombreFormacion);
				}
			}
		});
		btnNewButton.setBounds(460, 12, 120, 23);
		getContentPane().add(btnNewButton);
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(35, 323, 400, 57);
		getContentPane().add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 6;
		gbc_comboBox_2.gridy = 0;
		panel_6.add(comboBox_2, gbc_comboBox_2);
		
		JButton btnNewButton_1 = new JButton("Ver datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				List<DTFormacion> formaciones = Interfaz.consultaFormacion();
				for(DTFormacion formacion : formaciones)
				{
					if(formacion.nombreFormacion.equals(comboBox.getSelectedItem().toString()))
					{
						Calendar c1 = Calendar.getInstance();
						c1.setTime(formacion.fechaInicio);
						String dia = Integer.toString(c1.get(Calendar.DAY_OF_MONTH));
						String mes = Integer.toString(c1.get(Calendar.MONTH) + 1);
						String anio = Integer.toString(c1.get(Calendar.YEAR));
						String dou=(dia + "-" + mes + "-" + anio);
						Calendar c = Calendar.getInstance();
						c1.setTime(formacion.fechaFin);
						String diaa = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
						String mess = Integer.toString(c.get(Calendar.MONTH) + 1);
						String anioo = Integer.toString(c.get(Calendar.YEAR));
						String douu=(diaa + "-" + mess + "-" + anioo);
						textField.setText(formacion.nombreFormacion);
						//Fecha inicio
						textField_1.setText(dou);
						//Fecha fin
						textField_2.setText(douu);
						//Descripcion
						textArea.setText(formacion.descFormacion);
						
						List<DTCurso> cursos = formacion.cursos;
						for(DTCurso curso : cursos)
						{
							comboBox_1.addItem(curso.nombreCurso);
						}
						if(cursos.isEmpty()) {
							
						}
						List<DTCategoria> lcats = null;
						lcats = Interfaz.listaCatDeFormacion(formacion.nombreFormacion);
						for(DTCategoria cats: lcats) {
							comboBox_2.addItem(cats.nombreCategoria);
						}
					}
				}
			}
		});
		btnNewButton_1.setBounds(460, 59, 120, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ver curso");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String cur = comboBox_1.getSelectedItem().toString();
					DTCurso curso = Interfaz.obtenerCurso(cur);
					Calendar c1 = Calendar.getInstance();
					c1.setTime(curso.fechaAlta);
					String dia = Integer.toString(c1.get(Calendar.DAY_OF_MONTH));
					String mes = Integer.toString(c1.get(Calendar.MONTH) + 1);
					String anio = Integer.toString(c1.get(Calendar.YEAR));
					String dou=(dia + "-" + mes + "-" + anio);
					String categorias = "\nCategorias:";
					List<DTCategoria> cat = curso.categorias;
					for(DTCategoria c:cat) {
						categorias+=" " + c.nombreCategoria+" ";
					}
					JOptionPane.showMessageDialog(null,"Curso: "+curso.nombreCurso+"\n"+"Descripcion: "+curso.descCurso+"\n"+"Fecha alta: "+dou+"\n"+"Cantidad horas: "+curso.cantidadHoras+"Cantidad creditos: "+curso.cantidadCreditos+"\n"+"Duracion en semanas: "+curso.duracionMeses+ categorias);
			}
		});
		btnNewButton_2.setBounds(460, 171, 120, 23);
		getContentPane().add(btnNewButton_2);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Categorias");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		
		ArrayList<JButton> botones = new ArrayList<>();
//		List<DTCurso> cursos = listaCursos();
//		for(DTCurso curso: cursos) {
//			botones.add(new JButton(curso.nombreCurso));
//		}
		
		for(JButton boton: botones) {
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(boton.getLabel());
					ConsultaCurso cc = new ConsultaCurso();
					cc.setCurso(boton.getLabel());
					VentanaPrincipal.desktopPane.add(cc);
					cc.setVisible(true);
				}
			});
			panel_5.add(boton);
		}
		
	}
	
	private List<DTFormacion> listaProgramas() {
		List<DTFormacion> lista = Interfaz.consultaFormacion();
		return lista;
	}
	
	private List<DTCurso> listaCursos() {
		List<DTFormacion> lista = Interfaz.consultaFormacion();
		List<DTCurso> listaCursos = null;
		for(DTFormacion form:lista) {
			if(form.nombreFormacion.equals(programa)) {
				listaCursos = form.cursos;
			}
		}
		return listaCursos;
	}
	
	public void setPrograma(String programa) {
		this.programa = programa;
	}
}
