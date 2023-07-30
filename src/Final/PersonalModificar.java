package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;



import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonalModificar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFTelefono;
	private JTextField TFDir;
	private JTextField TFCed;
	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();

	
	public PersonalModificar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblPersonalmodificar = new JLabel("Personal/Modificar");
		lblPersonalmodificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalmodificar.setForeground(Color.WHITE);
		lblPersonalmodificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblPersonalmodificar.setBackground(new Color(30, 30, 30));
		lblPersonalmodificar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblPersonalmodificar);
		
		JLabel lblIdDelCampo = new JLabel("ID del personal  a modificar");
		lblIdDelCampo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdDelCampo.setForeground(new Color(240, 255, 255));
		lblIdDelCampo.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblIdDelCampo.setBounds(194, 140, 197, 30);
		PanelCenter.add(lblIdDelCampo);
		
		TFID = new JTextField();
		TFID.setText("Introduzca el ID");
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setForeground(new Color(240, 255, 255));
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFID.setColumns(10);
		TFID.setBorder(null);
		TFID.setBackground(new Color(30, 30, 30));
		TFID.setBounds(200, 181, 145, 20);
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
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(SystemColor.controlDkShadow);
		separator.setBounds(200, 212, 151, 2);
		PanelCenter.add(separator);
		
		JLabel LabelNombre = new JLabel("Nombre");
		LabelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNombre.setForeground(new Color(240, 255, 255));
		LabelNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelNombre.setBounds(194, 252, 145, 30);
		PanelCenter.add(LabelNombre);
		
		TFNombre = new JTextField();
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setForeground(new Color(240, 255, 255));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFNombre.setColumns(10);
		TFNombre.setBorder(null);
		TFNombre.setBackground(new Color(30, 30, 30));
		TFNombre.setBounds(194, 293, 145, 20);
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
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(SystemColor.controlDkShadow);
		separator_1.setBounds(194, 324, 151, 2);
		PanelCenter.add(separator_1);
		
		JLabel LabelTelefono = new JLabel("Telefono");
		LabelTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTelefono.setForeground(new Color(240, 255, 255));
		LabelTelefono.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelTelefono.setBounds(194, 377, 145, 30);
		PanelCenter.add(LabelTelefono);
		
		TFTelefono = new JTextField();
		TFTelefono.setText("Introduzca el  Telefono");
		TFTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		TFTelefono.setForeground(new Color(240, 255, 255));
		TFTelefono.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFTelefono.setColumns(10);
		TFTelefono.setBorder(null);
		TFTelefono.setBackground(new Color(30, 30, 30));
		TFTelefono.setBounds(194, 418, 145, 20);
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
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1.setBounds(194, 449, 151, 2);
		PanelCenter.add(separator_1_1);
		
		JLabel LabelDir = new JLabel("Direccion");
		LabelDir.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDir.setForeground(new Color(240, 255, 255));
		LabelDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelDir.setBounds(481, 140, 145, 30);
		PanelCenter.add(LabelDir);
		
		TFDir = new JTextField();
		TFDir.setText("Introduzca la Direccion");
		TFDir.setHorizontalAlignment(SwingConstants.CENTER);
		TFDir.setForeground(new Color(240, 255, 255));
		TFDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFDir.setColumns(10);
		TFDir.setBorder(null);
		TFDir.setBackground(new Color(30, 30, 30));
		TFDir.setBounds(481, 181, 145, 20);
		TFDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFDir.getText().equals("Introduzca la Direccion")) 
				{
					TFDir.setText("");
					TFDir.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFDir);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1.setBounds(481, 212, 151, 2);
		PanelCenter.add(separator_1_1_1);
		
		JLabel LabelCed = new JLabel("Cedula");
		LabelCed.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCed.setForeground(new Color(240, 255, 255));
		LabelCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelCed.setBounds(475, 252, 145, 30);
		PanelCenter.add(LabelCed);
		
		TFCed = new JTextField();
		TFCed.setText("Introduzca la Cedula");
		TFCed.setHorizontalAlignment(SwingConstants.CENTER);
		TFCed.setForeground(new Color(240, 255, 255));
		TFCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFCed.setColumns(10);
		TFCed.setBorder(null);
		TFCed.setBackground(new Color(30, 30, 30));
		TFCed.setBounds(475, 293, 145, 20);
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
		separator_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1_1.setBounds(475, 324, 151, 2);
		PanelCenter.add(separator_1_1_1_1);
		
		JLabel LabelRol = new JLabel("Rol");
		LabelRol.setHorizontalAlignment(SwingConstants.CENTER);
		LabelRol.setForeground(new Color(240, 255, 255));
		LabelRol.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelRol.setBounds(475, 377, 145, 30);
		PanelCenter.add(LabelRol);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(422, 140, 2, 311);
		PanelCenter.add(separator_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Empleado", "Administrador"}));
		comboBox.setForeground(new Color(240, 248, 255));
		comboBox.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		comboBox.setBackground(Color.BLACK);
		comboBox.setBounds(487, 429, 139, 22);
		PanelCenter.add(comboBox);
		
		PanelRound BTNModificar = new PanelRound();
		BTNModificar.setRoundBottomLeft(30);
		BTNModificar.setRoundBottomRight(30);
		BTNModificar.setRoundTopLeft(30);
		BTNModificar.setRoundTopRight(30);
		BTNModificar.setLayout(null);
		BTNModificar.setBorder(null);
		BTNModificar.setBackground(new Color(30, 30, 30));
		BTNModificar.setBounds(365, 501, 103, 45);
		BTNModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{
                     Personal p = new Personal();
                     p.setID(Integer.parseInt(TFID.getText()));
                     p.setNommbre(TFNombre.getText());
                     p.setTelefono(TFTelefono.getText());
                     p.setDireccion(TFDir.getText());
                     p.setCedula(TFCed.getText());
                     p.setRol(comboBox.getSelectedItem().toString());
        
		            String Query="Update Personal Set Nombre='"+p.getNommbre()+"',Telefono='"+p.getTelefono()+"',Direccion='"+p.getDireccion()+"',Cedula='"+p.getCedula()+"',Rol='"+p.getRol()+"' where IdPersonal="+p.getID()+"";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query); 
					 
					JOptionPane.showMessageDialog(null, "El personal se ha Modificado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
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
				TFID.setText("ID del campo a modificar");
				TFNombre.setText("Introduce el Nombre");
				TFTelefono.setText("Introduce el Telefono");
				TFDir.setText("Introduzca su Direccion");
				TFCed.setText("Introduzca la Cedula");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNModificar.setBackground(new Color(41, 41, 41 ));
			
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
			
				BTNModificar.setBackground(new Color(30,30,30));
			}
		});
		PanelCenter.add(BTNModificar);
		JLabel LabelModificar = new JLabel("Modificar");
		LabelModificar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelModificar.setForeground(new Color(240, 255, 240));
		LabelModificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelModificar.setBackground(Color.BLACK);
		LabelModificar.setBounds(0, 0, 103, 45);
		BTNModificar.add(LabelModificar);

	}

}
