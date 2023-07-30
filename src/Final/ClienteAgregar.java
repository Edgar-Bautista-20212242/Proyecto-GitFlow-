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
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteAgregar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFTelefono;
	private JTextField TFDIR;
	private JTextField TFCed;
	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();

	public ClienteAgregar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblClienteagregar = new JLabel("Clientes/Agregar");
		lblClienteagregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblClienteagregar.setForeground(Color.WHITE);
		lblClienteagregar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblClienteagregar.setBackground(new Color(30, 30, 30));
		lblClienteagregar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblClienteagregar);
		
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
		
		TFDIR = new JTextField();
		TFDIR.setText("Introduzca la Direccion");
		TFDIR.setHorizontalAlignment(SwingConstants.CENTER);
		TFDIR.setForeground(new Color(240, 255, 255));
		TFDIR.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFDIR.setColumns(10);
		TFDIR.setBorder(null);
		TFDIR.setBackground(new Color(30, 30, 30));
		TFDIR.setBounds(481, 181, 145, 20);
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
		separator_1_1_1.setBounds(481, 212, 151, 2);
		PanelCenter.add(separator_1_1_1);
		
		JLabel LabelCed = new JLabel("Cedula");
		LabelCed.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCed.setForeground(new Color(240, 255, 255));
		LabelCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelCed.setBounds(475, 257, 145, 30);
		PanelCenter.add(LabelCed);
		
		TFCed = new JTextField();
		TFCed.setText("Introduzca la Cedula");
		TFCed.setHorizontalAlignment(SwingConstants.CENTER);
		TFCed.setForeground(new Color(240, 255, 255));
		TFCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFCed.setColumns(10);
		TFCed.setBorder(null);
		TFCed.setBackground(new Color(30, 30, 30));
		TFCed.setBounds(475, 298, 145, 20);
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
		separator_1_1_1_1.setBounds(475, 329, 151, 2);
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
	            Cliente p = new Cliente();
	            p.setIDCliente(Integer.parseInt(TFID.getText()));
	            p.setNombre(TFNombre.getText());
	            p.setTelefono(TFTelefono.getText());
	            p.setDireccion(TFDIR.getText());
	            p.setCedula(TFCed.getText());
				String Query= "Insert into Cliente values('"+p.getID_Cliente()+"','"+p.getNombre()+"','"+p.getTelefono()+"','"+p.getDireccion()+"','"+p.getCedula()+"')";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query);
					 
					JOptionPane.showMessageDialog(null, "El Cliente se ha agregado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
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
		
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setForeground(new Color(240, 255, 240));
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelAg.setBackground(Color.BLACK);
		LabelAg.setBounds(0, 0, 103, 45);
		BTNAgregar.add(LabelAg);

	}

}
