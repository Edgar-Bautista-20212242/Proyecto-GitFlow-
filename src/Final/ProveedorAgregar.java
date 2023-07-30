package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProveedorAgregar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFRNC;
	private JTextField TFDIR;
	private JTextField TFTEL;

	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();
	
	public ProveedorAgregar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblProveedoresagregar = new JLabel("Proveedores/Agregar");
		lblProveedoresagregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedoresagregar.setForeground(Color.WHITE);
		lblProveedoresagregar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblProveedoresagregar.setBackground(new Color(30, 30, 30));
		lblProveedoresagregar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblProveedoresagregar);
		
		JLabel LabelID = new JLabel("ID");
		LabelID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelID.setForeground(new Color(240, 255, 255));
		LabelID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelID.setBounds(200, 140, 145, 30);
		PanelCenter.add(LabelID);
		
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
		LabelNombre.setBounds(194, 257, 145, 30);
		PanelCenter.add(LabelNombre);
		
		TFNombre = new JTextField();
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setForeground(new Color(240, 255, 255));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFNombre.setColumns(10);
		TFNombre.setBorder(null);
		TFNombre.setBackground(new Color(30, 30, 30));
		TFNombre.setBounds(194, 298, 145, 20);
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
		separator_1.setBounds(194, 329, 151, 2);
		PanelCenter.add(separator_1);
		
		JLabel lblRnc = new JLabel("RNC");
		lblRnc.setHorizontalAlignment(SwingConstants.CENTER);
		lblRnc.setForeground(new Color(240, 255, 255));
		lblRnc.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblRnc.setBounds(194, 377, 145, 30);
		PanelCenter.add(lblRnc);
		
		TFRNC = new JTextField();
		TFRNC.setText("Introduzca el  RNC");
		TFRNC.setHorizontalAlignment(SwingConstants.CENTER);
		TFRNC.setForeground(new Color(240, 255, 255));
		TFRNC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFRNC.setColumns(10);
		TFRNC.setBorder(null);
		TFRNC.setBackground(new Color(30, 30, 30));
		TFRNC.setBounds(194, 418, 145, 20);
		TFRNC.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFRNC.getText().equals("Introduzca el  RNC")) 
				{
					TFRNC.setText("");
					TFRNC.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFRNC);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1.setBounds(194, 449, 151, 2);
		PanelCenter.add(separator_1_1);
		
		JLabel LabelDir = new JLabel("Direccion");
		LabelDir.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDir.setForeground(new Color(240, 255, 255));
		LabelDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelDir.setBounds(472, 257, 145, 30);
		PanelCenter.add(LabelDir);
		
		TFDIR = new JTextField();
		TFDIR.setText("Introduzca la Direccion");
		TFDIR.setHorizontalAlignment(SwingConstants.CENTER);
		TFDIR.setForeground(new Color(240, 255, 255));
		TFDIR.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFDIR.setColumns(10);
		TFDIR.setBorder(null);
		TFDIR.setBackground(new Color(30, 30, 30));
		TFDIR.setBounds(472, 298, 145, 20);
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
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1.setBounds(472, 329, 151, 2);
		PanelCenter.add(separator_1_1_1);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setForeground(new Color(240, 255, 255));
		lblTelefono.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblTelefono.setBounds(472, 140, 145, 30);
		PanelCenter.add(lblTelefono);
		
		TFTEL = new JTextField();
		TFTEL.setText("Introduzca el telefono");
		TFTEL.setHorizontalAlignment(SwingConstants.CENTER);
		TFTEL.setForeground(new Color(240, 255, 255));
		TFTEL.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFTEL.setColumns(10);
		TFTEL.setBorder(null);
		TFTEL.setBackground(new Color(30, 30, 30));
		TFTEL.setBounds(472, 181, 145, 20);
		TFTEL.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFTEL.getText().equals("Introduzca el telefono")) 
				{
					TFTEL.setText("");
					TFTEL.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFTEL);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1_1.setBounds(472, 212, 151, 2);
		PanelCenter.add(separator_1_1_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(422, 140, 2, 311);
		PanelCenter.add(separator_1_2);
		
		PanelRound BTNAgregar = new PanelRound();
		BTNAgregar.setRoundBottomLeft(30);
		BTNAgregar.setRoundBottomRight(30);
		BTNAgregar.setRoundTopLeft(30);
		BTNAgregar.setRoundTopRight(30);
		BTNAgregar.setLayout(null);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30, 30, 30));
		BTNAgregar.setBounds(495, 406, 103, 45);
		BTNAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
	            Suplidor p = new Suplidor();
	            p.setIdSuplidor(Integer.parseInt(TFID.getText()));
	            p.setNombre(TFNombre.getText());
	            p.setRNC(TFRNC.getText());
	            p.setTelefono(TFTEL.getText());
	            p.setDireccion(TFDIR.getText());
				String Query= "Insert into Proveedor values('"+p.getIdSuplidor()+"','"+p.getNombre()+"','"+p.getRNC()+"','"+p.getTelefono()+"','"+p.getDireccion()+"')";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query); 
					 
					JOptionPane.showMessageDialog(null, "El Proveedor se ha agregado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
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
				TFDIR.setText("Introduzca la Direccion");
				TFRNC.setText("Introduzca el  RNC");
				TFTEL.setText("Introduzca el telefono");
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
		
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setForeground(new Color(240, 255, 240));
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelAg.setBackground(Color.BLACK);
		LabelAg.setBounds(0, 0, 103, 45);
		BTNAgregar.add(LabelAg);

	}

}
