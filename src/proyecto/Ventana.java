package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_2;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_21;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 834, 411);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Insertar Coche", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(189, 50, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(51, 53, 68, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNumeroDeBastidor = new JLabel("Color");
		lblNumeroDeBastidor.setBounds(51, 104, 128, 14);
		panel.add(lblNumeroDeBastidor);
		
		JLabel lblIdSerie = new JLabel("Numero de Asientos");
		lblIdSerie.setBounds(51, 130, 143, 14);
		panel.add(lblIdSerie);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(51, 154, 46, 14);
		panel.add(lblPrecio);
		
		JLabel lblNumeroDeAsientos = new JLabel("id serie");
		lblNumeroDeAsientos.setBounds(51, 179, 118, 14);
		panel.add(lblNumeroDeAsientos);
		
		JLabel lblNumeroDePuertas = new JLabel("Numero de puertas");
		lblNumeroDePuertas.setBounds(51, 204, 118, 14);
		panel.add(lblNumeroDePuertas);
		
		JLabel lblCapacidadDelMaletero = new JLabel("Capacidad del maletero");
		lblCapacidadDelMaletero.setBounds(51, 229, 143, 14);
		panel.add(lblCapacidadDelMaletero);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 76, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 102, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 128, 86, 20);
		panel.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 177, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(189, 202, 86, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(189, 226, 86, 20);
		panel.add(textField_7);

		
		
		// BOTON AÑADIR COCHE
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion con = new Conexion();
				con.conectar();
//				 VALUES ('1030FDD', '56783RT', 'Gris', '4', '7890', '1', '2', '50');
				//insert into coches (matricula,id_serie,num_bastidor,color,precio,num_asientos,num_puertas,capacidad_maletero) values ("12424T",1, "23542345","rojo",1000,5,5,300);
				con.agregar("INSERT INTO coches (matricula, numBastidor, color, numAsientos, precio, id_serie, numPuertas, capacidadMaletero) values (" 
				+ "'"+textField.getText()+"', '"+textField_1.getText()+"', '"+textField_2.getText()+"', '"+textField_3.getText()+"', '"+textField_4.getText()+"', '"+textField_5.getText()+"', '"+textField_6.getText()+"', '"+textField_7.getText()+"')");
			}
		});
		btnNewButton.setBounds(51, 317, 89, 23);
		panel.add(btnNewButton);
		//Eliminar coche
		JButton btnVender = new JButton("Eliminar");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DELETE FROM coches WHERE matricula="555";
				Conexion con = new Conexion();
				con.conectar();
				con.agregar("DELETE FROM coches WHERE matricula='"+textField.getText()+"'");
				
			}
		});
		btnVender.setBounds(166, 317, 89, 23);
		panel.add(btnVender);
		//Modificar Color
		JButton btnNewButton_1_1 = new JButton("Modificar Color");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//UPDATE coches SET color="verde" WHERE matricula="3847FFT";
				Conexion con = new Conexion();
				con.conectar();
				con.agregar("UPDATE coches SET color='"+textField_2.getText()+"' WHERE matricula='"+textField.getText()+"'");
				
			}
		});
		btnNewButton_1_1.setBounds(277, 317, 128, 23);
		panel.add(btnNewButton_1_1);
		//Actualizar tablas 1
		JButton btnNewButton_1_2 = new JButton("Actualizar tablas");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// VER TABLAS
				//TABLA SERIE
				Conexion con = new Conexion();
				Connection conexion = con.conectar();
				
				String sql= "Select * from series;";
				
				Statement st;
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Id");
				model.addColumn("Marca");
				model.addColumn("Modelo");
				model.addColumn("Año de fabricacion");


				table_2.setModel(model);
				String [] dato = new String[4];
				try {
					st = conexion.createStatement();
					
					ResultSet result = st.executeQuery(sql);
					
					while(result.next()) {
						dato[0]=result.getString(1);
						dato[1]=result.getString(2);
						dato[2]=result.getString(3);
						dato[3]=result.getString(4);
						model.addRow(dato);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				//TABLA VEHICULOS
				
				String sql2= "Select * from vehiculos;";
				
				Statement st2;
				
				DefaultTableModel model2 = new DefaultTableModel();
				
				model2.addColumn("idvehiculos");
				model2.addColumn("Tipo");
				model2.addColumn("matricula");
				model2.addColumn("numBastidor");
				model2.addColumn("color");
				model2.addColumn("numAsientos");
				model2.addColumn("precio");
				model2.addColumn("id_serie");
	

				table.setModel(model2);
				String [] dato2 = new String[8];
				try {
					st2 = conexion.createStatement();
					
					ResultSet result2 = st2.executeQuery(sql2);
					
					while(result2.next()) {
						dato2[0]=result2.getString(1);
						dato2[1]=result2.getString(2);
						dato2[2]=result2.getString(3);
						dato2[3]=result2.getString(4);
						dato2[4]=result2.getString(5);
						dato2[5]=result2.getString(6);
						dato2[6]=result2.getString(7);
						dato2[7]=result2.getString(8);
						
						
						model2.addRow(dato2);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				JOptionPane.showMessageDialog(null, "Tablas actualizadas");
			}
		});
		btnNewButton_1_2.setBounds(598, 317, 165, 23);
		panel.add(btnNewButton_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 152, 86, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Numero de Bastidor");
		lblNewLabel_8_5.setBounds(51, 79, 143, 14);
		panel.add(lblNewLabel_8_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("Insertar Camiones", null, panel_1, null);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(189, 50, 86, 20);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setBounds(51, 53, 68, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNumeroDeBastidor_1 = new JLabel("Color");
		lblNumeroDeBastidor_1.setBounds(51, 104, 128, 14);
		panel_1.add(lblNumeroDeBastidor_1);
		
		JLabel lblIdSerie_1 = new JLabel("Numero de Asientos");
		lblIdSerie_1.setBounds(51, 130, 143, 14);
		panel_1.add(lblIdSerie_1);
		
		JLabel lblPrecio_1 = new JLabel("Precio");
		lblPrecio_1.setBounds(51, 154, 46, 14);
		panel_1.add(lblPrecio_1);
		
		JLabel lblNumeroDeAsientos_1 = new JLabel("id serie");
		lblNumeroDeAsientos_1.setBounds(51, 179, 118, 14);
		panel_1.add(lblNumeroDeAsientos_1);
		
		JLabel lblCarga = new JLabel("Carga");
		lblCarga.setBounds(51, 204, 118, 14);
		panel_1.add(lblCarga);
		
		JLabel lblTipoDeMercancia = new JLabel("Tipo de mercancia");
		lblTipoDeMercancia.setBounds(51, 229, 143, 14);
		panel_1.add(lblTipoDeMercancia);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(189, 76, 86, 20);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(189, 102, 86, 20);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(189, 128, 86, 20);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(189, 177, 86, 20);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(189, 202, 86, 20);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(189, 226, 86, 20);
		panel_1.add(textField_17);
		
		
		//Añadir camion
		JButton btnNewButton_1 = new JButton("A\u00F1adir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion con = new Conexion();
				con.conectar();
				con.agregar("INSERT INTO camiones (matricula, numBastidor, color, numAsientos, precio, id_serie, carga, tipoMercancia) values ('"+textField_8.getText()+"', '"+textField_12.getText()+"', "
						+ "'"+textField_13.getText()+"','"+textField_14.getText()+"',  '"+textField_21.getText()+"', '"+textField_15.getText()+"', '"+textField_16.getText()+"', '"+textField_17.getText()+"')");
				
			}
		});
		btnNewButton_1.setBounds(51, 317, 89, 23);
		panel_1.add(btnNewButton_1);
		//Eliminar camion
		JButton btnVender_1 = new JButton("Eliminar");
		btnVender_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DELETE FROM camiones WHERE matricula="555";
				Conexion con = new Conexion();
				con.conectar();
				con.agregar("DELETE FROM camiones WHERE matricula='"+textField_8.getText()+"'");
				
			}
		});
		btnVender_1.setBounds(166, 317, 89, 23);
		panel_1.add(btnVender_1);
		//Modificar color camion
		JButton btnNewButton_1_1_1 = new JButton("Modificar Color");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//UPDATE camiones SET color="verde" WHERE matricula="3847FFT";
				Conexion con = new Conexion();
				con.conectar();
				con.agregar("UPDATE camiones SET color='"+textField_13.getText()+"' WHERE matricula='"+textField_8.getText()+"'");
				
			}
		});
		btnNewButton_1_1_1.setBounds(277, 317, 128, 23);
		panel_1.add(btnNewButton_1_1_1);
		//Actualizar tablas 2
		JButton btnNewButton_1_2_1 = new JButton("Actualizar tablas");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// VER TABLAS
				//TABLA SERIE
				Conexion con = new Conexion();
				Connection conexion = con.conectar();
				
				String sql= "Select * from series;";
				
				Statement st;
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Id");
				model.addColumn("Marca");
				model.addColumn("Modelo");
				model.addColumn("Año de fabricacion");


				table_2.setModel(model);
				String [] dato = new String[4];
				try {
					st = conexion.createStatement();
					
					ResultSet result = st.executeQuery(sql);
					
					while(result.next()) {
						dato[0]=result.getString(1);
						dato[1]=result.getString(2);
						dato[2]=result.getString(3);
						dato[3]=result.getString(4);
						model.addRow(dato);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				//TABLA VEHICULOS
				
				String sql2= "Select * from vehiculos;";
				
				Statement st2;
				
				DefaultTableModel model2 = new DefaultTableModel();
				
				model2.addColumn("idvehiculos");
				model2.addColumn("Tipo");
				model2.addColumn("matricula");
				model2.addColumn("numBastidor");
				model2.addColumn("color");
				model2.addColumn("numAsientos");
				model2.addColumn("precio");
				model2.addColumn("id_serie");
	

				table.setModel(model2);
				String [] dato2 = new String[8];
				try {
					st2 = conexion.createStatement();
					
					ResultSet result2 = st2.executeQuery(sql2);
					
					while(result2.next()) {
						dato2[0]=result2.getString(1);
						dato2[1]=result2.getString(2);
						dato2[2]=result2.getString(3);
						dato2[3]=result2.getString(4);
						dato2[4]=result2.getString(5);
						dato2[5]=result2.getString(6);
						dato2[6]=result2.getString(7);
						dato2[7]=result2.getString(8);
						
						
						model2.addRow(dato2);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				JOptionPane.showMessageDialog(null, "Tablas actualizadas");
			}
		});
		btnNewButton_1_2_1.setBounds(598, 317, 165, 23);
		panel_1.add(btnNewButton_1_2_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(189, 152, 86, 20);
		panel_1.add(textField_21);
		
		JLabel lblNewLabel_8_5_1 = new JLabel("Numero de Bastidor");
		lblNewLabel_8_5_1.setBounds(51, 79, 143, 14);
		panel_1.add(lblNewLabel_8_5_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Tabla de series", null, panel_3, null);
		panel_3.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(10, 39, 560, 316);
		panel_3.add(table_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Vehiculos en stock", null, panel_2, null);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 113, 809, 323);
		panel_2.add(table);
		

		
		// VER TABLAS
		//TABLA SERIE
		Conexion con = new Conexion();
		Connection conexion = con.conectar();
		
		String sql= "Select * from series;";
		
		Statement st;
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Id");
		model.addColumn("Marca");
		model.addColumn("Modelo");
		model.addColumn("Año de fabricacion");


		table_2.setModel(model);
		
		JLabel lblNewLabel_8_1 = new JLabel("Marca");
		lblNewLabel_8_1.setBounds(595, 126, 46, 14);
		panel_3.add(lblNewLabel_8_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(707, 123, 86, 20);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_8_2 = new JLabel("Modelo");
		lblNewLabel_8_2.setBounds(595, 151, 46, 14);
		panel_3.add(lblNewLabel_8_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(707, 148, 86, 20);
		panel_3.add(textField_10);
		
		JLabel lblNewLabel_8_3 = new JLabel("A\u00F1o de fabricacion");
		lblNewLabel_8_3.setBounds(595, 176, 118, 14);
		panel_3.add(lblNewLabel_8_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(707, 173, 86, 20);
		panel_3.add(textField_11);
		//Añadir nueva serie
		JButton btnNuevaSerie = new JButton("Nueva serie");
		btnNuevaSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexion con = new Conexion();
				con.conectar();
				//insert into coches (matricula,id_serie,num_bastidor,color,precio,num_asientos,num_puertas,capacidad_maletero) values ("12424T",1, "23542345","rojo",1000,5,5,300);
				con.agregar("insert into series(marca, modelo, anoFabricacion) values ('"+textField_9.getText()+"', '"+textField_10.getText()+"', '"+textField_11.getText()+"');");
				
			}
		});
		btnNuevaSerie.setBounds(595, 202, 101, 23);
		panel_3.add(btnNuevaSerie);
		//Actualizar tablas 3
		JButton btnNewButton_1_2_2 = new JButton("Actualizar tablas");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// VER TABLAS
				//TABLA SERIE
				Conexion con = new Conexion();
				Connection conexion = con.conectar();
				
				String sql= "Select * from series;";
				
				Statement st;
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Id");
				model.addColumn("Marca");
				model.addColumn("Modelo");
				model.addColumn("Año de fabricacion");


				table_2.setModel(model);
				String [] dato = new String[4];
				try {
					st = conexion.createStatement();
					
					ResultSet result = st.executeQuery(sql);
					
					while(result.next()) {
						dato[0]=result.getString(1);
						dato[1]=result.getString(2);
						dato[2]=result.getString(3);
						dato[3]=result.getString(4);
						model.addRow(dato);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				//TABLA VEHICULOS
				
				String sql2= "Select * from vehiculos;";
				
				Statement st2;
				
				DefaultTableModel model2 = new DefaultTableModel();
				
				model2.addColumn("idvehiculos");
				model2.addColumn("Tipo");
				model2.addColumn("matricula");
				model2.addColumn("numBastidor");
				model2.addColumn("color");
				model2.addColumn("numAsientos");
				model2.addColumn("precio");
				model2.addColumn("id_serie");
	

				table.setModel(model2);
				String [] dato2 = new String[8];
				try {
					st2 = conexion.createStatement();
					
					ResultSet result2 = st2.executeQuery(sql2);
					
					while(result2.next()) {
						dato2[0]=result2.getString(1);
						dato2[1]=result2.getString(2);
						dato2[2]=result2.getString(3);
						dato2[3]=result2.getString(4);
						dato2[4]=result2.getString(5);
						dato2[5]=result2.getString(6);
						dato2[6]=result2.getString(7);
						dato2[7]=result2.getString(8);
						
						
						model2.addRow(dato2);
					}
					
				}catch (SQLException ex) {
					System.out.println("Fallo tabla");
				}
				JOptionPane.showMessageDialog(null, "Tablas actualizadas");	
				
			}
		});
		btnNewButton_1_2_2.setBounds(617, 297, 165, 23);
		panel_3.add(btnNewButton_1_2_2);
		String [] dato = new String[4];
		try {
			st = conexion.createStatement();
			
			ResultSet result = st.executeQuery(sql);
			
			while(result.next()) {
				dato[0]=result.getString(1);
				dato[1]=result.getString(2);
				dato[2]=result.getString(3);
				dato[3]=result.getString(4);
				model.addRow(dato);
			}
			
		}catch (SQLException ex) {
			System.out.println("Fallo tabla");
		}
//TABLA VEHICULOS
		
		String sql2= "Select * from vehiculos;";
		
		Statement st2;
		
		DefaultTableModel model2 = new DefaultTableModel();
		
		model2.addColumn("idvehiculos");
		model2.addColumn("Tipo");
		model2.addColumn("matricula");
		model2.addColumn("numBastidor");
		model2.addColumn("color");
		model2.addColumn("numAsientos");
		model2.addColumn("precio");
		model2.addColumn("id_serie");


		table.setModel(model2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 809, 361);
		panel_2.add(scrollPane_1);
		String [] dato2 = new String[8];
		try {
			st2 = conexion.createStatement();
			
			ResultSet result2 = st2.executeQuery(sql2);
			
			while(result2.next()) {
				dato2[0]=result2.getString(1);
				dato2[1]=result2.getString(2);
				dato2[2]=result2.getString(3);
				dato2[3]=result2.getString(4);
				dato2[4]=result2.getString(5);
				dato2[5]=result2.getString(6);
				dato2[6]=result2.getString(7);
				dato2[7]=result2.getString(8);
				
				
				model2.addRow(dato2);
			}
			
		}catch (SQLException ex) {
			System.out.println("Fallo tabla");
		}
		//Scrol panel de la tabla series
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 50, 475, 280);
		panel_3.add(scrollPane);
		scrollPane.setViewportView(table_2);
		panel_2.add(scrollPane_1);
		scrollPane_1.setViewportView(table);

		
		
	}
}
