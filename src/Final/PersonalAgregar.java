package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonalAgregar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFTelefono;
	private JTextField TFDIR;
	private JTextField TFCed;
	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();


	public PersonalAgregar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		PanelCenter.setLayout(null);
		
		JLabel lblPersonalagregar = new JLabel("Personal/Agregar");
		lblPersonalagregar.setBounds(0, 0, 780, 68);
		lblPersonalagregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalagregar.setForeground(Color.WHITE);
		lblPersonalagregar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblPersonalagregar.setBackground(new Color(30, 30, 30));
		PanelCenter.add(lblPersonalagregar);
		
		JLabel LabelID = new JLabel("ID");
		LabelID.setBounds(200, 140, 145, 30);
		LabelID.setForeground(new Color(240, 255, 255));
		LabelID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelID.setHorizontalAlignment(SwingConstants.CENTER);
		PanelCenter.add(LabelID);
		
		TFID = new JTextField();
	
		TFID.setBounds(200, 181, 145, 20);
		TFID.setBorder(null);
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setBackground(new Color(30,30,30));
		TFID.setText("Introduzca el ID");
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFID.setForeground(new Color(240, 255, 255));
		TFID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFID.getText().equals("Introduzca el ID")) 
				{
					TFID.setText("");
					TFID.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFID);
		TFID.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(200, 212, 151, 2);
		separator.setForeground(Color.BLACK);
		separator.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator);
		
		JLabel LabelNombre = new JLabel("Nombre");
		LabelNombre.setBounds(194, 265, 145, 30);
		LabelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNombre.setForeground(new Color(240, 255, 255));
		LabelNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		PanelCenter.add(LabelNombre);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(194, 306, 145, 20);
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setForeground(new Color(240, 255, 255));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFNombre.setColumns(10);
		TFNombre.setBorder(null);
		TFNombre.setBackground(new Color(30, 30, 30));
		TFNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFNombre.getText().equals("Introduzca el Nombre")) 
				{
					TFNombre.setText("");
					TFNombre.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFNombre);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(194, 337, 151, 2);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator_1);
		
		JLabel LabelTelefono = new JLabel("Telefono");
		LabelTelefono.setBounds(194, 377, 145, 30);
		LabelTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTelefono.setForeground(new Color(240, 255, 255));
		LabelTelefono.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		PanelCenter.add(LabelTelefono);
		
		TFTelefono = new JTextField();
		TFTelefono.setBounds(194, 418, 145, 20);
		TFTelefono.setText("Introduzca el  Telefono");
		TFTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		TFTelefono.setForeground(new Color(240, 255, 255));
		TFTelefono.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFTelefono.setColumns(10);
		TFTelefono.setBorder(null);
		TFTelefono.setBackground(new Color(30, 30, 30));
		TFTelefono.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFTelefono.getText().equals("Introduzca el  Telefono")) 
				{
					TFTelefono.setText("");
					TFTelefono.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFTelefono);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(194, 449, 151, 2);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator_1_1);
		
		JLabel LabelDir = new JLabel("Direccion");
		LabelDir.setBounds(481, 140, 145, 30);
		LabelDir.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDir.setForeground(new Color(240, 255, 255));
		LabelDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		PanelCenter.add(LabelDir);
		
		TFDIR = new JTextField();
		TFDIR.setBounds(481, 181, 145, 20);
		TFDIR.setText("Introduzca la Direccion");
		TFDIR.setHorizontalAlignment(SwingConstants.CENTER);
		TFDIR.setForeground(new Color(240, 255, 255));
		TFDIR.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFDIR.setColumns(10);
		TFDIR.setBorder(null);
		TFDIR.setBackground(new Color(30, 30, 30));
		TFDIR.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFDIR.getText().equals("Introduzca la Direccion")) 
				{
					TFDIR.setText("");
					TFDIR.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFDIR);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(481, 212, 151, 2);
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator_1_1_1);
		
		JLabel LabelCed = new JLabel("Cedula");
		LabelCed.setBounds(475, 265, 145, 30);
		LabelCed.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCed.setForeground(new Color(240, 255, 255));
		LabelCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		PanelCenter.add(LabelCed);
		
		TFCed = new JTextField();
		TFCed.setBounds(475, 306, 145, 20);
		TFCed.setText("Introduzca la Cedula");
		TFCed.setHorizontalAlignment(SwingConstants.CENTER);
		TFCed.setForeground(new Color(240, 255, 255));
		TFCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFCed.setColumns(10);
		TFCed.setBorder(null);
		TFCed.setBackground(new Color(30, 30, 30));
		TFCed.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFCed.getText().equals("Introduzca la Cedula")) 
				{
					TFCed.setText("");
					TFCed.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFCed);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(475, 337, 151, 2);
		separator_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator_1_1_1_1);
		
		JLabel LabelRol = new JLabel("Rol");
		LabelRol.setBounds(475, 377, 145, 30);
		LabelRol.setHorizontalAlignment(SwingConstants.CENTER);
		LabelRol.setForeground(new Color(240, 255, 255));
		LabelRol.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		PanelCenter.add(LabelRol);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(422, 140, 2, 311);
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		PanelCenter.add(separator_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(487, 429, 139, 22);
		comboBox.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Administrador"}));
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(240, 248, 255));
		PanelCenter.add(comboBox);
		
		PanelRound BTNAgregar = new PanelRound();
		BTNAgregar.setRoundBottomLeft(30);
		BTNAgregar.setRoundBottomRight(30);
		BTNAgregar.setRoundTopLeft(30);
		BTNAgregar.setRoundTopRight(30);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30, 30, 30));
		BTNAgregar.setBounds(365, 501, 103, 45);
		BTNAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
	            Personal p = new Personal();
	            p.setID(Integer.parseInt(TFID.getText()));
	            p.setNommbre(TFNombre.getText());
	            p.setTelefono(TFTelefono.getText());
	            p.setDireccion(TFDIR.getText());
	            p.setRol(comboBox.getSelectedItem().toString());
	            p.setCedula(TFCed.getText());
				String Query= "Insert into Personal values('"+p.getID()+"','"+p.getNommbre()+"','"+p.getTelefono()+"','"+p.getDireccion()+"','"+p.getRol()+"','"+p.getCedula()+"')";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query); 
					 
					JOptionPane.showMessageDialog(null, "El Personal se ha agregado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
				} finally 
				{
					try {
					if (Con!=null) 
					{
						Con.close();
					}if (STM!=null) 
					{
							STM.close();
						
					}if (rs!=null) 
					{
						rs.close();
					}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}	
				}
				TFID.setText("Introduzca el ID");
				TFNombre.setText("Introduzca el Nombre");
				TFTelefono.setText("Introduzca el  Telefono");
				TFDIR.setText("Introduzca la Direccion");
				TFCed.setText("Introduzca la Cedula");
			}
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNAgregar.setBackground(new Color(41, 41, 41 ));
			
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
			
				BTNAgregar.setBackground(new Color(30,30,30));
			}
		});
		PanelCenter.add(BTNAgregar);
		BTNAgregar.setLayout(null);
		
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setBackground(new Color(0, 0, 0));
		LabelAg.setForeground(new Color(240, 255, 240));
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setBounds(0, 0, 103, 45);
		BTNAgregar.add(LabelAg);

	}

}
