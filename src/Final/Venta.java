package Final;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Venta extends JPanel {
	private JTable table;
	private JTextField TFNombre;
	private JTextField TFTel;
	private JTextField TFDir;
	private JTextField TFID;
	private JTextField TFEN;
	private JTextField TFET;
	private JTextField TFEID;
	private JTextField TFPN;
	private JTextField TFPC;
	private JTextField TFPID;
	private JTextField TFPS;
	private JTextField TFFID;
	private JTextField TFFF;

	/**
	 * Create the panel.
	 */
	public Venta() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel LabelFC = new JLabel("Datos Cliente");
		LabelFC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFC.setForeground(new Color(240, 248, 255));
		LabelFC.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFC.setBounds(33, 58, 100, 19);
		PanelCenter.add(LabelFC);
		
		PanelRound FormC = new PanelRound();
		FormC.setBorder(null);
		FormC.setRoundTopRight(45);
		FormC.setRoundTopLeft(45);
		FormC.setRoundBottomRight(45);
		FormC.setRoundBottomLeft(45);
		FormC.setBackground(new Color(40, 40, 40));
		FormC.setBounds(10, 79, 430, 145);
		PanelCenter.add(FormC);
		FormC.setLayout(null);
		
		JLabel LabelFCI = new JLabel("ID Cliente");
		LabelFCI.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFCI.setForeground(new Color(240, 248, 255));
		LabelFCI.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFCI.setBounds(239, 11, 100, 19);
		FormC.add(LabelFCI);
		
		JLabel LabelFCN = new JLabel("Nombre");
		LabelFCN.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFCN.setForeground(new Color(240, 248, 255));
		LabelFCN.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFCN.setBounds(10, 11, 100, 19);
		FormC.add(LabelFCN);
		
		JLabel LabelFCT = new JLabel("Telefono");
		LabelFCT.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFCT.setForeground(new Color(240, 248, 255));
		LabelFCT.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFCT.setBounds(10, 51, 100, 19);
		FormC.add(LabelFCT);
		
		JLabel LabelFCDir = new JLabel("Direccion");
		LabelFCDir.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFCDir.setForeground(new Color(240, 248, 255));
		LabelFCDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFCDir.setBounds(10, 91, 100, 19);
		FormC.add(LabelFCDir);
		
		TFNombre = new JTextField();
	
		TFNombre.setBorder(null);
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setBackground(new Color(41, 41, 41));
		TFNombre.setForeground(new Color(169, 169, 169));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFNombre.setBounds(69, 11, 141, 20);
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
		FormC.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFTel = new JTextField();
		TFTel.setBorder(null);
		TFTel.setText("Introduzca el Telefono");
		TFTel.setHorizontalAlignment(SwingConstants.CENTER);
		TFTel.setForeground(new Color(169, 169, 169));
		TFTel.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFTel.setColumns(10);
		TFTel.setBackground(new Color(41, 41, 41));
		TFTel.setBounds(69, 51, 134, 20);
		TFTel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				if(TFTel.getText().equals("Introduzca el Telefono")) 
				{
					TFTel.setText("");
					TFTel.setForeground(Color.WHITE);
				}
			}
		});
		FormC.add(TFTel);
		
		TFDir = new JTextField();
		TFDir.setBorder(null);
		TFDir.setText("Introduzca la Direccion");
		TFDir.setHorizontalAlignment(SwingConstants.CENTER);
		TFDir.setForeground(new Color(169, 169, 169));
		TFDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFDir.setColumns(10);
		TFDir.setBackground(new Color(41, 41, 41));
		TFDir.setBounds(69, 93, 134, 20);
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
		FormC.add(TFDir);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(105, 105, 105));
		separator.setBounds(69, 115, 134, 2);
		FormC.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(105, 105, 105));
		separator_1.setBounds(69, 73, 134, 2);
		FormC.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(0, 0, 0));
		separator_1_1.setBackground(new Color(105, 105, 105));
		separator_1_1.setBounds(69, 33, 134, 2);
		FormC.add(separator_1_1);
		
		
		TFID = new JTextField();
		TFID.setBorder(null);
		TFID.setText("ID");
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setForeground(new Color(169, 169, 169));
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFID.setColumns(10);
		TFID.setBackground(new Color(41, 41, 41));
		TFID.setBounds(324, 11, 96, 20);
		TFID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFID.getText().equals("ID")) 
				{
					TFID.setText("");
					TFID.setForeground(Color.WHITE);
				}
			}
		});
		FormC.add(TFID);
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(105, 105, 105));
		separator_2.setBounds(320, 33, 100, 2);
		FormC.add(separator_2);
		
		JLabel LabelTop = new JLabel("Ventas");
		LabelTop.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTop.setForeground(Color.WHITE);
		LabelTop.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		LabelTop.setBounds(0, 0, 757, 68);
		PanelCenter.add(LabelTop);
		
		PanelRound FormF = new PanelRound();
		FormF.setBorder(null);
		FormF.setRoundTopRight(45);
		FormF.setRoundTopLeft(45);
		FormF.setRoundBottomRight(45);
		FormF.setRoundBottomLeft(45);
		FormF.setBackground(new Color(40, 40, 40));
		FormF.setBounds(10, 248, 269, 120);
		PanelCenter.add(FormF);
		FormF.setLayout(null);
		
		JLabel LabelIDF = new JLabel("ID Factura");
		LabelIDF.setHorizontalAlignment(SwingConstants.LEFT);
		LabelIDF.setForeground(new Color(240, 248, 255));
		LabelIDF.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelIDF.setBounds(10, 11, 100, 19);
		FormF.add(LabelIDF);
		
		TFFID = new JTextField();
		TFFID.setText("ID");
		TFFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFFID.setForeground(new Color(169, 169, 169));
		TFFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFFID.setColumns(10);
		TFFID.setBorder(null);
		TFFID.setBackground(new Color(41, 41, 41));
		TFFID.setBounds(95, 11, 96, 20);
		TFFID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFFID.getText().equals("ID")) 
				{
					TFFID.setText("");
					TFFID.setForeground(Color.WHITE);
				}
			}
		});
		FormF.add(TFFID);
		JSeparator separator_2_2_2 = new JSeparator();
		separator_2_2_2.setForeground(Color.BLACK);
		separator_2_2_2.setBackground(SystemColor.controlDkShadow);
		separator_2_2_2.setBounds(91, 33, 100, 2);
		FormF.add(separator_2_2_2);
		
		JLabel LabelFecha = new JLabel("Fecha ");
		LabelFecha.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFecha.setForeground(new Color(240, 248, 255));
		LabelFecha.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFecha.setBounds(10, 45, 68, 19);
		FormF.add(LabelFecha);
		
		TFFF = new JTextField();
		TFFF.setText("Fecha");
		TFFF.setHorizontalAlignment(SwingConstants.CENTER);
		TFFF.setForeground(new Color(169, 169, 169));
		TFFF.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFFF.setColumns(10);
		TFFF.setBorder(null);
		TFFF.setBackground(new Color(41, 41, 41));
		TFFF.setBounds(74, 46, 96, 20);
		TFFF.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFFF.getText().equals("Fecha")) 
				{
					TFFF.setText("");
					TFFF.setForeground(Color.WHITE);
				}
			}
		});
		FormF.add(TFFF);
		
		JSeparator separator_2_2_1_1 = new JSeparator();
		separator_2_2_1_1.setForeground(Color.BLACK);
		separator_2_2_1_1.setBackground(SystemColor.controlDkShadow);
		separator_2_2_1_1.setBounds(70, 68, 100, 2);
		FormF.add(separator_2_2_1_1);
		
		JLabel LabelTP = new JLabel("Tipo de Pago");
		LabelTP.setHorizontalAlignment(SwingConstants.LEFT);
		LabelTP.setForeground(new Color(240, 248, 255));
		LabelTP.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelTP.setBounds(10, 81, 93, 19);
		FormF.add(LabelTP);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(128, 128, 128));
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta de Credito", "Cuotas"}));
		comboBox.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		comboBox.setBounds(102, 82, 100, 22);
		FormF.add(comboBox);
		
		PanelRound FormP = new PanelRound();
		FormP.setBorder(null);
		FormP.setRoundTopRight(45);
		FormP.setRoundTopLeft(45);
		FormP.setRoundBottomRight(45);
		FormP.setRoundBottomLeft(45);
		FormP.setBackground(new Color(40, 40, 40));
		FormP.setBounds(289, 248, 468, 120);
		PanelCenter.add(FormP);
		FormP.setLayout(null);
		
		JLabel LabelPr = new JLabel("ID Producto");
		LabelPr.setHorizontalAlignment(SwingConstants.LEFT);
		LabelPr.setForeground(new Color(240, 248, 255));
		LabelPr.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelPr.setBounds(249, 29, 100, 19);
		FormP.add(LabelPr);
		
		JLabel LabelPN = new JLabel("Nombre");
		LabelPN.setHorizontalAlignment(SwingConstants.LEFT);
		LabelPN.setForeground(new Color(240, 248, 255));
		LabelPN.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelPN.setBounds(20, 29, 100, 19);
		FormP.add(LabelPN);
		
		JLabel LabelPC = new JLabel("Cantidad");
		LabelPC.setHorizontalAlignment(SwingConstants.LEFT);
		LabelPC.setForeground(new Color(240, 248, 255));
		LabelPC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelPC.setBounds(20, 69, 100, 19);
		FormP.add(LabelPC);
		
		TFPN = new JTextField();
		TFPN.setText("Introduzca el Nombre");
		TFPN.setHorizontalAlignment(SwingConstants.CENTER);
		TFPN.setForeground(new Color(169, 169, 169));
		TFPN.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFPN.setColumns(10);
		TFPN.setBorder(null);
		TFPN.setBackground(new Color(41, 41, 41));
		TFPN.setBounds(79, 29, 141, 20);
		TFPN.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFPN.getText().equals("Introduzca el Nombre")) 
				{
					TFPN.setText("");
					TFPN.setForeground(Color.WHITE);
				}
			}
		});
		FormP.add(TFPN);
		
		
		TFPC = new JTextField();
		TFPC.setText("Introduzca la Cantidad");
		TFPC.setHorizontalAlignment(SwingConstants.CENTER);
		TFPC.setForeground(new Color(169, 169, 169));
		TFPC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFPC.setColumns(10);
		TFPC.setBorder(null);
		TFPC.setBackground(new Color(41, 41, 41));
		TFPC.setBounds(79, 69, 134, 20);
		TFPC.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFPC.getText().equals("Introduzca la Cantidad")) 
				{
					TFPC.setText("");
					TFPC.setForeground(Color.WHITE);
				}
			}
		});
		FormP.add(TFPC);
		

		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setForeground(Color.BLACK);
		separator_1_3.setBackground(SystemColor.controlDkShadow);
		separator_1_3.setBounds(79, 91, 134, 2);
		FormP.add(separator_1_3);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setForeground(Color.BLACK);
		separator_1_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_1_2.setBounds(79, 51, 134, 2);
		FormP.add(separator_1_1_2);
		
		TFPID = new JTextField();
		TFPID.setText("ID");
		TFPID.setHorizontalAlignment(SwingConstants.CENTER);
		TFPID.setForeground(new Color(169, 169, 169));
		TFPID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFPID.setColumns(10);
		TFPID.setBorder(null);
		TFPID.setBackground(new Color(41, 41, 41));
		TFPID.setBounds(334, 29, 96, 20);
		TFPID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFPID.getText().equals("ID")) 
				{
					TFPID.setText("");
					TFPID.setForeground(Color.WHITE);
				}
			}
		});
		FormP.add(TFPID);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBackground(SystemColor.controlDkShadow);
		separator_2_2.setBounds(330, 51, 100, 2);
		FormP.add(separator_2_2);
		
		JLabel LabelS = new JLabel("Stock");
		LabelS.setHorizontalAlignment(SwingConstants.LEFT);
		LabelS.setForeground(new Color(240, 248, 255));
		LabelS.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelS.setBounds(281, 69, 68, 19);
		FormP.add(LabelS);
		
		TFPS = new JTextField();
		TFPS.setText("Stock");
		TFPS.setHorizontalAlignment(SwingConstants.CENTER);
		TFPS.setForeground(new Color(169, 169, 169));
		TFPS.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFPS.setColumns(10);
		TFPS.setBorder(null);
		TFPS.setBackground(new Color(41, 41, 41));
		TFPS.setBounds(344, 69, 96, 20);
		TFPS.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFPS.getText().equals("Stock")) 
				{
					TFPS.setText("");
					TFPS.setForeground(Color.WHITE);
				}
			}
		});
		FormP.add(TFPS);
		
		JSeparator separator_2_2_1 = new JSeparator();
		separator_2_2_1.setForeground(Color.BLACK);
		separator_2_2_1.setBackground(SystemColor.controlDkShadow);
		separator_2_2_1.setBounds(340, 91, 100, 2);
		FormP.add(separator_2_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(10, 379, 621, 294);
		PanelCenter.add(scrollPane);
		
		table = new JTable();
		table.setGridColor(Color.WHITE);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setFont(new Font("Poiret One", Font.PLAIN, 16));
		table.setBorder(null);
		table.setBackground(new Color(30,30, 30));
		table.getTableHeader().setBackground(new Color(30,30,30));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		table.getTableHeader().setEnabled(false);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Producto", "Cantidad", "Precio Unidad", "Costo Total"
				}
			));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
	
		scrollPane.setViewportView(table);
		
		PanelRound BTNG = new PanelRound();
		BTNG.setBorder(null);
		BTNG.setRoundTopRight(45);
		BTNG.setRoundTopLeft(45);
		BTNG.setRoundBottomRight(45);
		BTNG.setRoundBottomLeft(45);
		BTNG.setBackground(new Color(30, 30, 30));
		BTNG.setBounds(651, 445, 119, 49);
		PanelCenter.add(BTNG);
		BTNG.setLayout(null);
		
		JLabel LabelGuardar = new JLabel("Guardar");
		LabelGuardar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelGuardar.setForeground(new Color(240, 255, 240));
		LabelGuardar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelGuardar.setBounds(10, 0, 109, 49);
		BTNG.add(LabelGuardar);
		
		PanelRound BTNC = new PanelRound();
		BTNC.setBorder(null);
		BTNC.setRoundTopRight(45);
		BTNC.setRoundTopLeft(45);
		BTNC.setRoundBottomRight(45);
		BTNC.setRoundBottomLeft(45);
		BTNC.setBackground(new Color(30, 30, 30));
		BTNC.setBounds(651, 505, 119, 49);
		PanelCenter.add(BTNC);
		BTNC.setLayout(null);
		
		JLabel LabelBorrar = new JLabel("Borrar");
		LabelBorrar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBorrar.setForeground(new Color(240, 255, 240));
		LabelBorrar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelBorrar.setBounds(10, 0, 109, 49);
		BTNC.add(LabelBorrar);
		
		PanelRound BTNI = new PanelRound();
		BTNI.setBorder(null);
		BTNI.setRoundTopRight(45);
		BTNI.setRoundTopLeft(45);
		BTNI.setRoundBottomRight(45);
		BTNI.setRoundBottomLeft(45);
		BTNI.setBackground(new Color(30, 30, 30));
		BTNI.setBounds(651, 565, 119, 49);
		PanelCenter.add(BTNI);
		BTNI.setLayout(null);
		
		JLabel LabelImprimir = new JLabel("Imprimir");
		LabelImprimir.setHorizontalAlignment(SwingConstants.CENTER);
		LabelImprimir.setForeground(new Color(240, 255, 240));
		LabelImprimir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelImprimir.setBounds(10, 0, 109, 49);
		BTNI.add(LabelImprimir);
		
		JLabel LabelFF = new JLabel("Datos Factura");
		LabelFF.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFF.setForeground(new Color(240, 248, 255));
		LabelFF.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFF.setBounds(33, 228, 100, 19);
		PanelCenter.add(LabelFF);
		
		JLabel LabelFP = new JLabel("Datos Producto");
		LabelFP.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFP.setForeground(new Color(240, 248, 255));
		LabelFP.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFP.setBounds(618, 228, 100, 19);
		PanelCenter.add(LabelFP);
		
		PanelRound FormC_1 = new PanelRound();
		FormC_1.setLayout(null);
		FormC_1.setRoundTopRight(45);
		FormC_1.setRoundTopLeft(45);
		FormC_1.setRoundBottomRight(45);
		FormC_1.setRoundBottomLeft(45);
		FormC_1.setBorder(null);
		FormC_1.setBackground(new Color(40, 40, 40));
		FormC_1.setBounds(463, 79, 294, 145);
		PanelCenter.add(FormC_1);
		
		JLabel LabelFEID = new JLabel("ID Cliente");
		LabelFEID.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFEID.setForeground(new Color(240, 248, 255));
		LabelFEID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFEID.setBounds(10, 45, 100, 19);
		FormC_1.add(LabelFEID);
		
		JLabel LabelFEN = new JLabel("Nombre");
		LabelFEN.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFEN.setForeground(new Color(240, 248, 255));
		LabelFEN.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFEN.setBounds(10, 11, 100, 19);
		FormC_1.add(LabelFEN);
		
		JLabel LabelFET = new JLabel("Telefono");
		LabelFET.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFET.setForeground(new Color(240, 248, 255));
		LabelFET.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFET.setBounds(10, 89, 100, 19);
		FormC_1.add(LabelFET);
		
		TFEN = new JTextField();
		TFEN.setText("Introduzca el Nombre");
		TFEN.setHorizontalAlignment(SwingConstants.CENTER);
		TFEN.setForeground(new Color(169, 169, 169));
		TFEN.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFEN.setColumns(10);
		TFEN.setBorder(null);
		TFEN.setBackground(new Color(41, 41, 41));
		TFEN.setBounds(69, 11, 186, 20);
		TFEN.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFEN.getText().equals("Introduzca el Nombre")) 
				{
					TFEN.setText("");
					TFEN.setForeground(Color.WHITE);
				}
			}
		});
		FormC_1.add(TFEN);
		
		TFET = new JTextField();
		TFET.setText("Introduzca el Telefono");
		TFET.setHorizontalAlignment(SwingConstants.CENTER);
		TFET.setForeground(new Color(169, 169, 169));
		TFET.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFET.setColumns(10);
		TFET.setBorder(null);
		TFET.setBackground(new Color(41, 41, 41));
		TFET.setBounds(69, 89, 169, 20);
		TFET.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFET.getText().equals("Introduzca el Telefono")) 
				{
					TFET.setText("");
					TFET.setForeground(Color.WHITE);
				}
			}
		});
		FormC_1.add(TFET);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(69, 111, 169, 2);
		FormC_1.add(separator_1_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1.setBounds(69, 33, 169, 2);
		FormC_1.add(separator_1_1_1);
		
		TFEID = new JTextField();
		TFEID.setText("ID");
		TFEID.setHorizontalAlignment(SwingConstants.CENTER);
		TFEID.setForeground(new Color(169, 169, 169));
		TFEID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 14));
		TFEID.setColumns(10);
		TFEID.setBorder(null);
		TFEID.setBackground(new Color(41, 41, 41));
		TFEID.setBounds(89, 46, 96, 20);
		TFEID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFEID.getText().equals("ID")) 
				{
					TFEID.setText("");
					TFEID.setForeground(Color.WHITE);
				}
			}
		});
		FormC_1.add(TFEID);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(SystemColor.controlDkShadow);
		separator_2_1.setBounds(85, 68, 100, 2);
		FormC_1.add(separator_2_1);
		
		JLabel LabelFE = new JLabel("Datos Empleado");
		LabelFE.setHorizontalAlignment(SwingConstants.LEFT);
		LabelFE.setForeground(new Color(240, 248, 255));
		LabelFE.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelFE.setBounds(618, 58, 100, 19);
		PanelCenter.add(LabelFE);

	}
}
