package Final;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.SystemColor;

public class VentanaPrincipal {

	int xMouse,yMouse;
	
	private JFrame frame;
	private JLabel LabelCl;
	private PanelRound BTNExit;
    private JPanel PanelCenter; 
	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();
	DefaultTableModel modelo = new DefaultTableModel();;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPrincipal() {
		initialize();
	}
	
	private void CambiarPanel(JPanel P) 
	{
		
	    P.setSize(780, 684);
		P.setLocation(0, 0);
		
		PanelCenter.removeAll();
		PanelCenter.add(P,BorderLayout.CENTER);
		PanelCenter.revalidate();
		PanelCenter.repaint();
			
	}


	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		frame.setBounds(100, 100, 1000, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		PanelRound PanelPrincipal = new PanelRound();
		PanelPrincipal.setBackground(new Color(82, 117, 144));
		PanelPrincipal.setRoundBottomLeft(45);
		PanelPrincipal.setRoundBottomRight(45);
		PanelPrincipal.setRoundTopLeft(45);
		PanelPrincipal.setRoundTopRight(45);
		PanelPrincipal.setBackground(Color.BLACK);
		PanelPrincipal.setBounds(0, 0, 1000, 780);
		frame.getContentPane().add(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		PanelRound  Home = new PanelRound();
		Home.setBorder(null);
		Home.setBackground(new Color( 30, 30, 30));
		Home.setBounds(200, 0, 800, 780);
		Home.setRoundBottomLeft(45);
		Home.setRoundTopLeft(45);
		Home.setRoundTopRight(45);
		Home.setRoundBottomRight(45);
		PanelPrincipal.add(Home);
		Home.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(113, 113, 113));
		separator.setForeground(new Color(113, 113, 113));
		separator.setBounds(21, 75, 756, 2);
		Home.add(separator);
		
		JLabel LabelLoc = new JLabel("Inicio");
		LabelLoc.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelLoc.setForeground(Color.WHITE);
		LabelLoc.setBounds(21, 31, 142, 33);
		Home.add(LabelLoc);
		
		ImageIcon UserIc = new ImageIcon("Media/User.png");
		JLabel UserLabel = new JLabel("User_Admin");
		UserLabel.setForeground(Color.WHITE);
		UserLabel.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		UserLabel.setBounds(615, 34, 162, 33);
		UserLabel.setIcon(new ImageIcon(UserIc.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		Home.add(UserLabel);
		
		PanelCenter = new JPanel();
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(10, 85, 780, 684);
		Home.add(PanelCenter);
		PanelCenter.setLayout(null);
		
		JLabel LabelTop = new JLabel("Bienvenido");
		LabelTop.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTop.setForeground(Color.WHITE);
		LabelTop.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		LabelTop.setBounds(0, 0, 780, 68);
		PanelCenter.add(LabelTop);
		
		JLabel LabelACR = new JLabel("Actividad Reciente");
		LabelACR.setHorizontalAlignment(SwingConstants.CENTER);
		LabelACR.setForeground(Color.WHITE);
		LabelACR.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 20));
		LabelACR.setBounds(0, 95, 780, 68);
		PanelCenter.add(LabelACR);
		
		PanelRound PanelAc = new PanelRound();
		PanelAc.setBackground(new Color(82, 117, 144));
		PanelAc.setRoundBottomLeft(45);
		PanelAc.setRoundBottomRight(45);
		PanelAc.setRoundTopLeft(45);
		PanelAc.setRoundTopRight(45);
		PanelAc.setBounds(108, 231, 256, 160);
		PanelCenter.add(PanelAc);
		PanelAc.setLayout(null);
		
		JLabel LabelVH = new JLabel("Ventas Hoy");
		LabelVH.setForeground(new Color(253, 245, 230));
		LabelVH.setHorizontalAlignment(SwingConstants.CENTER);
		LabelVH.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelVH.setBounds(0, 0, 256, 45);
		PanelAc.add(LabelVH);
		
		PanelRound PanelAc1 = new PanelRound();
		PanelAc1.setRoundBottomLeft(45);
		PanelAc1.setRoundBottomRight(45);
		PanelAc1.setRoundTopLeft(45);
		PanelAc1.setRoundTopRight(45);
		PanelAc1.setBounds(408, 231, 256, 160);
		PanelAc1.setBackground(new Color(81, 124, 99));
		PanelCenter.add(PanelAc1);
		PanelAc1.setLayout(null);
		
		JLabel lblGananciasTotalesHoy = new JLabel("Ganancias Totales Hoy");
		lblGananciasTotalesHoy.setForeground(new Color(253, 245, 230));
		lblGananciasTotalesHoy.setHorizontalAlignment(SwingConstants.CENTER);
		lblGananciasTotalesHoy.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		lblGananciasTotalesHoy.setBounds(0, 0, 256, 45);
		PanelAc1.add(lblGananciasTotalesHoy);
		

		PanelRound PanelAc3 = new PanelRound();
		PanelAc3.setRoundBottomLeft(45);
		PanelAc3.setRoundBottomRight(45);
		PanelAc3.setRoundTopLeft(45);
		PanelAc3.setRoundTopRight(45);
		PanelAc3.setBackground(new Color(246, 198, 169));
		PanelAc3.setBounds(408, 419, 256, 160);
		PanelCenter.add(PanelAc3);
		PanelAc3.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gastos Totales Hoy");
		lblNewLabel_1_1_1.setForeground(new Color(253, 245, 230));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(0, 0, 256, 45);
		PanelAc3.add(lblNewLabel_1_1_1);
		
		PanelRound PanelAC2 = new PanelRound();
		PanelAC2.setRoundBottomLeft(45);
		PanelAC2.setRoundBottomRight(45);
		PanelAC2.setRoundTopLeft(45);
		PanelAC2.setRoundTopRight(45);
		PanelAC2.setBackground(new Color(214, 117, 115));
		PanelAC2.setBounds(108, 419, 256, 160);
		PanelCenter.add(PanelAC2);
		PanelAC2.setLayout(null);
		JLabel LabelCobrar = new JLabel("Cuentas Pendientes Para Hoy");
		LabelCobrar.setForeground(new Color(253, 245, 230));
		LabelCobrar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCobrar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelCobrar.setBounds(0, 0, 256, 45);
		PanelAC2.add(LabelCobrar);
		
		JPanel Bar = new JPanel();
		Bar.setBackground(new Color(138, 221,45, 0));
		Bar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) 
			{
				int x= e.getXOnScreen();
				int y = e.getYOnScreen();
				frame.setLocation(x-xMouse, y-yMouse);
			}
		});
		Bar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				xMouse=e.getX();
				yMouse=e.getY(); 
			}
		});
		Bar.setBounds(22, 0, 952, 22);
		PanelPrincipal.add(Bar);
		
		JSeparator SeparatorIn1 = new JSeparator();
		SeparatorIn1.setForeground(new Color(44, 44, 44));
		SeparatorIn1.setBackground(new Color(44, 44, 44));
		SeparatorIn1.setBounds(31, 672, 128, 2);
		PanelPrincipal.add(SeparatorIn1);
		
		BTNExit = new PanelRound();
		BTNExit.setRoundBottomLeft(30);
		BTNExit.setRoundBottomRight(30);
		BTNExit.setRoundTopLeft(30);
		BTNExit.setRoundTopRight(30);
		BTNExit.setBackground(Color.BLACK);
		BTNExit.setBounds(32, 685, 136, 45);
		
		BTNExit.setLayout(null);
		
		ImageIcon Ic1 = new ImageIcon("Media/cerrar-sesion.png");
		JLabel ExitL = new JLabel("Cerrar Sesion ");
		ExitL.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		ExitL.setHorizontalAlignment(SwingConstants.LEFT);
		ExitL.setForeground(new Color(255, 255, 255));
		ExitL.setIcon(new ImageIcon(Ic1.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		ExitL.setBounds(10, 0, 126, 45);
		BTNExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNExit.setBackground(new Color(41, 41, 41 ));
				ImageIcon Ic1 = new ImageIcon("Media/Cerrar sesion E.png");
				ExitL.setIcon(new ImageIcon(Ic1.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon Ic1 = new ImageIcon("Media/cerrar-sesion.png");
				ExitL.setIcon(new ImageIcon(Ic1.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNExit.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		BTNExit.add(ExitL);
		PanelPrincipal.add(BTNExit);
		
		JSeparator SeparatorIn1_1 = new JSeparator();
		SeparatorIn1_1.setForeground(new Color(44, 44, 44));
		SeparatorIn1_1.setBackground(new Color(44, 44, 44));
		SeparatorIn1_1.setBounds(31, 206, 128, 2);
		PanelPrincipal.add(SeparatorIn1_1);
		
		PanelRound BTNInicio = new PanelRound();
		BTNInicio.setRoundBottomLeft(30);
		BTNInicio.setRoundBottomRight(30);
		BTNInicio.setRoundTopLeft(30);
		BTNInicio.setRoundTopRight(30);
		BTNInicio.setLayout(null);
		BTNInicio.setBackground(Color.BLACK);
		BTNInicio.setBounds(32, 90, 128, 45);
		ImageIcon ICI = new ImageIcon("Media/Inicio.PNG");
		JLabel LabelIn = new JLabel("Inicio");
		LabelIn.setHorizontalAlignment(SwingConstants.LEFT);
		LabelIn.setForeground(new Color(255, 255, 255));
		LabelIn.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelIn.setBounds(10, 0, 118, 45);
		LabelIn.setIcon(new ImageIcon(ICI.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		BTNInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNInicio.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICI = new ImageIcon("Media/Inicio E.PNG");
				LabelIn.setIcon(new ImageIcon(ICI.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICI = new ImageIcon("Media/Inicio.PNG");
				LabelIn.setIcon(new ImageIcon(ICI.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNInicio.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Inicio p = new Inicio();
				CambiarPanel(p);
				LabelLoc.setText("Inicio");
			}
		});
		BTNInicio.add(LabelIn);
		PanelPrincipal.add(BTNInicio);
		
		
		PanelRound BTNACT = new PanelRound();
		BTNACT.setRoundBottomLeft(30);
		BTNACT.setRoundBottomRight(30);
		BTNACT.setRoundTopLeft(30);
		BTNACT.setRoundTopRight(30);
		BTNACT.setLayout(null);
		BTNACT.setBackground(Color.BLACK);
		BTNACT.setBounds(22, 219, 137, 45);
		ImageIcon ICF = new ImageIcon("Media/Factura.PNG");
		JLabel LabelAct = new JLabel("Facturas");
		LabelAct.setHorizontalAlignment(SwingConstants.LEFT);
		LabelAct.setForeground(new Color(255, 255, 255));
		LabelAct.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelAct.setBounds(10, 0, 127, 45);
		LabelAct.setIcon(new ImageIcon(ICF.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH))); 
		BTNACT.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) 
			{
				BTNACT.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICF = new ImageIcon("Media/Factura E.PNG");
				LabelAct.setIcon(new ImageIcon(ICF.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICF = new ImageIcon("Media/Factura.PNG");
				LabelAct.setIcon(new ImageIcon(ICF.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH))); 
				BTNACT.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				FacturasPanel p = new FacturasPanel();
				CambiarPanel(p); 
				LabelLoc.setText("Facturas");
				
			}
		});
		BTNACT.add(LabelAct);
		PanelPrincipal.add(BTNACT);
		
		
		PanelRound BTNEmp = new PanelRound();
		BTNEmp.setRoundBottomLeft(30);
		BTNEmp.setRoundBottomRight(30);
		BTNEmp.setRoundTopLeft(30);
		BTNEmp.setRoundTopRight(30);
		BTNEmp.setLayout(null);
		BTNEmp.setBackground(Color.BLACK);
		BTNEmp.setBounds(22, 275, 137, 45);
		ImageIcon ICE = new ImageIcon("Media/Empleados.png");
		JLabel LabelEmp = new JLabel("Personal");
		LabelEmp.setHorizontalAlignment(SwingConstants.LEFT);
		LabelEmp.setForeground(new Color(255, 255, 255));
		LabelEmp.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelEmp.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		LabelEmp.setBounds(10, 0, 127, 45);
		BTNEmp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNEmp.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICE = new ImageIcon("Media/Empleados E.png");
				LabelEmp.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICE = new ImageIcon("Media/Empleados.png");
				LabelEmp.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNEmp.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				PersonalPanel p = new PersonalPanel();
                modelo = (DefaultTableModel) p.table.getModel();
				
				try {
					Object[] Filas = new Object[6];
					
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					rs= STM.executeQuery("SELECT * FROM Personal"); 
					
					while(rs.next()) 
					{
						Filas[0]=rs.getInt("IdPersonal");
						Filas[1]=rs.getString("Nombre");
						Filas[2]=rs.getString("Telefono");
						Filas[3]=rs.getString("Direccion");
						Filas[4]=rs.getString("Rol");
						Filas[5]=rs.getString("Cedula");
						modelo.addRow(Filas); 
						
					}
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
				
				p.table.setModel(modelo);
				CambiarPanel(p);
				LabelLoc.setText("Personal");
				
			}
		});
		BTNEmp.add(LabelEmp);
		PanelPrincipal.add(BTNEmp);
		
		
	
		PanelRound BTNCln = new PanelRound();
		BTNCln.setRoundBottomLeft(30);
		BTNCln.setRoundBottomRight(30);
		BTNCln.setRoundTopLeft(30);
		BTNCln.setRoundTopRight(30);
		BTNCln.setLayout(null);
		BTNCln.setBackground(Color.BLACK);
		BTNCln.setBounds(22, 333, 137, 45);
		ImageIcon ICC = new ImageIcon("Media/Clientes.png");
		LabelCl = new JLabel("Clientes");
		LabelCl.setHorizontalAlignment(SwingConstants.LEFT);
		LabelCl.setForeground(new Color(255, 255, 255));
		LabelCl.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelCl.setBounds(10, 0, 127, 45);
		LabelCl.setIcon(new ImageIcon(ICC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNCln.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNCln.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICC = new ImageIcon("Media/Clientes E.png");
				LabelCl.setIcon(new ImageIcon(ICC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));  
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICC = new ImageIcon("Media/Clientes.png");
				LabelCl.setIcon(new ImageIcon(ICC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));  
				BTNCln.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Clientes p = new Clientes();
                modelo = (DefaultTableModel) p.table.getModel();
				
				try {
					Object[] Filas = new Object[5];
					
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					rs= STM.executeQuery("SELECT * FROM Cliente"); 
					
					while(rs.next()) 
					{
						Filas[0]=rs.getInt("IdCliente");
						Filas[1]=rs.getString("Nombre");
						Filas[2]=rs.getString("Telefono");
						Filas[3]=rs.getString("Direccion");
						Filas[4]=rs.getString("Cedula");
						modelo.addRow(Filas); 
						
					}
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
				
				p.table.setModel(modelo);
				CambiarPanel(p);
				LabelLoc.setText("Clientes");
				
			}
		});	
		BTNCln.add(LabelCl);
		PanelPrincipal.add(BTNCln);
		
		
	
		PanelRound BTNPrv = new PanelRound();
		BTNPrv.setRoundBottomLeft(30);
		BTNPrv.setRoundBottomRight(30);
		BTNPrv.setRoundTopLeft(30);
		BTNPrv.setRoundTopRight(30);
		BTNPrv.setLayout(null);
		BTNPrv.setBackground(Color.BLACK);
		BTNPrv.setBounds(22, 389, 137, 45);
		ImageIcon ICP = new ImageIcon("Media/ProveedorB.png");
		JLabel LabelPrv = new JLabel("Proveedor ");
		LabelPrv.setHorizontalAlignment(SwingConstants.LEFT);
		LabelPrv.setForeground(new Color(255, 255, 255));
		LabelPrv.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelPrv.setBounds(10, 0, 128, 45);
		LabelPrv.setIcon(new ImageIcon(ICP.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNPrv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNPrv.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICP = new ImageIcon("Media/ProveedorB E.png");
				LabelPrv.setIcon(new ImageIcon(ICP.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICP = new ImageIcon("Media/ProveedorB.png");
				LabelPrv.setIcon(new ImageIcon(ICP.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNPrv.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Proveedores p = new Proveedores();
                modelo = (DefaultTableModel) p.table.getModel();
				
				try {
					Object[] Filas = new Object[5];
					
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					rs= STM.executeQuery("SELECT * FROM Proveedor"); 
					
					while(rs.next()) 
					{
						Filas[0]=rs.getInt("IdProveedor");
						Filas[1]=rs.getString("Nombre");
						Filas[2]=rs.getString("RNC");
						Filas[3]=rs.getString("Telefono");
						Filas[4]=rs.getString("Direccion");
						modelo.addRow(Filas); 
						
					}
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
				
				p.table.setModel(modelo);
				CambiarPanel(p);
				LabelLoc.setText("Proveedores");
				
			}
		});	
		BTNPrv.add(LabelPrv);
		PanelPrincipal.add(BTNPrv);
		
		
		PanelRound BTNProducto = new PanelRound();
		BTNProducto.setRoundBottomLeft(30);
		BTNProducto.setRoundBottomRight(30);
		BTNProducto.setRoundTopLeft(30);
		BTNProducto.setRoundTopRight(30);
		BTNProducto.setLayout(null);
		BTNProducto.setBackground(Color.BLACK);
		BTNProducto.setBounds(22, 445, 137, 45);
		ImageIcon ICPD = new ImageIcon("Media/producto.png");
		JLabel LabelPrd = new JLabel("Prdouctos");
		LabelPrd.setHorizontalAlignment(SwingConstants.LEFT);
		LabelPrd.setForeground(new Color(255, 255, 255));
		LabelPrd.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelPrd.setBounds(10, 0, 127, 45);
		LabelPrd.setIcon(new ImageIcon(ICPD.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNProducto.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICPD = new ImageIcon("Media/Productos E.png");
				LabelPrd.setIcon(new ImageIcon(ICPD.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICPD = new ImageIcon("Media/producto.png");
				LabelPrd.setIcon(new ImageIcon(ICPD.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNProducto.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				ProductosPanel p = new ProductosPanel();
				CambiarPanel(p); 
				LabelLoc.setText("Productos");
			}
		});
		BTNProducto.add(LabelPrd);
		PanelPrincipal.add(BTNProducto);
		
		
		PanelRound BTNGastos = new PanelRound();
		BTNGastos.setRoundBottomLeft(30);
		BTNGastos.setRoundBottomRight(30);
		BTNGastos.setRoundTopLeft(30);
		BTNGastos.setRoundTopRight(30);
		BTNGastos.setLayout(null);
		BTNGastos.setBackground(Color.BLACK);
		BTNGastos.setBounds(22, 504, 137, 45);
		ImageIcon IGS = new ImageIcon("Media/Gastos.png"); 
		JLabel LabelGs = new JLabel("Gastos");
		LabelGs.setHorizontalAlignment(SwingConstants.LEFT);
		LabelGs.setForeground(new Color(255, 255, 255));
		LabelGs.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelGs.setBounds(10, 0, 127, 45);
		LabelGs.setIcon(new ImageIcon(IGS.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		BTNGastos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNGastos.setBackground(new Color(41, 41, 41 ));
				ImageIcon IGS = new ImageIcon("Media/Gastos E.png"); 
				LabelGs.setIcon(new ImageIcon(IGS.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon IGS = new ImageIcon("Media/Gastos.png"); 
				LabelGs.setIcon(new ImageIcon(IGS.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNGastos.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				Gastos p = new Gastos();
				CambiarPanel(p);
				LabelLoc.setText("Gastos");
			}
		});
		BTNGastos.add(LabelGs);
		PanelPrincipal.add(BTNGastos);
		
		
		PanelRound BTNCPC = new PanelRound();
		BTNCPC.setRoundBottomLeft(30);
		BTNCPC.setRoundBottomRight(30);
		BTNCPC.setRoundTopLeft(30);
		BTNCPC.setRoundTopRight(30);
		BTNCPC.setLayout(null);
		BTNCPC.setBackground(Color.BLACK);
		BTNCPC.setBounds(22, 560, 159, 45);
		ImageIcon ICPC = new ImageIcon("Media/CuentasCob.png");
		JLabel LabelCPC = new JLabel("Cuentas por cobrar");
		LabelCPC.setHorizontalAlignment(SwingConstants.LEFT);
		LabelCPC.setForeground(new Color(255, 255, 255));
		LabelCPC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelCPC.setBounds(10, 0, 149, 45);
		LabelCPC.setIcon(new ImageIcon(ICPC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNCPC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNCPC.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICPC = new ImageIcon("Media/CuentasCob E.png"); 
				LabelCPC.setIcon(new ImageIcon(ICPC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICPC = new ImageIcon("Media/CuentasCob.png");
				LabelCPC.setIcon(new ImageIcon(ICPC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNCPC.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				CuentasPorCobrar p = new CuentasPorCobrar();
				CambiarPanel(p);
				LabelLoc.setText("Cuentas/Cobrar");
			}
		});
		BTNCPC.add(LabelCPC);
		PanelPrincipal.add(BTNCPC);
		
		
		PanelRound BTNStatus = new PanelRound();
		BTNStatus.setRoundBottomLeft(30);
		BTNStatus.setRoundBottomRight(30);
		BTNStatus.setRoundTopLeft(30);
		BTNStatus.setRoundTopRight(30);
		BTNStatus.setLayout(null);
		BTNStatus.setBackground(Color.BLACK);
		BTNStatus.setBounds(22, 616, 136, 45);
		ImageIcon ICST = new ImageIcon("Media/Actividad.PNG");
		JLabel LabelStatus = new JLabel("Estado");
		LabelStatus.setHorizontalAlignment(SwingConstants.LEFT);
		LabelStatus.setForeground(new Color(255, 255, 255));
		LabelStatus.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelStatus.setBounds(10, 0, 126, 45);
		LabelStatus.setIcon(new ImageIcon(ICST.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNStatus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNStatus.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICST = new ImageIcon("Media/Actividad E.PNG");
				LabelStatus.setIcon(new ImageIcon(ICST.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICST = new ImageIcon("Media/Actividad.PNG");
				LabelStatus.setIcon(new ImageIcon(ICST.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNStatus.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				Estado p = new Estado();
				CambiarPanel(p);
				LabelLoc.setText("Estado");
			}
		});
		BTNStatus.add(LabelStatus);
		PanelPrincipal.add(BTNStatus);
		
		ImageIcon Lg = new ImageIcon("Media/Phoenix.Jpg");
		JLabel LabelLogo = new JLabel("Phoenix Phone");
		LabelLogo.setForeground(Color.WHITE);
		LabelLogo.setFont(new Font("Aboreto", Font.ITALIC, 14));
		LabelLogo.setHorizontalAlignment(SwingConstants.CENTER);
		LabelLogo.setBounds(10, 11, 180, 68);
		LabelLogo.setIcon(new ImageIcon(Lg.getImage().getScaledInstance(54, 54, Image.SCALE_SMOOTH)));
		PanelPrincipal.add(LabelLogo);
		
		PanelRound BTNVenta = new PanelRound();
		BTNVenta.setRoundBottomLeft(30);
		BTNVenta.setRoundBottomRight(30);
		BTNVenta.setRoundTopLeft(30);
		BTNVenta.setRoundTopRight(30);
		BTNVenta.setBounds(31, 146, 128, 45);
		BTNVenta.setLayout(null);
		BTNVenta.setRoundTopRight(30);
		BTNVenta.setRoundTopLeft(30);
		BTNVenta.setRoundBottomRight(30);
		BTNVenta.setRoundBottomLeft(30);
		BTNVenta.setBackground(Color.BLACK);
		ImageIcon ICV = new ImageIcon("Media/Venta.png");
		JLabel LabelVentas = new JLabel("Venta");
		LabelVentas.setHorizontalAlignment(SwingConstants.LEFT);
		LabelVentas.setForeground(Color.WHITE);
		LabelVentas.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelVentas.setBounds(10, 0, 118, 45);
		LabelVentas.setIcon(new ImageIcon(ICV.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNVenta.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICV = new ImageIcon("Media/Venta E.png");
				LabelVentas.setIcon(new ImageIcon(ICV.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICV = new ImageIcon("Media/Venta.png");
				LabelVentas.setIcon(new ImageIcon(ICV.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNVenta.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				Venta p = new Venta();
				CambiarPanel(p);
				LabelLoc.setText("Venta");
			}
		});
		BTNVenta.add(LabelVentas);
		PanelPrincipal.add(BTNVenta);
	}
}
