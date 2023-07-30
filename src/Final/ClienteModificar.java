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

public class ClienteModificar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFTEl;
	private JTextField TFDIR;
	private JTextField TFCed;
	
	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();
	
	public ClienteModificar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblClientesmodificar = new JLabel("Clientes/Modificar");
		lblClientesmodificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesmodificar.setForeground(Color.WHITE);
		lblClientesmodificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblClientesmodificar.setBackground(new Color(30, 30, 30));
		lblClientesmodificar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblClientesmodificar);
		
		JLabel lblIdDelCliente = new JLabel("ID del cliente a modificar");
		lblIdDelCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdDelCliente.setForeground(new Color(240, 255, 255));
		lblIdDelCliente.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblIdDelCliente.setBounds(194, 140, 184, 30);
		PanelCenter.add(lblIdDelCliente);
		
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
		
		TFTEl = new JTextField();
		TFTEl.setText("Introduzca el  Telefono");
		TFTEl.setHorizontalAlignment(SwingConstants.CENTER);
		TFTEl.setForeground(new Color(240, 255, 255));
		TFTEl.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFTEl.setColumns(10);
		TFTEl.setBorder(null);
		TFTEl.setBackground(new Color(30, 30, 30));
		TFTEl.setBounds(194, 418, 145, 20);
		TFTEl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFTEl.getText().equals("Introduzca el  Telefono")) 
				{
					TFTEl.setText("");
					TFTEl.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFTEl);
		
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
		LabelCed.setBounds(481, 252, 145, 30);
		PanelCenter.add(LabelCed);
		
		TFCed = new JTextField();
		TFCed.setText("Introduzca la Cedula");
		TFCed.setHorizontalAlignment(SwingConstants.CENTER);
		TFCed.setForeground(new Color(240, 255, 255));
		TFCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFCed.setColumns(10);
		TFCed.setBorder(null);
		TFCed.setBackground(new Color(30, 30, 30));
		TFCed.setBounds(481, 293, 145, 20);
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
		separator_1_1_1_1.setBounds(481, 324, 151, 2);
		PanelCenter.add(separator_1_1_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(422, 140, 2, 311);
		PanelCenter.add(separator_1_2);
		
		PanelRound BTNModificar = new PanelRound();
		BTNModificar.setRoundBottomLeft(30);
		BTNModificar.setRoundBottomRight(30);
		BTNModificar.setRoundTopLeft(30);
		BTNModificar.setRoundTopRight(30);
		BTNModificar.setLayout(null);
		BTNModificar.setBorder(null);
		BTNModificar.setBackground(new Color(30, 30, 30));
		BTNModificar.setBounds(495, 406, 103, 45);
		BTNModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{
                     Cliente p = new Cliente();
                     p.setIDCliente(Integer.parseInt(TFID.getText()));
                     p.setNombre(TFNombre.getText());
                     p.setTelefono(TFTEl.getText());
                     p.setDireccion(TFDIR.getText());
                     p.setCedula(TFCed.getText());
                   
		            String Query="Update Cliente Set Nombre='"+p.getNombre()+"',Telefono='"+p.getTelefono()+"',Direccion='"+p.getDireccion()+"',Cedula='"+p.getCedula()+"' where IdCliente='"+p.getID_Cliente()+"'";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query); 
					 
					JOptionPane.showMessageDialog(null, "El Cliente se ha Modificado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
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
				TFNombre.setText("Introduce el Nombre");
				TFTEl.setText("Introduce el Telefono");
				TFDIR.setText("Introduzca su Direccion");
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
